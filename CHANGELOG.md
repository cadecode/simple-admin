# [2024.2.0](https://github.com/cadecode/uni-boot-cloud/compare/2024.1.0...2024.2.0) (2024-08-03)

### Bug Fixes

* 策略执行器中先判断类型，再判断 supports
  方法 ([df8bb93](https://github.com/cadecode/uni-boot-cloud/commit/df8bb93ea28e0592dd34fc7ae5dd68a10cac9464))
* 解决 mybatis plus 插件和 pageHelper
  插件顺序问题 ([eaf1479](https://github.com/cadecode/uni-boot-cloud/commit/eaf14797a70e634e0c27f7f7f2ed3aa21f79cf61))
* 解决 RabbitMQ 多数据源声明同名交换机判断 delay 时 toMap
  冲突 ([c09315c](https://github.com/cadecode/uni-boot-cloud/commit/c09315c24e2162f028b33db467b52b7943c6a59a))
* 解决同名队列和交换机声明多个绑定时 bean
  冲突 ([d0002da](https://github.com/cadecode/uni-boot-cloud/commit/d0002da70a573e72dcb6f9eb97009a49cb8ed6a6))
* SysRoleMapper Oracle 下 mapper
  字段缺少 ([2017e66](https://github.com/cadecode/uni-boot-cloud/commit/2017e66c007efe5521ef157ff3152fba60b1a49b))

### Features

* 登录和注销时操作客户端
  cookie ([1fc3432](https://github.com/cadecode/uni-boot-cloud/commit/1fc3432ef68d679d15639170ef12693bb34c74dd))
*
优化顶级异常，支持异常信息字符串模板 ([5d7fef2](https://github.com/cadecode/uni-boot-cloud/commit/5d7fef214ffec86882969bf50728a0f26b1a1871))
* 支持配置单个账号最大 token 数量（默认 1
  即不支持重复登录） ([a7c3dba](https://github.com/cadecode/uni-boot-cloud/commit/a7c3dbaf0e920954b379331927c9675cff52c058))

# [2024.1.0](https://github.com/cadecode/uni-boot-cloud/compare/2023.1.3...2024.1.0) (2024-05-27)

### Bug Fixes

* 对 DATA
  类角色去除前缀 ([ae183d8](https://github.com/cadecode/uni-boot-cloud/commit/ae183d8c33c6b4812ae4bc455b5889a02052dc24))
* 特殊处理 login url，防止未清理的无效 token
  拦截登录 ([d331e03](https://github.com/cadecode/uni-boot-cloud/commit/d331e0364db80a70e742fac9f6d089b73d673e1f))
* 在没有使用注解时，跳过
  DataPermissionInterceptor ([9fbd235](https://github.com/cadecode/uni-boot-cloud/commit/9fbd235087b6d117dba336b237ce7aa7bd752428))
* DATA
  类角色字符串截取错误 ([6065472](https://github.com/cadecode/uni-boot-cloud/commit/60654722eb1424f335a430bdb2812cd7d60767f9))
* roles 副本解决 retainAll
  影响 ([2c3c3ca](https://github.com/cadecode/uni-boot-cloud/commit/2c3c3ca163107875e935c9cdc8192871e02cfde8))
* SysMenuMapper oracle DISTINCT
  错误 ([2f82bbd](https://github.com/cadecode/uni-boot-cloud/commit/2f82bbd35d2630edfa2014504c3490e775a36a43))

### Features

* 服务启动 jar
  指定打包名称，取消默认携带版本号 ([f140ebb](https://github.com/cadecode/uni-boot-cloud/commit/f140ebb32a62bc4dc2aacc9d32efb2e3858eedc9))
* 角色管理按 type:code
  进行区分管理 ([30e3411](https://github.com/cadecode/uni-boot-cloud/commit/30e34112d7a24bfac759f7d5e2a71e2f4aff216d))
*
实现基于角色的数据范围解析器 ([db99697](https://github.com/cadecode/uni-boot-cloud/commit/db99697ce06affe736670ee37c147d8c9c1c84c5))
* 添加
  DataPermissionInterceptor ([8b88816](https://github.com/cadecode/uni-boot-cloud/commit/8b88816f3d6c5a45216af3929e351141496eaafb))
* 添加 ShardingJdbc
  强制路由主库的工具类 ([15a81e6](https://github.com/cadecode/uni-boot-cloud/commit/15a81e6622776e2178fcd30335274ea213100e3e))
* 项目更名为
  uni-boot-cloud ([de9fd0f](https://github.com/cadecode/uni-boot-cloud/commit/de9fd0f157ab5afe2f263d78e35367c9611ddf2a))
* DataScopeResoler 按 RoleTypeEnum
  处理前缀 ([1b4d66e](https://github.com/cadecode/uni-boot-cloud/commit/1b4d66e50dbb03f1e1a6fa54fcdeb1223f9332ac))
* framework 模块添加 oracle
  数据库支持 ([0e11013](https://github.com/cadecode/uni-boot-cloud/commit/0e11013c7b9cfed54e3ba4daf63e48f647ddd9e5))
* logback 增加 warn 级别 log
  文件 ([c5d1af2](https://github.com/cadecode/uni-boot-cloud/commit/c5d1af26de9656d4c882ff444779b661cb435dab))
* TxMsgKit
  添加没有事务的消息发送方法 ([9bf2af3](https://github.com/cadecode/uni-boot-cloud/commit/9bf2af33d054190e838e4b525fc6c9ce91c6526e))
* x-file-storage 更新到
  2.1.0 ([70eda50](https://github.com/cadecode/uni-boot-cloud/commit/70eda50cd9dff87d5af2d47d4826ef08d639f315))

### Reverts

* 移除 shardingjdbc
  相关依赖及设施 ([049c203](https://github.com/cadecode/uni-boot-cloud/commit/049c203a8e579da87d639023751a556695341f45))

## [2023.1.4](https://github.com/cadecode/uni-boot-cloud/compare/2023.1.3...2023.1.4) (2023-12-01)

### Bug Fixes

* 菜单不提供 parentId
  update ([a8d09a6](https://github.com/cadecode/uni-boot-cloud/commit/a8d09a6f8aee72aea33a7f2592d2f3534e4dacc6))
* 修改 multi-rabbit 依赖引入顺序，解决加载 bean
  问题 ([6e94d62](https://github.com/cadecode/uni-boot-cloud/commit/6e94d62a027c720c81f8c976b7045f8416c1c742))
* 移除 BPP，使用 @Primary 指定
  FileRecorder ([7c1f560](https://github.com/cadecode/uni-boot-cloud/commit/7c1f560d0f797482e4ef00f2302ba89af2e8ad38))

### Features

* 查询部门 tree
  支持过滤部门名 ([87dd2b1](https://github.com/cadecode/uni-boot-cloud/commit/87dd2b1bf487b822082b4409ca0ced908dee0398))
* 查询通用 tree
  util ([2f7585b](https://github.com/cadecode/uni-boot-cloud/commit/2f7585bbfaf277e7d7e0bf47a91bf6499cb45550))
* 使用工具类优化 tree
  生成代码 ([5a2b836](https://github.com/cadecode/uni-boot-cloud/commit/5a2b836e8dd761698244c8cb804be4591bfcf04c))
* 添加 sharding jdbc 测试接口，以 plg_log
  为例 ([3f2eeef](https://github.com/cadecode/uni-boot-cloud/commit/3f2eeef6c181e47417ecaf59e8dfe747a64ca897))
* 添加部门管理
  API ([d290385](https://github.com/cadecode/uni-boot-cloud/commit/d2903854870d92ad35bb1f739743a3e8b208a295))
* 添加基于 hutool、commons-pool2 的 ftp
  工具 ([7e241e9](https://github.com/cadecode/uni-boot-cloud/commit/7e241e95a9938ddaee304b524f83994b9b1ddee9))
* 统一配置 logback mybatis plus log 为
  debug ([5ec5214](https://github.com/cadecode/uni-boot-cloud/commit/5ec5214c8e4e1644edb3bae1c94197ef2bce2f9a))
* 修改 menu
  列表为树状全部返回 ([8e499d0](https://github.com/cadecode/uni-boot-cloud/commit/8e499d07c54f950b2a0ed8db831ce2cc3d49014d))
*
用户管理加入部门相关字段 ([131cb72](https://github.com/cadecode/uni-boot-cloud/commit/131cb72e63823008fb38882a632c88efe6e4e0e4))
* sharding jdbc 数据源集成到
  dynamic-datasource ([eba893b](https://github.com/cadecode/uni-boot-cloud/commit/eba893bb5703ac48a213dac1798616433bfa8db7))

## [2023.1.3](https://github.com/cadecode/uni-boot-cloud/compare/2023.1.2...2023.1.3) (2023-11-12)

### Bug Fixes

* 查询 SysUser feign client
  参数丢失 ([794c55c](https://github.com/cadecode/uni-boot-cloud/commit/794c55cd84bda20c297d5cb18fbe8cc27c0ba291))
* 改为 @RequestParam
  接收普通参数 ([4d278bb](https://github.com/cadecode/uni-boot-cloud/commit/4d278bb930c9eb661edf19bebabd74e12b1475ad))
* 解决自定义 AbstractStorageHandler 不能替代框架默认
  FileRecorder ([03dc96d](https://github.com/cadecode/uni-boot-cloud/commit/03dc96da1caebff461468aab5d1bbf68fd3d24b4))
* 判断交换机 delay
  方法空指针 ([dca79e4](https://github.com/cadecode/uni-boot-cloud/commit/dca79e4faba59f02e17d35e87290eab3a27665ff))
*
属性名称错误，影响继承 ([fec45c1](https://github.com/cadecode/uni-boot-cloud/commit/fec45c1b6137de33230f3ffee1d401dbc39f94f6))
* gateway 去除 tomcat
  依赖 ([9a514ca](https://github.com/cadecode/uni-boot-cloud/commit/9a514ca3659da4f6abdff4f28fe1a40ebefab37c))
* logback appender
  重复添加 ([b511487](https://github.com/cadecode/uni-boot-cloud/commit/b5114879a0a8aff1fb8953a9522ef285648bf422))
* multirabbit publisher-returns 无效，使用 setMandatory 开启
  callback ([f4c650d](https://github.com/cadecode/uni-boot-cloud/commit/f4c650d31491d45f746a67c90530543290401332))
* token 校验 filter 最好放到 LogoutFilter
  之前 ([fbfedc0](https://github.com/cadecode/uni-boot-cloud/commit/fbfedc034b436eb22ac90e42fe623a0d7217cbce))
* TxMsg doClear 方法取消参数，方便 xxl-job
  执行 ([f8ebd2e](https://github.com/cadecode/uni-boot-cloud/commit/f8ebd2e1e43834a59440b6815781cd004d802cfe))

### Features

* 策略执行器 execute 方法改为 submit
  表示有返回值 ([2be2f0c](https://github.com/cadecode/uni-boot-cloud/commit/2be2f0caa6cc2a210f4edda1f396a15e457e6e84))
* 对 TxMsg retry 和 auto clear 实现提供 xxl-job
  支持 ([d0ea857](https://github.com/cadecode/uni-boot-cloud/commit/d0ea85789b1eb1cb7e96146d5d21efdce5d0713b))
* 发送事务消息示例接口修改为可指定
  connectionName ([e3456f3](https://github.com/cadecode/uni-boot-cloud/commit/e3456f3f6a52c8069d22c302d7840ede276997b8))
* 缓存注解打到 controller
  层 ([95de520](https://github.com/cadecode/uni-boot-cloud/commit/95de5205b4c8aaa5eb08d218e31b9dadca36051f))
* 集成 RabbitMQ
  多数据源 ([67bf54a](https://github.com/cadecode/uni-boot-cloud/commit/67bf54abb1cac41789e9131b80cc1918588de2d7))
* 集成 x-file-storage
  文件记录入库、通用上次下载接口等 ([6149584](https://github.com/cadecode/uni-boot-cloud/commit/61495847b9f28a9a557f580a5c5861fe92156261))
* 删除文件接口启用
  ApiLogger ([ab79b07](https://github.com/cadecode/uni-boot-cloud/commit/ab79b07ed36c60c7b389581571b0e6280cfcb571))
* 添加 example
  job ([bdd4288](https://github.com/cadecode/uni-boot-cloud/commit/bdd428828010744b030929ef71111e9ea26f6ec0))
* 添加 x-file-storage 使用 demo
  controller ([f15a0e6](https://github.com/cadecode/uni-boot-cloud/commit/f15a0e6080f33b1aa4ac770209853aaddde0fc02))
* 添加菜单 hiddenFlag
  字段，用于管理内部路由 ([58384fe](https://github.com/cadecode/uni-boot-cloud/commit/58384fe8bc2258318fb22c91b697c8d70cd44aba))
*
添加分页查询所有菜单的接口（不含角色） ([c1c35b3](https://github.com/cadecode/uni-boot-cloud/commit/c1c35b3b251eb31198fa0247c46364eac387ceec))
* 添加根据 username 查用户信息 feign
  接口 ([a00afca](https://github.com/cadecode/uni-boot-cloud/commit/a00afca123b3238b4fa7710af710062607006f7e))
* 添加跨域
  filter ([41882d2](https://github.com/cadecode/uni-boot-cloud/commit/41882d2f538ea1ac8c3e6a277d4191d38016d5ea))
*
添加文件删除接口 ([7e77e3a](https://github.com/cadecode/uni-boot-cloud/commit/7e77e3a82a2ec87cbc8f54e680ccae5fa75a5c92))
* 添加字段菜单
  cache_flag ([19c8d73](https://github.com/cadecode/uni-boot-cloud/commit/19c8d7329ca0ed55f97dce02212bd885c2d7403c))
*
通用上传文件接口返回值改为保存的文件名 ([13f5144](https://github.com/cadecode/uni-boot-cloud/commit/13f51441a4dd881786409b27aaae8783cbcefc26))
* 文件删除接口添加异常
  log ([21ba892](https://github.com/cadecode/uni-boot-cloud/commit/21ba8922384945db6603e17b30d9b0fb302d2d7b))
* 引入 xxl-job ([429076f](https://github.com/cadecode/uni-boot-cloud/commit/429076f41a31c6f28bc2e885cbef4b63feb5fded))
*
字典查询接口添加缓存 ([8e99701](https://github.com/cadecode/uni-boot-cloud/commit/8e997012ec2bffd0654404b2ec9a8910045e4422))
* feign 集成 apache
  httpclient ([ed85cc0](https://github.com/cadecode/uni-boot-cloud/commit/ed85cc00527cb28ac2abba854092c5a528012e89))
* feign 默认 log 基本指定
  BASIC ([4d84efc](https://github.com/cadecode/uni-boot-cloud/commit/4d84efc7a9fc6746578ad45f9fd6d1268a212f89))
* RabbitExampleConsumer @RabbitListener 指定
  containerFactory ([ae3f45a](https://github.com/cadecode/uni-boot-cloud/commit/ae3f45a6c83be6c63393864afb0e4e819f1c400d))
* security 忽略路径分为 permitAll 和 ignoringMatcher
  两类 ([d154113](https://github.com/cadecode/uni-boot-cloud/commit/d154113e8f7822592750553b5f957c898edb0876))
* SecurityUtil 获取 token 兼容 url
  参数方式 ([7dceebf](https://github.com/cadecode/uni-boot-cloud/commit/7dceebf53300b03bf60f56a1d1eecd55517ce3cb))
* TxMsg
  重试添加配置开关 ([c289588](https://github.com/cadecode/uni-boot-cloud/commit/c2895886f9bee8248b3f47d40fb13cee45eb4467))
* TxMsg 重试支持指定
  connectionName ([b21d09c](https://github.com/cadecode/uni-boot-cloud/commit/b21d09c174aa9057d846fb57eaf9c7a540a7438a))

## [2023.1.2](https://github.com/cadecode/uni-boot-cloud/compare/2023.1.1...2023.1.2) (2023-08-24)

### Bug Fixes

* 入参 msgOption
  错误 ([65186d8](https://github.com/cadecode/uni-boot-cloud/commit/65186d8ef9eaeb6d97f0cc489baf8eb331661ea2))
* 添加 mq
  相关测试接口和消费者 ([63a614b](https://github.com/cadecode/uni-boot-cloud/commit/63a614b318bf382ca811da287a3bb4657846761e))
* 字典 vo 缺少 defaultFlag
  字段 ([9a2bf95](https://github.com/cadecode/uni-boot-cloud/commit/9a2bf95bb17ddba63624ce96696ba83f4cb60d44))
* 字段 currRetryTimes 已改为
  leftRetryTimes ([2055133](https://github.com/cadecode/uni-boot-cloud/commit/205513366e82e0bb541e582ac5e2da87e7f998ac))
* correlationData
  空指针异常 ([a26a474](https://github.com/cadecode/uni-boot-cloud/commit/a26a4743ac7a6cc2baee1cae9d4b0fe7e86ba937))
* SysLog 查询接口返回
  traceId ([c11e506](https://github.com/cadecode/uni-boot-cloud/commit/c11e506af695cc480516d3a490a982360a852022))

### Features

* 创建 PlgMqMsg
  表实体 ([7bdf0a8](https://github.com/cadecode/uni-boot-cloud/commit/7bdf0a8da771e0f3c064cd3f20369a29848e070c))
*
当前重试次数改为剩余重试次数 ([8816d23](https://github.com/cadecode/uni-boot-cloud/commit/8816d23d6f2c31267216255a9edf227e62a00feb))
* 对 Api log
  记录的敏感字段做忽略控制 ([403e963](https://github.com/cadecode/uni-boot-cloud/commit/403e96323946e850e3fdc370cd6d7739bb8a1f09))
* 设置 correlationData
  后置处理 ([66f2eb6](https://github.com/cadecode/uni-boot-cloud/commit/66f2eb6d75a8edfc2056b5f233823305a749f6ff))
* 事务消息重试添加改为非 OVER
  状态 ([82f38ed](https://github.com/cadecode/uni-boot-cloud/commit/82f38edc35a5e85eb6ff746393bb48c04a7752a2))
* 添加 mq
  消息查询更新接口 ([3e5fb66](https://github.com/cadecode/uni-boot-cloud/commit/3e5fb6606bfeef2a70c25af836ec83d4e7f98784))
* 添加 rabbit
  常量 ([c0f749f](https://github.com/cadecode/uni-boot-cloud/commit/c0f749f765dcf2a7a27faa29b105c142430543fd))
* 添加 RabbitMQ
  发消息工具方法 ([5d3a472](https://github.com/cadecode/uni-boot-cloud/commit/5d3a472e946b9f8b2b13afd4d2fa9419e6b7637c))
* 添加 RabbitMQ
  发消息工具类 ([45fce60](https://github.com/cadecode/uni-boot-cloud/commit/45fce60d92d911160d8fa6c8c2460a5ee7d37786))
* 添加 RabbitMQ
  死信交换机的配置项 ([f46a163](https://github.com/cadecode/uni-boot-cloud/commit/f46a1633118cd32bee7b7c6566ec67d6faf5ddb8))
* 添加 RabbitMQ
  消息确认和退回回调 ([c6c8769](https://github.com/cadecode/uni-boot-cloud/commit/c6c8769e65c10a0d47424327072f207e31840c74))
* 添加 RabbitMQ
  自动配置，根据配置文件自动创建队列等 ([61e1a66](https://github.com/cadecode/uni-boot-cloud/commit/61e1a66474e018b7e94ab6839461cfc97218a63f))
* 添加测试 api log
  的接口 ([f3532ad](https://github.com/cadecode/uni-boot-cloud/commit/f3532adb6cae83dec81d119cfabbdef942d86f4e))
* 添加发送 TxMsg
  前校验参数的方法 ([8ef8baa](https://github.com/cadecode/uni-boot-cloud/commit/8ef8baa7accf23f1bb9acd9b87ad778d5049470b))
*
添加发送事务消息测试接口 ([df070e6](https://github.com/cadecode/uni-boot-cloud/commit/df070e6a667f100ee1157db009b2d1b06d4e5826))
*
添加事务消息处理器实现 ([94ba2f3](https://github.com/cadecode/uni-boot-cloud/commit/94ba2f3222c1005ec947d3a5cd0b09e4505fa143))
*
添加事务消息相关 ([440e860](https://github.com/cadecode/uni-boot-cloud/commit/440e860169485e40949b9322a8fa56b0bc283b54))
* 添加通用 RabbitMq
  消息转换器 ([4d22b80](https://github.com/cadecode/uni-boot-cloud/commit/4d22b80df68837a4609f6658c11bd98af2a1b7bf))
* 添加消息是否 Returned
  的判断 ([8972aee](https://github.com/cadecode/uni-boot-cloud/commit/8972aeeee9af43cfa0c62f4b0728788e0513ad0d))
* 修改消息确认
  log ([5bc9443](https://github.com/cadecode/uni-boot-cloud/commit/5bc94433c92a353b953c89eb553e524ecb919741))
* Api log 记录注解 logType 改为
  String ([9c26e8b](https://github.com/cadecode/uni-boot-cloud/commit/9c26e8b11f44a02253d0540df0f6091cc7a359c9))
* Api log 添加 traceId
  字段记录 ([9c5f667](https://github.com/cadecode/uni-boot-cloud/commit/9c5f66786fe793c4fa72b5547c1a49c1d4a25fa1))
* BaseLogInfo
  改为接口 ([1625994](https://github.com/cadecode/uni-boot-cloud/commit/1625994561870e3a424f7f8b6f714f432811fd52))
* example 添加测试 mq 发送 text json
  类型消息的接口 ([007c569](https://github.com/cadecode/uni-boot-cloud/commit/007c569eb52f0a894f218cdb5be762eb8eac5e67))
* po to vo
  方法名规范化 ([675d157](https://github.com/cadecode/uni-boot-cloud/commit/675d157052929b8cd7ef8d5a04960a1d4a36482b))
* RabbitMQ
  消息回调添加处理钩子 ([cfe64b6](https://github.com/cadecode/uni-boot-cloud/commit/cfe64b698ee09d70c1939ecf3bebe4439cd91643))
* swagger
  查询接口放到公共模块 ([e0c6349](https://github.com/cadecode/uni-boot-cloud/commit/e0c63497f5c47d49f2cd41152de9fe0c2d220bfe))

## [2023.1.1](https://github.com/cadecode/uni-boot-cloud/compare/2023.1.0...2023.1.1) (2023-08-11)

### Bug Fixes

* 处理返回 null 的接口，根据 ErrorCode 的 code
  值进行比较 ([27da719](https://github.com/cadecode/uni-boot-cloud/commit/27da71939d7ae2aebf450017b9f55a899c541601))
* 删除
  spring-boot-devtools，解决类加载问题 ([f381e4e](https://github.com/cadecode/uni-boot-cloud/commit/f381e4ec76cdfda97f2302a985eef2aaa9a7e871))
* 找回 framework mapper
  xml ([a67f4dd](https://github.com/cadecode/uni-boot-cloud/commit/a67f4dd278c64813ae46f3dd84a66dfe672f247f))
* feign
  拦截器非请求接口内的调用获取请求对象时空指针 ([d3cb87d](https://github.com/cadecode/uni-boot-cloud/commit/d3cb87d6bb3ba01d8ac12b355aa0ea08b0652004))
* FeignClient 装饰器填充请求无效，使用 feign
  拦截器 ([4e14fe0](https://github.com/cadecode/uni-boot-cloud/commit/4e14fe049c840e47fa81efe1cd63530a3f5e10af))
* rpc 调用 login 获取请求头中
  token ([805997f](https://github.com/cadecode/uni-boot-cloud/commit/805997fdafd04c83dda5320e19c706222fbe45aa))

### Features

* 抽离 security 认证相关配置到 framework
  服务 ([9e77d1c](https://github.com/cadecode/uni-boot-cloud/commit/9e77d1ca64c749439242a71f34db8f5c7ce70f8a))
* 抽取服务通用配置功能到 base
  模块 ([7faf8f0](https://github.com/cadecode/uni-boot-cloud/commit/7faf8f0f6aacf00aa95fb75b96d9cc530f083cb2))
* 定义 feign client
  装饰器，实现请求与响应的拦截处理 ([c072dab](https://github.com/cadecode/uni-boot-cloud/commit/c072dab4dcb2e7f9822f9fef5a8422260a187754))
*
封装判断是否内部调用的方法 ([e9b01d3](https://github.com/cadecode/uni-boot-cloud/commit/e9b01d32129154396e28435a440ea01c79c4cecb))
*
公开系统日志写入接口 ([1eed2d3](https://github.com/cadecode/uni-boot-cloud/commit/1eed2d33f0cb82ac48e998a948d7e742ae742402))
* 后缀 dto 改为
  vo ([dd448a8](https://github.com/cadecode/uni-boot-cloud/commit/dd448a8047314a6be89565af41d802384a80222e))
* 内部调用结果不需要包装，和 @ApiFormat
  无关 ([497827c](https://github.com/cadecode/uni-boot-cloud/commit/497827cf720f85aabec49b72fcc6b31d3c3da601))
* 配置 trace id 过滤器，配置 feign 传递 trace
  id ([ce5004d](https://github.com/cadecode/uni-boot-cloud/commit/ce5004d0522975a41958cb13d64588735c3f7b27))
* 升级 knife4j 到 3.0.3，统一集成到 gateway
  swagger ([b44a321](https://github.com/cadecode/uni-boot-cloud/commit/b44a321d5a18a5e7e55a401ddfb252627a6f2ab7))
*
实体类名称规范化 ([d2e5849](https://github.com/cadecode/uni-boot-cloud/commit/d2e58493828fbabdbd1020ef595674450a1118fd))
*
使用二级缓存作为默认缓存管理器 ([e237d80](https://github.com/cadecode/uni-boot-cloud/commit/e237d80e45ab314e6171e3af273081f0295bf65b))
* 添加 ApiInner
  注解及切面，对内部调用进行管控 ([05a5bbb](https://github.com/cadecode/uni-boot-cloud/commit/05a5bbb5a60726aef5f02c2732c35f1d3c0c5507))
* 添加 const SvcName
  维护服务名 ([adfebc0](https://github.com/cadecode/uni-boot-cloud/commit/adfebc04cebb42833295680e0546a041d0aed583))
* 添加 feign 拦截器，传递
  token、用户信息 ([f330278](https://github.com/cadecode/uni-boot-cloud/commit/f330278bd71e62daae06aa084e78d3c82c71fc4a))
* 添加 feign 异常
  Decoder ([bbb4337](https://github.com/cadecode/uni-boot-cloud/commit/bbb433741b4c37f911d8b3f33cfcf6a8ff7f5f72))
* 添加 RPC 异常相关
  code ([2e49ea7](https://github.com/cadecode/uni-boot-cloud/commit/2e49ea75d856b725049e27ff03de896974e84519))
*
添加几个测试接口 ([0a45528](https://github.com/cadecode/uni-boot-cloud/commit/0a45528e389428a18d9cc0645a6a74ace26fa297))
*
添加几个测试接口的调用接口 ([d9b192a](https://github.com/cadecode/uni-boot-cloud/commit/d9b192abeeeeb678c95daecedb5798fd8ce9da66))
*
添加网关全局异常处理器 ([f26f50b](https://github.com/cadecode/uni-boot-cloud/commit/f26f50b6a68c716693475f5569b34dadc9957295))
*
网关添加请求头过滤器 ([dc2dc28](https://github.com/cadecode/uni-boot-cloud/commit/dc2dc285ab979a3b41b99b0cfc7dc356a314c510))
* 引入 gateway
  组件，调整依赖关系 ([e8ad59b](https://github.com/cadecode/uni-boot-cloud/commit/e8ad59b2fd2ee0f1d037f3733c8acad8c569a4d1))
* 引入 mica-auto 自动维护
  spring.factories ([699a422](https://github.com/cadecode/uni-boot-cloud/commit/699a422345f25f45183c1db878e67121eaac3c7c))
* 引入
  nacos、openFeign ([ac27c24](https://github.com/cadecode/uni-boot-cloud/commit/ac27c24a9c7a5588cceb1dce8e270e56dfc7afdd))
* feign
  拦截器传递内部请求标识头 ([6b24555](https://github.com/cadecode/uni-boot-cloud/commit/6b24555aa4bfda6696cd0b916dedb387c5b8eca1))
* gateway 添加 filter 生成
  traceId ([26095b1](https://github.com/cadecode/uni-boot-cloud/commit/26095b141b276934b9dffa5924adc0703082928e))
* log feign 接口传参改为
  dto ([d5ce99e](https://github.com/cadecode/uni-boot-cloud/commit/d5ce99e630deff7717a292d4c04a57d8687d11d4))
* token filter
  中先根据请求头判断是否是内部请求 ([70e1c5b](https://github.com/cadecode/uni-boot-cloud/commit/70e1c5b311df91d6910e49735aff62ca60db9ff7))

# [2023.1.0](https://github.com/cadecode/uni-boot-cloud/compare/5b29e37a77deaed61ac3a312228dafbe25b703f7...2023.1.0) (2023-07-24)

### Bug Fixes

*
查询角色菜单时根据enableFlag过滤 ([b18f831](https://github.com/cadecode/uni-boot-cloud/commit/b18f8317200bcf5c0b8b4222fec73c34758041fb))
* 父 pom version 不能引用 properties
  中的参数 ([4be302b](https://github.com/cadecode/uni-boot-cloud/commit/4be302b6004bb59145f6235d7bc5ee824cb638f3))
* 更新 refresh token
  时只更新时间 ([c02bfb5](https://github.com/cadecode/uni-boot-cloud/commit/c02bfb524b5f986d21379438c5b13ba5a802fb1d))
* 工具类注入逻辑优化、log
  优化 ([1cd3686](https://github.com/cadecode/uni-boot-cloud/commit/1cd3686e317b5c6666e3d7e324e0108033376cf9))
*
关闭空对象序列化失败 ([4df828f](https://github.com/cadecode/uni-boot-cloud/commit/4df828f0144801aaf95c4cb8df859f9b6890905f))
*
关闭默认的数据源自动配置 ([166898d](https://github.com/cadecode/uni-boot-cloud/commit/166898d9ff99722296844afdcd746d0f073f41cb))
* 规范 yaml
  配置格式 ([23084a4](https://github.com/cadecode/uni-boot-cloud/commit/23084a44f9bebfbcfe9b4725302f0db359cc7a63))
* 过期 > 0 时才设置
  expireAfterWrite ([45120dc](https://github.com/cadecode/uni-boot-cloud/commit/45120dc7ab3b6f394b483f33fe8dab523645f809))
*
过期时间使用long避免溢出 ([844c18b](https://github.com/cadecode/uni-boot-cloud/commit/844c18b4921768e557c00d2e6716df805cae43c6))
* 解决 null 值在 caffeine 和 redis
  中存储混乱 ([3acfced](https://github.com/cadecode/uni-boot-cloud/commit/3acfced2e5355c4c0a33aaebd7fa0f7250dc3acb))
* 解决 refreshMsg
  发出节点也要处理消息 ([7ac182b](https://github.com/cadecode/uni-boot-cloud/commit/7ac182bc7f76b5f5470a85e99896a325eaeae343))
* 解决接口返回 null
  时类型转换异常 ([29c5315](https://github.com/cadecode/uni-boot-cloud/commit/29c53154b33c3732930f2d23ef3362bdab9de869))
* 解决使用方法引用替代 lambda
  产生空指针 ([a0e93e2](https://github.com/cadecode/uni-boot-cloud/commit/a0e93e2bfe031b00e7d1625b76f42cd91293dc3f))
* 解决MP
  lambdaUpdate自动填充失效的问题 ([d2183f9](https://github.com/cadecode/uni-boot-cloud/commit/d2183f900a88a8424fd15a6797d2adb5e2bcdc3c))
* 解决resultMap
  collection分页异常 ([e511f7f](https://github.com/cadecode/uni-boot-cloud/commit/e511f7f110abe4d05037ac897de11505b8688085))
* 取消 mybatis handler
  自动扫描，显式指定 ([58a7aaf](https://github.com/cadecode/uni-boot-cloud/commit/58a7aaf78a695dd93b4bef2507b23382213cc41b))
* 删除无用包引用 ([f1c48fa](https://github.com/cadecode/uni-boot-cloud/commit/f1c48fabad5cb835f8c89178867c5cf5a0b3c23b))
* 修改 logback
  有误的配置 ([f8382d2](https://github.com/cadecode/uni-boot-cloud/commit/f8382d2d95644fcc14db78ae0682f09b9745a85b))
* 修改 mapper 扫描路径，避免 mybatis
  代理无辜接口 ([d7a122d](https://github.com/cadecode/uni-boot-cloud/commit/d7a122d59c483e171f1f5ce3d517141308c38df7))
* 修改 system
  模块未注册 ([5132858](https://github.com/cadecode/uni-boot-cloud/commit/5132858a6df962dcb7c68958a93c12fb7b7ff358))
*
修改查询条件顺序 ([b240728](https://github.com/cadecode/uni-boot-cloud/commit/b240728843fecc58965e2b17fec3fc65122af084))
* 修改为惰性 new
  异常 ([7beb7b1](https://github.com/cadecode/uni-boot-cloud/commit/7beb7b1051d4e37b40eb898c93daf0a8cb42cb81))
* 修改SQL排序 ([a76f601](https://github.com/cadecode/uni-boot-cloud/commit/a76f601646ffb31a7205ccb664522afeafa6bd09))
* 优化 Json
  工具类方法名称 ([783ae6a](https://github.com/cadecode/uni-boot-cloud/commit/783ae6ad793c8460c2c46d5caf0c865dd004003d))
* bean
  重命名，防止冲突 ([f202ac3](https://github.com/cadecode/uni-boot-cloud/commit/f202ac312833a5db0713ed65f8cd5071d8b5eee6))
* DbConfigObject 添加 config
  属性 ([66b4dfb](https://github.com/cadecode/uni-boot-cloud/commit/66b4dfb6820d43359fb0eaee84def707e1527b2a))
* error code 统一修改为 4
  位数字 ([53013d8](https://github.com/cadecode/uni-boot-cloud/commit/53013d81d81560be595dd202b3e4f6d024b14bc9))
*
knife4j升级注解变动 ([b1f7414](https://github.com/cadecode/uni-boot-cloud/commit/b1f74147a13bf5e8cbc6f53c2e7698c7a4b3aa2f))
* mica-auto 依赖
  provided，防止传递 ([f1d0cc4](https://github.com/cadecode/uni-boot-cloud/commit/f1d0cc47297e2db55c309da955d8298ada2681d8))
*
page参数使用整形 ([ae51f15](https://github.com/cadecode/uni-boot-cloud/commit/ae51f15f5ab0df4768f1b09020576065d6744e32))
* RedisUtil
  方法名称不规范 ([8b02967](https://github.com/cadecode/uni-boot-cloud/commit/8b029676a5360e335e4480faec940340ac6b373b))
*
resultMap映射错误 ([c7d955a](https://github.com/cadecode/uni-boot-cloud/commit/c7d955a3d419c9bfc1a34c95c646f6aaffb9192a))
* set
  方法名注入错误 ([1a5c66a](https://github.com/cadecode/uni-boot-cloud/commit/1a5c66a9496cdd08c174dff42da2b09a3dd37978))
* swagger
  配置包名调整 ([b648d20](https://github.com/cadecode/uni-boot-cloud/commit/b648d2067118815c57e30b9e21526d8610ca5c7d))

### Features

* 版本号调整到
  1.0.0 ([cb74f52](https://github.com/cadecode/uni-boot-cloud/commit/cb74f529bdf246d325b479bc04c813e36f7a2ff2))
* 查询 menu 根据 parentId
  过滤 ([5b7b945](https://github.com/cadecode/uni-boot-cloud/commit/5b7b945207a657a4dd6a75eea19ddbd2670da500))
*
查询API角色关系方法优化 ([a3f137f](https://github.com/cadecode/uni-boot-cloud/commit/a3f137f47b2d8a17cfd29395e55681dd3308e38e))
* 初始化 SpringBoot
  项目 ([5b29e37](https://github.com/cadecode/uni-boot-cloud/commit/5b29e37a77deaed61ac3a312228dafbe25b703f7))
* 打开p6spy ([e61878a](https://github.com/cadecode/uni-boot-cloud/commit/e61878a7e98e6ae7e7916b4cc0c010a5306e9ce9))
* 当 api
  配置没有关联角色，通过鉴权 ([af38758](https://github.com/cadecode/uni-boot-cloud/commit/af38758dc105bee6571fe75874ba9dcfbf9348ee))
* 登录注销接口添加 ApiLogger
  注解 ([33b5576](https://github.com/cadecode/uni-boot-cloud/commit/33b557611bb9bfa0732b691e09abf5b5acf3bb4b))
* 定制 MissingServletRequestParameterException
  的异常处理 ([728d983](https://github.com/cadecode/uni-boot-cloud/commit/728d9839edce29f3e12ef689f52e70521f72dca7))
* 定制 taskScheduler 和 DtpExecutor
  的停机关闭策略 ([243536e](https://github.com/cadecode/uni-boot-cloud/commit/243536e9d1dc522dab8c6dff30ade56f385def1d))
*
复用Security接口，方便swagger展示 ([1f6560c](https://github.com/cadecode/uni-boot-cloud/commit/1f6560cee14e620146a679b6f1df9af341022ca7))
* 根据 spring 路径优先级比较来确定生效的 api
  角色配置 ([24cc062](https://github.com/cadecode/uni-boot-cloud/commit/24cc0621e5322ac698e41c8dfcacb4520d6ab676))
* 更新和添加 componentPath
  可为空 ([1c865a5](https://github.com/cadecode/uni-boot-cloud/commit/1c865a5ce3bfc5ddfba1c0145399a1c0be5afed6))
* 更新时不可修改
  leafFlag ([c680261](https://github.com/cadecode/uni-boot-cloud/commit/c680261598c2ed512fdd1fb38ea7267d94c2b27d))
* 基于 springboot cache 组件修改 api 和 role
  的缓存策略 ([01bba6f](https://github.com/cadecode/uni-boot-cloud/commit/01bba6fb38a5335a19b847c6a7754bd90364ba0a))
* 集成 dynamicTp ([73ec03b](https://github.com/cadecode/uni-boot-cloud/commit/73ec03b0ab6c5e20061a0ba8f20f616ea5d656ec))
* 集成 jasypt
  管理配置文件中的密码 ([c2d3f61](https://github.com/cadecode/uni-boot-cloud/commit/c2d3f614f6e7cc385bf2922bc52efbbd935ee34e))
* 集成
  pagehelper ([5ba9533](https://github.com/cadecode/uni-boot-cloud/commit/5ba95331d3b2b33a48a4be610fbc7af61354427c))
* 集成 TTL ([b5fb0e8](https://github.com/cadecode/uni-boot-cloud/commit/b5fb0e8a808570ecf4568c52722cbec5ad20ce4d))
* 接口统一返回格式添加 path
  信息 ([df06d82](https://github.com/cadecode/uni-boot-cloud/commit/df06d82fcb577234ea89c281f0a7acd043aa31c8))
* 开启 Spring
  异步和定时任务 ([37e0aa9](https://github.com/cadecode/uni-boot-cloud/commit/37e0aa90336bab5ae3993402b7125c1b2d44ce91))
*
没有认证信息的请求投票弃权 ([d0c646d](https://github.com/cadecode/uni-boot-cloud/commit/d0c646d8426ecb73c3f05eaaacfc0e1fc5c29018))
* 配置 AOP exposeProxy 为
  true ([13aaa9c](https://github.com/cadecode/uni-boot-cloud/commit/13aaa9cc6e1e7516ad085131cd20287a767e1d3c))
* 配置 mybatis typeHandlerPackage 并加入 alias
  扫描 ([187a74f](https://github.com/cadecode/uni-boot-cloud/commit/187a74f9cf1c96bd1cb98b96296290dc5d12d5a2))
* 配置 RedisTemplate<String, Object> 的
  bean ([d7730df](https://github.com/cadecode/uni-boot-cloud/commit/d7730df622d04f01be430a5c32f192fca03ed435))
* 配置 swagger
  version ([49a8fe4](https://github.com/cadecode/uni-boot-cloud/commit/49a8fe42eae8b4ab8b11c9096753d5dae5b8b620))
* 配置 web
  容器优雅关闭 ([f8e912e](https://github.com/cadecode/uni-boot-cloud/commit/f8e912e851600b50a20391722e98a922806df283))
*
配置定时线程池线程数、关闭前等待时间 ([1b3b646](https://github.com/cadecode/uni-boot-cloud/commit/1b3b6462be5016b05ee251eec46b2e3d216b31f1))
* 配置二级缓存 ([6a7ebe0](https://github.com/cadecode/uni-boot-cloud/commit/6a7ebe0d366f7d7ce68d68d6b85642552e12e5c4))
* 启动类和 ServletInitializer
  合并 ([1f1c804](https://github.com/cadecode/uni-boot-cloud/commit/1f1c804f4992c368b29d7e46dad23da00c8ea074))
*
删除父级菜单时删除下面子菜单 ([a9025a7](https://github.com/cadecode/uni-boot-cloud/commit/a9025a725edb777b4b2121ffd3404b163591d872))
* 删除异步入库，在 handler
  实现类中异步 ([9e2fa8e](https://github.com/cadecode/uni-boot-cloud/commit/9e2fa8efc50c3f1d09ac7ba7137766690f2ce806))
*
删除用户时清理角色绑定关系 ([3096f9f](https://github.com/cadecode/uni-boot-cloud/commit/3096f9f2fdf21cd8792aef5f81b46f88afa538cb))
*
设置druid监控页面默认密码 ([77accc7](https://github.com/cadecode/uni-boot-cloud/commit/77accc714693dce08de1f986c5201e00ae8ffa0e))
* 升级 Swagger UI 插件为 knife4j，版本
  2.0.5 ([eea0ece](https://github.com/cadecode/uni-boot-cloud/commit/eea0ece7c2f0a429975a477079bdded0035af363))
* 实体类启用
  autoResultMap ([ece9826](https://github.com/cadecode/uni-boot-cloud/commit/ece9826bf712cf8369c8dfa257e4c7881b527434))
* 实体类使用 lombok @Builder，添加 typeHandler
  注解 ([512cd23](https://github.com/cadecode/uni-boot-cloud/commit/512cd23f26ab5c6db8ad7c61aa4f1def66a9ef9d))
* 使用 alias 指定
  typeHandler ([21630b9](https://github.com/cadecode/uni-boot-cloud/commit/21630b9b5cb50ed7d8496dfd58dd1df90d963e91))
* 使用 Cacheable 优化 API
  角色关系缓存 ([6e0f9e4](https://github.com/cadecode/uni-boot-cloud/commit/6e0f9e4f4d57f3c6f542a4e90fe158bb7796304d))
* 使用 DefaultErrorAttributes 代替 ErrorController 对 SpringMVC
  原生异常进行处理 ([cf39eaa](https://github.com/cadecode/uni-boot-cloud/commit/cf39eaa5b7111a49301ade1ad0824add026392b5))
* 使用 RedisTemplate 统一序列化代替
  JacksonUtil ([c3208b9](https://github.com/cadecode/uni-boot-cloud/commit/c3208b9024672743080a2bd39fe231f4c07a4b0a))
* 使用 Spring 项目 jackson 配置创建 RedisTemplate
  序列化 ([b4e9274](https://github.com/cadecode/uni-boot-cloud/commit/b4e9274386ecff3831409f45c224e177ea049661))
* 使用bind优化like
  concat ([b249c28](https://github.com/cadecode/uni-boot-cloud/commit/b249c2882edf0978fe599d9582a65a42dfb9612a))
*
使用JacksonTypeHandler实现roles合并 ([ac3c629](https://github.com/cadecode/uni-boot-cloud/commit/ac3c629a1b4d46c56bc3ef48dbc6c583fbe2b62c))
* 提取 TTL、DynamicTp 到 plugin
  concorrent ([484188d](https://github.com/cadecode/uni-boot-cloud/commit/484188dab44a73f27d8c73c37ba1153277cc8dbb))
* 添加 AOP 依赖，配置
  mybatis ([f7a7774](https://github.com/cadecode/uni-boot-cloud/commit/f7a77741d0f1f1fd778a048cc664ad034e02c953))
* 添加 API
  管理接口 ([5ff80f6](https://github.com/cadecode/uni-boot-cloud/commit/5ff80f6bc7252366610dadf3ea8253f2a992a741))
* 添加 Api log
  入库及查询接口 ([1d92b24](https://github.com/cadecode/uni-boot-cloud/commit/1d92b24e1d49740adf091b31feae4126d185d2e4))
* 添加 CollectUtil
  集合工具类 ([472fbf9](https://github.com/cadecode/uni-boot-cloud/commit/472fbf9e88e0fbdf19504ae571b1a04caf883fe2))
* 添加 common
  错误枚举 ([8580a8d](https://github.com/cadecode/uni-boot-cloud/commit/8580a8d5df4ff9724856cb507994df2205b2c873))
* 添加 DemoMapper
  测试动态数据源切换 ([6157483](https://github.com/cadecode/uni-boot-cloud/commit/61574836612d43630ff48da5d98444608664766a))
* 添加 ErrorEnum
  未知错误 ([a70e244](https://github.com/cadecode/uni-boot-cloud/commit/a70e2445bf5c95d74fda6280a66c571ba23ab68e))
* 添加 JWT 过滤器 refresh token
  解析 ([0c4379a](https://github.com/cadecode/uni-boot-cloud/commit/0c4379ad6dd97130515ad64c0becd82dec053982))
* 添加 jwt 和 redis 两种 token
  校验模式 ([5635e41](https://github.com/cadecode/uni-boot-cloud/commit/5635e41a62c8bb6f32e1590b1d305a515cd4a4fe))
* 添加 jwt token
  工具类及其配置 ([5d8a79c](https://github.com/cadecode/uni-boot-cloud/commit/5d8a79ceb6b033dd9f2c06a680193475e301568d))
* 添加 keys 方法 ([c8192ba](https://github.com/cadecode/uni-boot-cloud/commit/c8192ba7cc2ed326f84df641bd375e3ba4e4d776))
* 添加 MAPPING 静态字段，用于 mybatis plus
  typeHandler ([afb6bfe](https://github.com/cadecode/uni-boot-cloud/commit/afb6bfe71c03f156e5341afe0a8a4a2e915fb6c9))
* 添加 Mybatis 拦截器，打印
  sql ([83fc7e9](https://github.com/cadecode/uni-boot-cloud/commit/83fc7e9da07bc229a2735c65d92ae1d90e6be7a6))
* 添加 MyBatis
  枚举处理器 ([86cb9e2](https://github.com/cadecode/uni-boot-cloud/commit/86cb9e29f190686f570599f2bfa88e28d9215c6b))
* 添加 Redis 过期 key
  统一监听器和处理器接口 ([e1b26f6](https://github.com/cadecode/uni-boot-cloud/commit/e1b26f6067d3b2908521b15a41b0cdddad2f8526))
* 添加 Redis
  配置类 ([9b618a9](https://github.com/cadecode/uni-boot-cloud/commit/9b618a94dd052f6154f03525614e00803b598af6))
* 添加 Redis
  消息监听器抽象，统一注册监听 ([d465ac2](https://github.com/cadecode/uni-boot-cloud/commit/d465ac2a61db4165757f6e032f0302a68c642f9f))
* 添加 RedisCacheManager 配置，修改
  KeyPrefix ([2eabbe2](https://github.com/cadecode/uni-boot-cloud/commit/2eabbe20185a81b1eef6dd54f1e23ad80ae2e8ae))
* 添加
  RedisUtil，修改本地缓存配置 ([e29d078](https://github.com/cadecode/uni-boot-cloud/commit/e29d0781999ad8dd71fb23afeab20a8e22fba73e))
* 添加 refresh token
  错误的响应码 ([4e2f94c](https://github.com/cadecode/uni-boot-cloud/commit/4e2f94ce845755f51733fc1865c03639af19c21f))
* 添加 SimpleException
  构造函数，传入自定义异常信息 ([6c33dde](https://github.com/cadecode/uni-boot-cloud/commit/6c33dde256135761152a3757ffeb92e1b113dda4))
* 添加 SimpleRes.ResError 构造函数，传入
  ErrorEnum ([999a933](https://github.com/cadecode/uni-boot-cloud/commit/999a93320544f40d8480655eb0450bf5e293605a))
* 添加 Spring
  工具类，SpringUtil ([2fc99ee](https://github.com/cadecode/uni-boot-cloud/commit/2fc99ee419759eb1aae773f5db5a07152ae457d4))
* 添加 SwaggerConfig，动态配置
  docket ([da7aa62](https://github.com/cadecode/uni-boot-cloud/commit/da7aa62c7d6f8075399d7f6dc2edabfbc174d7cc))
* 添加 Token
  请求头的校验过滤器 ([e2b63a4](https://github.com/cadecode/uni-boot-cloud/commit/e2b63a473442d1c45d91857ae4721fa9679bc90b))
* 添加 tokenTime
  字段的映射 ([9d75688](https://github.com/cadecode/uni-boot-cloud/commit/9d75688a5baf8bd754e4eb903f540475a5473061))
* 添加 TokenUtil，抽离
  SecurityUtil ([1205737](https://github.com/cadecode/uni-boot-cloud/commit/12057378266fb39ecc6a5136b80176d6cc0143a6))
* 添加 Web 工具类和写入响应 JSON
  方法 ([7c453f7](https://github.com/cadecode/uni-boot-cloud/commit/7c453f763f90c0be4bf1331c4187bbf6c68fcb6c))
* 添加策略模式统一 service，基于 spring
  plugin ([94a552d](https://github.com/cadecode/uni-boot-cloud/commit/94a552d3da6ee2814789ce748270d9f16262fc5c))
*
添加查询角色列表接口 ([88d19f0](https://github.com/cadecode/uni-boot-cloud/commit/88d19f070b7c0f5e12e6cdf0412ecc1e48542e18))
* 添加查询全部接口按 url
  排序 ([3b1a6fa](https://github.com/cadecode/uni-boot-cloud/commit/3b1a6fa384c5ed46bb93e27934758ce291ab13e7))
* 添加查询全部接口和 swagger
  注解内容 ([2b5a613](https://github.com/cadecode/uni-boot-cloud/commit/2b5a613c5d136418f363c39ee7bac96d823f7bf4))
*
添加查询全部接口去重 ([15183e3](https://github.com/cadecode/uni-boot-cloud/commit/15183e3f3edc214c0138769c18551da2b0a7d6fa))
*
添加查询用户（带角色）方法 ([5367524](https://github.com/cadecode/uni-boot-cloud/commit/53675249404aba63974e96e92c1665534a8f16bf))
* 添加从数据库获取 API
  权限配置 ([3cf0f1b](https://github.com/cadecode/uni-boot-cloud/commit/3cf0f1b847c8f55c6ba2678ec465acdcb0f5c14f))
*
添加从SecurityContext获取认证信息方法 ([8f6308e](https://github.com/cadecode/uni-boot-cloud/commit/8f6308e921f5fd24fa884dffd643800b43bd6754))
*
添加错误码枚举类和状态码枚举类 ([b681b9a](https://github.com/cadecode/uni-boot-cloud/commit/b681b9ace333c810057132319494bc4c0bc1400c))
* 添加单机版的 redis
  锁工具 ([74e2186](https://github.com/cadecode/uni-boot-cloud/commit/74e2186de6a2166eead8aafa5b3dc8b9f8aad392))
* 添加单机限流器注解和 AOP
  切面 ([a0bf9b8](https://github.com/cadecode/uni-boot-cloud/commit/a0bf9b827b9c97ea032eb1ccef05a1270ef1c84b))
* 添加登录逻辑 ([63d7b1d](https://github.com/cadecode/uni-boot-cloud/commit/63d7b1d1ea8fda1238ad758180a85d1bebaef0b3))
*
添加登录逻辑和登录成功或失败的回调 ([322c803](https://github.com/cadecode/uni-boot-cloud/commit/322c8031680b150431a415edd00265c3b07352ca))
*
添加动态数据源类 ([463f251](https://github.com/cadecode/uni-boot-cloud/commit/463f2510b9ce3e5c1b7111cf90d2242bc1fd5718))
* 添加动态数据源切换 AOP
  类 ([2aca778](https://github.com/cadecode/uni-boot-cloud/commit/2aca778110d1c78a8cfd9822961ea807b0c877a6))
* 添加对 TypeMismatchException
  的统一处理 ([ab1bac9](https://github.com/cadecode/uni-boot-cloud/commit/ab1bac9ef2926dbfe8a91f4891bc5b06ce2a3a7b))
*
添加多环境的打包配置 ([8c4e6ed](https://github.com/cadecode/uni-boot-cloud/commit/8c4e6ed9d3b3ddae28e358f437220417aef392b5))
*
添加二级缓存及其管理器 ([a792518](https://github.com/cadecode/uni-boot-cloud/commit/a792518c7c7ffe74daac114a057ef438a47fe544))
*
添加分页参数类用于bean继承 ([c8e0cec](https://github.com/cadecode/uni-boot-cloud/commit/c8e0cec7fa532868f33355127f947ac795db346f))
*
添加分页查询返回格式实体类 ([e48cbf7](https://github.com/cadecode/uni-boot-cloud/commit/e48cbf7c2ccc3dcb60b206f4d6c3b8a156542e1f))
*
添加分页查询用户（带角色）的接口 ([5243263](https://github.com/cadecode/uni-boot-cloud/commit/5243263482c07ca37077e6b6c7a9dd900a31105a))
*
添加根据菜单、api查询角色的方法 ([b86e5b9](https://github.com/cadecode/uni-boot-cloud/commit/b86e5b999a57ef6dbba7e58dab0723fd29e8bde0))
* 添加根据异常类获取 SimpleRes
  对象的方法 ([424eb9e](https://github.com/cadecode/uni-boot-cloud/commit/424eb9e8fea36c623f282f5eee8eda3ba1c273f9))
*
添加根据id查询用户接口 ([bfa410b](https://github.com/cadecode/uni-boot-cloud/commit/bfa410b4c233eb42d668fb56148df0ee8224e339))
* 添加工具类 JsonUtil
  和字符串与对象互转的方法 ([1bb3205](https://github.com/cadecode/uni-boot-cloud/commit/1bb3205d3a71bfa5ee9ec0bf464899ed32c199e9))
* 添加工具类 StringUtil
  和判断空字符串的方法 ([aea5ae6](https://github.com/cadecode/uni-boot-cloud/commit/aea5ae6a59ecbe4ca38c59b3c420fcc9f2d7f079))
*
添加忽略统一返回格式的注解判断逻辑 ([494e9a5](https://github.com/cadecode/uni-boot-cloud/commit/494e9a58f6f4e17569abb54aeec718bddfeaa60b))
* 添加基于 hutool 的 office
  文件工具类 ([ede57a9](https://github.com/cadecode/uni-boot-cloud/commit/ede57a95c6eab3b0b709acfc44d26f06cd3f4bbb))
* 添加角色 curd ([a36b459](https://github.com/cadecode/uni-boot-cloud/commit/a36b459413a47b431a0cef69498c127b6f03b3f0))
*
添加角色绑定关系增删方法 ([a3c92e6](https://github.com/cadecode/uni-boot-cloud/commit/a3c92e674a1bd484ad53873651809db320162ccd))
*
添加角色绑定关系增删接口 ([241f19c](https://github.com/cadecode/uni-boot-cloud/commit/241f19cd0cd606e4972d7d4e5e7d6081622c60b4))
* 添加接口返回 null
  时的返回格式处理，抛出异常 ([6ed36f4](https://github.com/cadecode/uni-boot-cloud/commit/6ed36f47c08737c017406f8f1f1f8e11e87912a5))
*
添加接口接收枚举类的通用转换器 ([7680674](https://github.com/cadecode/uni-boot-cloud/commit/7680674011ad999c4117cbed36ddb4c2ebb1615e))
*
添加接口请求参数异常的统一处理逻辑 ([deaad01](https://github.com/cadecode/uni-boot-cloud/commit/deaad01f1db6a96c89326af4b08c66d4e23fc5de))
* 添加客户端请求错误错误码枚举、删除
  ReasonEnum ([f580ae6](https://github.com/cadecode/uni-boot-cloud/commit/f580ae6be8b91b3bd4fe1055dc4f80ee9723a689))
*
添加判断过期的工具方法 ([1d50e20](https://github.com/cadecode/uni-boot-cloud/commit/1d50e2073da965b99042190fea55d3481ceee3c4))
* 添加配置，启动时将 dataSource.yml 加入
  Environment ([209975f](https://github.com/cadecode/uni-boot-cloud/commit/209975f52eaeec0d23a7f643e5c4d27239c8ec1c))
*
添加请求响应打印日志的切面和注解 ([62264d3](https://github.com/cadecode/uni-boot-cloud/commit/62264d32d7dceed0d8494e9e10ad5ed73adc2990))
* 添加全局的异常处理类，实现 ErrorContoller 对 404
  异常定制返回内容 ([dabe3e4](https://github.com/cadecode/uni-boot-cloud/commit/dabe3e42bd6a64c86bdc6be07fd2db47ddce38ff))
*
添加权限不足、未登录、注销的处理逻辑 ([98c6c85](https://github.com/cadecode/uni-boot-cloud/commit/98c6c85db1ff78513bd20094b66254904b68fcd6))
*
添加事务工具类，添加事务完成后执行回调的方法 ([ca69315](https://github.com/cadecode/uni-boot-cloud/commit/ca6931590ace7eae3583697256f1e726fae90c2f))
*
添加数据源配置类，解析并配置动态数据源 ([6f7712e](https://github.com/cadecode/uni-boot-cloud/commit/6f7712ef04ed6411ae45a11ee4e71256ef206504))
*
添加通用上传下载API ([5cfc30b](https://github.com/cadecode/uni-boot-cloud/commit/5cfc30b626904242fe13d1913a1db66d53001b0d))
* 添加统一返回格式通知类
  SimpleResAdvice ([47bfc72](https://github.com/cadecode/uni-boot-cloud/commit/47bfc72750da5ecb90c682d923172e4ffb688ea9))
* 添加统一异常处理中对 500
  异常的处理 ([5cc5341](https://github.com/cadecode/uni-boot-cloud/commit/5cc534132cd2bd793dbf887366c4dad266f1d4e1))
*
添加响应码接口及枚举类，优化异常处理 ([f5a1cef](https://github.com/cadecode/uni-boot-cloud/commit/f5a1cefce617394c99cb3b87fa92f2ad78bb1253))
*
添加响应体封装工具类、响应状态码枚举类 ([eebbe43](https://github.com/cadecode/uni-boot-cloud/commit/eebbe43daf3f107a88ce41893736a1215407de9e))
*
添加修改用户信息和密码接口 ([3b01cf0](https://github.com/cadecode/uni-boot-cloud/commit/3b01cf091d304ce5684056365feb04a1dea0730e))
* 添加一个 获取请求 IP
  地址的工具方法 ([c21c7be](https://github.com/cadecode/uni-boot-cloud/commit/c21c7bedd0c62f6d3731da34eeb07415faba1fc2))
* 添加一个 Jackson
  工具类 ([bb21f75](https://github.com/cadecode/uni-boot-cloud/commit/bb21f750270c218c50e70d7accb3c98d80ed3f7e))
* 添加一个 security cache manager，过期时间设置为 jwt
  配置 ([fdb6fb3](https://github.com/cadecode/uni-boot-cloud/commit/fdb6fb302ebd8b0510acd1b0d0bf967eab3678f3))
*
添加一个断言工具类 ([43108b6](https://github.com/cadecode/uni-boot-cloud/commit/43108b6ed88f4b1ca5e1eb0b40b082b8714cd36c))
* 添加一个注解，用于控制接口是否按 SimpleRes
  格式返回 ([a64aa5b](https://github.com/cadecode/uni-boot-cloud/commit/a64aa5b5908f64140ab7c7721bbf22b6017b48de))
*
添加一个状态码常量类 ([fb44293](https://github.com/cadecode/uni-boot-cloud/commit/fb442937f6f2006b2b5fb622589073179f1af485))
* 添加一些 Reason Code
  到枚举类 ([ee2efd4](https://github.com/cadecode/uni-boot-cloud/commit/ee2efd475fd294cfe2e954245e9cad2359f01505))
*
添加用户更新enable接口 ([46abb1f](https://github.com/cadecode/uni-boot-cloud/commit/46abb1f07897c88c0cebf3546c7dac202920ea71))
* 添加用于 logback
  的配置文件 ([3628b96](https://github.com/cadecode/uni-boot-cloud/commit/3628b961920fc538616da35f8f40a65db1da1d8e))
* 添加用于快速创建 map 的 MapUtil
  及测试类 ([b28e647](https://github.com/cadecode/uni-boot-cloud/commit/b28e647ba039944b039f6faa162a99f7470e337a))
*
添加用于切换数据源的注解 ([7d27d23](https://github.com/cadecode/uni-boot-cloud/commit/7d27d23b722be1ac3a7037e36d9a3048c8036669))
*
添加责任链模式接口模板，策略执行器支持多个匹配实现 ([392b97f](https://github.com/cadecode/uni-boot-cloud/commit/392b97f84afec71964584b4b7b74138dd0292a71))
*
添加字典管理接口 ([fa18a2b](https://github.com/cadecode/uni-boot-cloud/commit/fa18a2b593bb0d96456148b3d891a9b4ee570d8d))
* 添加自定义的
  accessDecisionManager ([f82aa5a](https://github.com/cadecode/uni-boot-cloud/commit/f82aa5a72d0a6ae6786cf478fbc749f5258483d9))
* 添加自定义异常类
  SimpleException ([c255af3](https://github.com/cadecode/uni-boot-cloud/commit/c255af383db6a30ae75e8dd49bb5036c4b806d2f))
* 添加自述文件
  README.md ([d22509f](https://github.com/cadecode/uni-boot-cloud/commit/d22509fa0ab7ab1be49edbc5b1b6a87dbe386049))
*
添加component_path属性、SQL按orderNum排序 ([0d2ce36](https://github.com/cadecode/uni-boot-cloud/commit/0d2ce3667184ab4997f5ca07d9ec28b1aadd5682))
*
添加create_time相关属性返回 ([fc38c28](https://github.com/cadecode/uni-boot-cloud/commit/fc38c28169445cbc7daf47857ccbfb3c5d76827a))
*
添加menu管理接口 ([55d81bf](https://github.com/cadecode/uni-boot-cloud/commit/55d81bf367f18585a6b7030420868d0b534232ee))
* 添加mybatis
  plus自动填充注解 ([acc1626](https://github.com/cadecode/uni-boot-cloud/commit/acc1626ece2bbb383c6d5dc780978bdd38d8b9e6))
*
添加MybatisPlus自动填充createTime相关 ([d5a5b97](https://github.com/cadecode/uni-boot-cloud/commit/d5a5b9794c9d8a744a57a2f67d78ba6fc24af190))
*
添加Role关系表删除方法 ([6724c79](https://github.com/cadecode/uni-boot-cloud/commit/6724c79a10c3a6ec84fa06fecb54e62e04ec2223))
*
添加Security默认放通actuator,druid等 ([5433e1d](https://github.com/cadecode/uni-boot-cloud/commit/5433e1d7d62e1fffb1e0087a5e7b0825a654739f))
* 添加spring
  security获取username工具方法 ([7eec2e0](https://github.com/cadecode/uni-boot-cloud/commit/7eec2e05be5a7c6fadc418f7de5fd490479cbfcc))
*
添加SysMenu实体及表 ([a07f57a](https://github.com/cadecode/uni-boot-cloud/commit/a07f57a0ca2097c52f3ead9a0f7d22633f38b18d))
* 添加user
  getInfo菜单接口 ([9097fc8](https://github.com/cadecode/uni-boot-cloud/commit/9097fc80ac6ee2b4d4889f08a8209d8ef3ff007d))
* 完善 plugin
  actuator ([294689f](https://github.com/cadecode/uni-boot-cloud/commit/294689f73fa4c342ce0e1cdf015cf3e55d3f4e67))
* 完善 plugin
  cache ([3774464](https://github.com/cadecode/uni-boot-cloud/commit/377446495a4b16b5d32ac6e17db68a3cc9457789))
* 完善 plugin datasource，动态数据源使用
  baomidou ([9e81670](https://github.com/cadecode/uni-boot-cloud/commit/9e81670eb9c1e1c62dc8038b91b36eb5c41b7f9e))
* 完善 plugin
  log ([a3262a2](https://github.com/cadecode/uni-boot-cloud/commit/a3262a211b070b9d6f04bd4af73276162d57f337))
* 完善 plugin
  mybatis ([bb8d5ba](https://github.com/cadecode/uni-boot-cloud/commit/bb8d5badb471c606e98f81c6b022309a2a2ea2f9))
* 完善 plugin
  swagger ([b1d813c](https://github.com/cadecode/uni-boot-cloud/commit/b1d813c5c335d2d12a1c5d6b55a56e5323975486))
*
系统用户添加性别、登录信息等字段 ([462f946](https://github.com/cadecode/uni-boot-cloud/commit/462f946899ae2b99d39f678b7fec04083e160002))
* 限流切面功能移入 concurrent
  模块，添加限流异常 ([5ef1668](https://github.com/cadecode/uni-boot-cloud/commit/5ef166894c5a2332cb5e7bddd1f749b92512002d))
*
校验异常时修改状态码 ([af32198](https://github.com/cadecode/uni-boot-cloud/commit/af321988f423bc5c1f3b3332adb639852fed26a3))
* 修改 400 的 Reason
  Code ([8bb547b](https://github.com/cadecode/uni-boot-cloud/commit/8bb547b7934e37e64947c48e2657e9afe7e75a8e))
* 修改 caffeine 配置和 RedisTemplate
  bean ([1f8b6f9](https://github.com/cadecode/uni-boot-cloud/commit/1f8b6f93a64e3234585974e281564e0fbfcf4c9e))
* 修改 SimpleRes，返回内容添加 path 和 error
  信息 ([b192315](https://github.com/cadecode/uni-boot-cloud/commit/b192315297fb3ccf763f06527132b16c42e14697))
* 修改 ThreadPoolConfig
  配置方式 ([6aaaf63](https://github.com/cadecode/uni-boot-cloud/commit/6aaaf639c11903305ea2c5bcf1035ce791d22a31))
* 修改覆盖 DtpLifeCycle bean
  的方式 ([0d33fab](https://github.com/cadecode/uni-boot-cloud/commit/0d33fab35b74dabfbe11232020bb594bd4e37782))
* 修改排序条件 ([454a671](https://github.com/cadecode/uni-boot-cloud/commit/454a6713946c4c161d939ffca36bd94d9c1fba8c))
* 修改日志类名显示字符数为
  50 ([cb5915d](https://github.com/cadecode/uni-boot-cloud/commit/cb5915de35fb5ba6d5366b73a874a5c129f1aa46))
*
修改为按时间降序 ([d2fd1df](https://github.com/cadecode/uni-boot-cloud/commit/d2fd1df9bc552c02e9d9ad60816ff90a307917b1))
*
修改用户更新、添加、删除接口 ([5df9027](https://github.com/cadecode/uni-boot-cloud/commit/5df90278634e4e03690cc83b11b105f94394e1c8))
* 修改swagger
  tags ([2944b3f](https://github.com/cadecode/uni-boot-cloud/commit/2944b3f4fef30204e9a9e038de98c3c6c52d8482))
* 引入 cache 组件、基于 caffeine
  实现 ([d7a9d85](https://github.com/cadecode/uni-boot-cloud/commit/d7a9d85183c2d36b6109e369c6f4a164bfdbadad))
* 引入
  druid、dynamic-datasoure ([6d0f19a](https://github.com/cadecode/uni-boot-cloud/commit/6d0f19a6d04b37b6b0bcd67c0eef14039cb0772d))
* 引入 Mybatis
  Plus，添加相关配置类 ([0910b99](https://github.com/cadecode/uni-boot-cloud/commit/0910b99a3c46dd17e2ce5de606c6f680bf095296))
* 引入 p6spy 监控 sql，弃用拦截器打印
  sql ([4517a74](https://github.com/cadecode/uni-boot-cloud/commit/4517a745b6b0f5e73c61afe293697c7915a559c7))
* 引入 redis
  依赖，配置连接信息 ([89d5979](https://github.com/cadecode/uni-boot-cloud/commit/89d597988eae8c8a5e727ec6a123e73715a2f096))
* 引入 Spring Retry，添加测试代码
  SpringRetryController ([2b04bb0](https://github.com/cadecode/uni-boot-cloud/commit/2b04bb02208e1717680006abb15a69801fee106b))
* 引入 Spring
  Security，添加相关实体类 ([53931df](https://github.com/cadecode/uni-boot-cloud/commit/53931df5aaf8485b070810553254e296408b829c))
* 引入
  spring-boot-admin ([27d59fb](https://github.com/cadecode/uni-boot-cloud/commit/27d59fb36ad0893b02e74d29df1a4b497fa8b740))
* 引入
  validation，配置统一异常处理 ([48e620d](https://github.com/cadecode/uni-boot-cloud/commit/48e620da6f7a50a7da0b96e6d9de5531a8a822b1))
* 优化
  DynamicDataSourceAspect，拦截类和方法上的注解 ([f1f40fc](https://github.com/cadecode/uni-boot-cloud/commit/f1f40fc10ddd31376f47ca51f4dea7c39c69b4d5))
* 优化 Mybatis 枚举处理器，默认使用 ordinal
  处理 ([28f2bb2](https://github.com/cadecode/uni-boot-cloud/commit/28f2bb299451e4ed576b62c46ec04ed4b3b1b6bc))
* 优化 Redis 工具类，添加 setnx
  相关方法 ([0eb546f](https://github.com/cadecode/uni-boot-cloud/commit/0eb546f09755a64225124a4385553d8402b58ca9))
* 优化 RetryTemplate
  配置 ([3bf02cf](https://github.com/cadecode/uni-boot-cloud/commit/3bf02cfc320cdb9553aa2bab89a245c8d2361f22))
* 优化全局异常处理、ApiErrorCode 添加 http status
  支持 ([1b050b4](https://github.com/cadecode/uni-boot-cloud/commit/1b050b4b7e3c027e7fd1a6e16a9ee999e08cf31a))
* 优化注释、注解 ([6ddce5e](https://github.com/cadecode/uni-boot-cloud/commit/6ddce5e2a1233291e49a200556130035d841f735))
*
针对各模块添加异常类 ([defff12](https://github.com/cadecode/uni-boot-cloud/commit/defff124d77e39ab8bf2ce3e533c41b5b9da9f13))
* 整合 Swagger2、Swagger Bootstrap
  UI ([02f8bb8](https://github.com/cadecode/uni-boot-cloud/commit/02f8bb8fa975879d3a932852e0678f88d28453a4))
* 支持从 swagger
  注解获取描述 ([f08bbce](https://github.com/cadecode/uni-boot-cloud/commit/f08bbceb2a543035eac21178fccc6c0bd9efbdd6))
*
支持cookie中的token解析 ([89f42d9](https://github.com/cadecode/uni-boot-cloud/commit/89f42d98aff77dd73168a748dc616396a41f8915))
*
注销接口改为401返回 ([0db29f0](https://github.com/cadecode/uni-boot-cloud/commit/0db29f04a4b0b8365f07d60d2d2929de43c93277))
* 注销删除redis
  token前判断是否是redis认证模式 ([223c916](https://github.com/cadecode/uni-boot-cloud/commit/223c916676726258bd06b9ebec3dd31106f2d5c1))
* 自定义 mybatis handler
  包调整 ([ab409bd](https://github.com/cadecode/uni-boot-cloud/commit/ab409bdafbdc7c7c575e96544eafcb29200500cf))
* api role 关系存到
  redis ([06d54ec](https://github.com/cadecode/uni-boot-cloud/commit/06d54ec137ee79752be7468a24948fdef17f5a47))
* ApiLogger
  入库使用异步 ([947df05](https://github.com/cadecode/uni-boot-cloud/commit/947df05671ed9acddbe320af7b3e80d20b3d3e53))
* AssertUtil
  增加工具方法 ([02718cd](https://github.com/cadecode/uni-boot-cloud/commit/02718cdfddafe0990f9756e5a23236447489bae0))
* DemoController
  添加测试接口 ([8a1cb6f](https://github.com/cadecode/uni-boot-cloud/commit/8a1cb6ff15cfd1167665f7462c4c78c9c648bb34))
*
Jackson序列化Long型为String ([6f52997](https://github.com/cadecode/uni-boot-cloud/commit/6f529979593a9e1708e733ead849566feffb9a35))
* JacksonUtil
  添加带序列化类型的工具方法 ([2547d7c](https://github.com/cadecode/uni-boot-cloud/commit/2547d7c86daeaf0272c02401be2cab4ca633caa1))
* JsonUtil
  开启单引号解析 ([d4b8feb](https://github.com/cadecode/uni-boot-cloud/commit/d4b8febdcca472d076d2b95d8aab672d28299fb1))
* key 入参类型改为
  Object ([248196e](https://github.com/cadecode/uni-boot-cloud/commit/248196e036ff34e8bc267f2fe486531c690158f0))
*
knife4j升级到2.0.9 ([e9d4d2a](https://github.com/cadecode/uni-boot-cloud/commit/e9d4d2a7bdac76fcedfd8cdee9c6e93403798aab))
*
log列表支持时间范围过滤 ([a8942e6](https://github.com/cadecode/uni-boot-cloud/commit/a8942e6e2b004b0a2b5184fb5eec16e3d73c7abe))
*
log英文化，防止控制台乱码 ([48ca641](https://github.com/cadecode/uni-boot-cloud/commit/48ca641d7df380c1c34f927136d2f1cb95c00c66))
*
order字段改为orderNum ([f2125b5](https://github.com/cadecode/uni-boot-cloud/commit/f2125b59ea31c435c0a8272e61a5edcb244e77da))
* pagehelper 开启 pageSize 为 0
  查全部 ([506d15a](https://github.com/cadecode/uni-boot-cloud/commit/506d15a21a1170c5b57de70784b7583ef700d68c))
* Redis 过期处理器查找添加 MAP
  缓存 ([8c4370f](https://github.com/cadecode/uni-boot-cloud/commit/8c4370f5a021a1717a80a0736b80f2cb088f1aed))
* Redis Lock 修改为基于 RedisTemplate<String,
  Object> ([9b8dbf6](https://github.com/cadecode/uni-boot-cloud/commit/9b8dbf6e98afee4779ddff3959194e4f9759a339))
* Redis Lock
  续期线程池设置名称，并设为守护线程 ([de421b2](https://github.com/cadecode/uni-boot-cloud/commit/de421b29e06139887407f4e34782d78e378c30b7))
* RetryableException
  添加构造方法 ([24c89d4](https://github.com/cadecode/uni-boot-cloud/commit/24c89d4c473591affbccea0be473535e2092dc00))
* Security
  handler根据ErrorEnum设置状态码 ([5d953e8](https://github.com/cadecode/uni-boot-cloud/commit/5d953e832e40a46c93a44da5d591edaa7a61890c))
*
Security不放通logout，以强制携带token ([e81f0b1](https://github.com/cadecode/uni-boot-cloud/commit/e81f0b1c5f0c8f3166246f8d901d1c791dc3a2c7))
*
Security工具方法改为static ([e91f96f](https://github.com/cadecode/uni-boot-cloud/commit/e91f96fb8e6426e898300e3499316f7150d39c5a))
* SimpleResAdvice 设置统一的
  Content-Type ([e6cb89b](https://github.com/cadecode/uni-boot-cloud/commit/e6cb89bcbbda8d4b6a22dea52cb79fb5a4fce3f2))
* typeHandler 添加 mapping
  方法 ([c86a2eb](https://github.com/cadecode/uni-boot-cloud/commit/c86a2ebed76880db13e65a03e4f61bfd9a50c153))
*
vo/dto改为内部类形式 ([107d819](https://github.com/cadecode/uni-boot-cloud/commit/107d8195c8a0114cc5647d0349f5ff9ebc73ca54))

### Performance Improvements

* 代码优化 ([aea7453](https://github.com/cadecode/uni-boot-cloud/commit/aea7453d4ac6e1d5c2ccbde0e124d013bab24235))
* 校验返回值改为
  JWTClaimsSet ([5f4ab55](https://github.com/cadecode/uni-boot-cloud/commit/5f4ab553f6a81051f6fb5980ec23196062144e23))
* 修改 SimpleRes
  取消内部类，减少码量 ([979a565](https://github.com/cadecode/uni-boot-cloud/commit/979a5650517a5071abac2df72186e08ed66a8a8f))
* 修改数据源配置方式，由列表改为
  map ([373b269](https://github.com/cadecode/uni-boot-cloud/commit/373b2696c0d9680d3f47fbccd59c3b3c41733393))
* 优化
  CollectUtil ([d128d58](https://github.com/cadecode/uni-boot-cloud/commit/d128d589fb1c7fd55ee084f025da3a31b066f9ee))
* 优化 StringUtil，添加 contains、subString
  方法 ([dabbd19](https://github.com/cadecode/uni-boot-cloud/commit/dabbd1962ea0c10e9f84d9eb22250ec4e54a7575))
* 优化代码
  SimpleResAdvice ([bd3aa0b](https://github.com/cadecode/uni-boot-cloud/commit/bd3aa0b1f47276757bb8f90b6a9cc194dfefca8b))
*
优化代码健壮性、异常处理 ([0735617](https://github.com/cadecode/uni-boot-cloud/commit/0735617fd71772630ccabb4ce916a001f9018721))



