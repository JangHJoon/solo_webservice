# solo_webservice
스프링 부트와 AWS로 혼자 구현하는 웹 서비스 연습

### 2020.01.29
##### 1. lombok 적용 문제
annotationProcessor 추가
````
dependencies {
    compile('org.springframework.boot:spring-boot-starter-web')
    compile('org.projectlombok:lombok:1.18.8')
    annotationProcessor('org.projectlombok:lombok:1.18.8')
    testCompile('org.springframework.boot:spring-boot-starter-test')
}
````
