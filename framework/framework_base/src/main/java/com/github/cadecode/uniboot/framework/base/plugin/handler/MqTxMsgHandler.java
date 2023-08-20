package com.github.cadecode.uniboot.framework.base.plugin.handler;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.exceptions.ExceptionUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.github.cadecode.uniboot.common.core.util.AssertUtil;
import com.github.cadecode.uniboot.common.plugin.cache.util.KeyGeneUtil;
import com.github.cadecode.uniboot.common.plugin.cache.util.RedisLockKit;
import com.github.cadecode.uniboot.common.plugin.mq.config.TxMsgProperties.MsgOption;
import com.github.cadecode.uniboot.common.plugin.mq.exception.TxMsgException;
import com.github.cadecode.uniboot.common.plugin.mq.handler.AbstractTxMsgHandler;
import com.github.cadecode.uniboot.common.plugin.mq.model.BaseTxMsg;
import com.github.cadecode.uniboot.common.plugin.mq.model.TxMsg;
import com.github.cadecode.uniboot.common.plugin.mq.util.RabbitUtil;
import com.github.cadecode.uniboot.framework.base.plugin.bean.po.PlgMqMsg;
import com.github.cadecode.uniboot.framework.base.plugin.convert.PlgMqMsgConvert;
import com.github.cadecode.uniboot.framework.base.plugin.enums.SendStateEnum;
import com.github.cadecode.uniboot.framework.base.plugin.service.PlgMqMsgService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.ReturnedMessage;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 事务消息处理器实现
 *
 * @author Cade Li
 * @since 2023/8/20
 */
@Slf4j
@RequiredArgsConstructor
@Component
public class MqTxMsgHandler extends AbstractTxMsgHandler {

    // lock key prefix
    public static final String LOCK_TX_MSG_DO_RETRY = "txMsg:doRetry";
    public static final String LOCK_TX_MSG_DO_CLEAR = "txMsg:doClear";

    // rabbit head

    public static final String HEAD_TX_MSG_ID = "TX_MSG_ID";
    public static final String HEAD_TX_MSG_BIZ_TYPE = "TX_MSG_BIZ_TYPE";
    public static final String HEAD_TX_MSG_BIZ_KEY = "TX_MSG_BIZ_KEY";

    // rabbit head -- end

    private final RedisLockKit redisLockKit;

    private final PlgMqMsgService mqMsgService;

    @Override
    public void doRetry() {
        String lockKey = KeyGeneUtil.lockKey(LOCK_TX_MSG_DO_RETRY);
        try {
            redisLockKit.lock(lockKey);
            Date currDate = new Date();
            List<PlgMqMsg> msgList = mqMsgService.lambdaQuery()
                    .ge(PlgMqMsg::getNextRetryTime, currDate)
                    .eq(PlgMqMsg::getSendState, SendStateEnum.FAIL)
                    .ltSql(PlgMqMsg::getCurrRetryTimes, "max_retry_times")
                    .list();
            long retryCount = msgList.stream()
                    .filter(o -> {
                        int newCurrRetryTimes = o.getCurrRetryTimes() + 1;
                        Date newNextRetryTime = calcNextRetryTime(new Date(), o.getBackoffInitInterval(),
                                o.getBackoffMultiplier(), o.getBackoffMaxInterval(), newCurrRetryTimes);
                        try {
                            TxMsg txMsg = PlgMqMsgConvert.INSTANCE.poToTxMsg(o);
                            doSendCommittedOrRetry(txMsg);
                            boolean updateFlag = updateRetryTime(o.getId(), newCurrRetryTimes, newNextRetryTime);
                            log.debug("TxMsg sent on retry, updateFlag:{}, txMsg:{}, biz:{}_{}", updateFlag, o.getId(), o.getBizType(), o.getBizKey());
                        } catch (Exception e) {
                            boolean updateFlag = updateRetryTime(o.getId(), newCurrRetryTimes, newNextRetryTime);
                            log.debug("TxMsg send fail on retry, updateFlag:{}, txMsg:{}, biz:{}_{}", updateFlag, o.getId(), o.getBizType(), o.getBizKey());
                            return false;
                        }
                        return true;
                    })
                    .count();
            log.debug("TxMsg retry, retryCount:{}, currDate:{}, queryCount:{}", retryCount, currDate, msgList.size());
        } finally {
            redisLockKit.unlock(lockKey);
        }
    }

    private boolean updateRetryTime(String txMsgId, int newCurrRetryTimes, Date newNextRetryTime) {
        return mqMsgService.lambdaUpdate()
                .eq(PlgMqMsg::getId, txMsgId)
                .set(PlgMqMsg::getCurrRetryTimes, newCurrRetryTimes)
                .set(PlgMqMsg::getNextRetryTime, newNextRetryTime)
                .update(new PlgMqMsg());
    }

    @Override
    public void doClear(Long autoClearInterval) {
        String lockKey = KeyGeneUtil.lockKey(LOCK_TX_MSG_DO_CLEAR);
        try {
            redisLockKit.lock(lockKey);
            Date currDate = new Date();
            // 查找指定时长之前的记录
            DateTime lastDate = DateUtil.offset(currDate, DateField.MILLISECOND, -autoClearInterval.intValue());
            List<PlgMqMsg> msgList = mqMsgService.lambdaQuery()
                    .select(PlgMqMsg::getId)
                    .le(PlgMqMsg::getCreateTime, lastDate)
                    .eq(PlgMqMsg::getSendState, SendStateEnum.OVER)
                    .list();
            List<String> batchIdList = msgList.stream().map(PlgMqMsg::getId).collect(Collectors.toList());
            boolean removeFlag = mqMsgService.removeBatchByIds(batchIdList);
            log.debug("TxMsg clear, {}, currDate:{}, queryCount:{}", removeFlag, currDate, msgList.size());
        } finally {
            redisLockKit.unlock(lockKey);
        }
    }

    @Override
    public void checkBeforeSend(BaseTxMsg txMsg, MsgOption msgOption) {
        AssertUtil.isNull(txMsg, () -> new TxMsgException("TxMsg null"));
        AssertUtil.isNull(txMsg.getExchange(), () -> new TxMsgException("TxMsg exchange null"));
        AssertUtil.isNull(txMsg.getRoutingKey(), () -> new TxMsgException("TxMsg routing key null"));
        AssertUtil.isNull(txMsg.getMessage(), () -> new TxMsgException("TxMsg message null"));
        // 没有设置 id 时生成雪花 id
        if (ObjectUtil.isEmpty(txMsg.getId())) {
            ((TxMsg) txMsg).setId(String.valueOf(IdWorker.getId(txMsg)));
        }
    }

    @Override
    public void sendNoTransaction(BaseTxMsg txMsg, MsgOption msgOption) {
        // 空实现
    }

    @Override
    public void sendNotCommit(BaseTxMsg txMsg, MsgOption msgOption) {
        // 空实现
    }

    @Override
    public void saveBeforeRegister(BaseTxMsg txMsg, MsgOption msgOption) {
        // 转换 bean
        PlgMqMsg plgMqMsg = PlgMqMsgConvert.INSTANCE.baseTxMsgToPo(txMsg, msgOption);
        plgMqMsg.setSendState(SendStateEnum.PREPARING);
        // 计算下次重试时间
        plgMqMsg.setCurrRetryTimes(0);
        plgMqMsg.setNextRetryTime(calcNextRetryTime(new Date(), plgMqMsg.getBackoffInitInterval(),
                plgMqMsg.getBackoffMultiplier(), plgMqMsg.getBackoffMaxInterval(), plgMqMsg.getCurrRetryTimes()));
        mqMsgService.save(plgMqMsg);
        log.debug("TxMsg save, txMsg:{}, biz:{}_{}", txMsg.getId(), txMsg.getBizType(), txMsg.getBizKey());
    }

    private Date calcNextRetryTime(Date lastDate, long initInterval, double multiplier,
                                   long maxInterval, long currRetryTimes) {
        long newInterval = initInterval + Math.round(currRetryTimes * multiplier);
        if (newInterval > maxInterval) {
            newInterval = maxInterval;
        }
        return DateUtil.offset(lastDate, DateField.MILLISECOND, (int) newInterval);
    }

    @Override
    public void sendCommitted(BaseTxMsg txMsg, MsgOption msgOption) {
        try {
            doSendCommittedOrRetry(txMsg);
            log.debug("TxMsg sent on committed, txMsg:{}, biz:{}_{}", txMsg.getId(), txMsg.getBizType(), txMsg.getBizKey());
        } catch (Exception e) {
            boolean updateFailFlag = updatePreparingToFail(txMsg.getId(), ExceptionUtil.stacktraceToString(e));
            log.debug("TxMsg send fail on committed, {}, txMsg:{}, biz:{}_{}", updateFailFlag, txMsg.getId(), txMsg.getBizType(), txMsg.getBizKey());
        }
    }

    private void doSendCommittedOrRetry(BaseTxMsg txMsg) {
        // 放入 txMsg id
        CorrelationData correlationData = new CorrelationData(txMsg.getId());
        RabbitUtil.send(txMsg.getExchange(), txMsg.getRoutingKey(), txMsg.getMessage(), msg -> {
            // 设置事务消息 head 标记
            msg.getMessageProperties().getHeaders().put(HEAD_TX_MSG_ID, txMsg.getId());
            msg.getMessageProperties().getHeaders().put(HEAD_TX_MSG_BIZ_TYPE, txMsg.getBizType());
            msg.getMessageProperties().getHeaders().put(HEAD_TX_MSG_BIZ_KEY, txMsg.getBizKey());
            // 设置 ReturnedMessage，用于 callback 中获取消息
            correlationData.setReturned(new ReturnedMessage(msg, -9999, null, null, null));
            return msg;
        }, correlationData);
    }

    @Override
    public void handleConfirm(CorrelationData correlationData, boolean ack, String cause) {
        if (ObjectUtil.isNull(correlationData) || ObjectUtil.isNull(correlationData.getId())
                || ObjectUtil.isNull(correlationData.getReturned())) {
            return;
        }
        Message message = correlationData.getReturned().getMessage();
        boolean txMsgFlag = message.getMessageProperties().getHeaders().containsKey(HEAD_TX_MSG_ID);
        if (!txMsgFlag) {
            return;
        }
        String bizType = String.valueOf(message.getMessageProperties().getHeaders().get(HEAD_TX_MSG_BIZ_TYPE));
        String bizKey = String.valueOf(message.getMessageProperties().getHeaders().get(HEAD_TX_MSG_BIZ_KEY));
        if (!ack) {
            boolean updateFailFlag = updatePreparingToFail(correlationData.getId(), cause);
            log.debug("TxMsg set to FAIL on confirm, {}, txMsg:{}, biz:{}_{}", updateFailFlag, correlationData.getId(), bizType, bizKey);
            return;
        }
        // ack 为 true 时，状态改为 OVER
        boolean updateOverFlag = mqMsgService.lambdaUpdate()
                .eq(PlgMqMsg::getId, correlationData.getId())
                .eq(PlgMqMsg::getSendState, SendStateEnum.PREPARING)
                .set(PlgMqMsg::getSendState, SendStateEnum.OVER)
                .update(new PlgMqMsg());
        log.debug("TxMsg set to OVER on confirm, {}, txMsg:{}, biz:{}_{}", updateOverFlag, correlationData.getId(), bizType, bizKey);
    }

    @Override
    public void handleReturned(ReturnedMessage returned) {
        Message message = returned.getMessage();
        boolean txMsgFlag = message.getMessageProperties().getHeaders().containsKey(HEAD_TX_MSG_ID);
        if (!txMsgFlag) {
            return;
        }
        String txMsgId = String.valueOf(message.getMessageProperties().getHeaders().get(HEAD_TX_MSG_ID));
        String bizType = String.valueOf(message.getMessageProperties().getHeaders().get(HEAD_TX_MSG_BIZ_TYPE));
        String bizKey = String.valueOf(message.getMessageProperties().getHeaders().get(HEAD_TX_MSG_BIZ_KEY));
        // 构造 cause
        String cause = StrUtil.format("Returned message:{}, replyCode:{}. replyText:{}, exchange:{}, routingKey :{}",
                returned.getMessage(), returned.getReplyCode(), returned.getReplyText(), returned.getExchange(), returned.getRoutingKey());
        boolean updateFailFlag = mqMsgService.lambdaUpdate()
                .eq(PlgMqMsg::getId, txMsgId)
                .set(PlgMqMsg::getSendState, SendStateEnum.FAIL)
                .set(PlgMqMsg::getCause, cause)
                .update(new PlgMqMsg());
        log.debug("TxMsg set to FAIL on returned, {}, txMsg:{}, biz:{}_{}", updateFailFlag, txMsgId, bizType, bizKey);
    }

    private boolean updatePreparingToFail(String txMsgId, String cause) {
        return mqMsgService.lambdaUpdate()
                .eq(PlgMqMsg::getId, txMsgId)
                .eq(PlgMqMsg::getSendState, SendStateEnum.PREPARING)
                .set(PlgMqMsg::getSendState, SendStateEnum.FAIL)
                .set(PlgMqMsg::getCause, cause)
                .update(new PlgMqMsg());
    }
}
