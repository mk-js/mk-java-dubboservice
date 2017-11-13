# mk-java-dubboservice
配合mk框架使用的后端java项目

## 几个不同的使用方式
1. 纯后台Java计算逻辑
2. 简单Java计算 + Mybatis + Mysql数据库服务
3. 与eap-base集成的, 带BaseEntityMapper的方式
4. Spring boot框架下的集成


## 外部依赖
1. Zookeeper: 默认配置为127.0.0.1:2181, 如需修改, 请到 resource/config/dubbo.properties修改
2. Mysql: 默认配置为127.0.0.1:3306, 如需修改, 请到resource/config/db.properties修改

## 调试
默认调试接口8988
如需修改,请到bin/startup_dev.sh
