SpringCamp Boot Example
=======================

> 부트 개발 이후 maven을 이용해서 jar가 아닌 war로 배포 하는 법

1. SpringBootServletInitializer 를 확장
	* main함수를 실행하는 구조가 아닌 SpringBootServletInitializer를 extend 시켜서 실행하는 구조
	
2. pom.xml에서의 설정
	* start-web에서 starter-tomcat을 제외 시킨후
	* compile을 위해서 provided로 다시 start-tomcat을 추가 시켰습니다.
		* 이부분은 servlet-api등으로 커스터마이징 할수 있음
	
```
	<dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-tomcat</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <scope>provided</scope>
        </dependency>
    </dependencies>
```