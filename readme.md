spring-boot 版本：2.3.0.RELEASE（Spring Boot 从 2.3 版本开始使用 Gradle 编译，之前使用 maven 编译）

gradle 版本：6.4


## 运行测试文件，运行成功，编译完成 
spring-boot-project -> spring-boot -> test -> java -> org.springframework.boot.BannerTests#testDefaultBanner()

```bash
# 发布到Maven仓库
gradle publishToMavenLocal
```