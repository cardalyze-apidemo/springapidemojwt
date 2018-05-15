# springapidemojwt
Spring Boot with JWT Security Example Code

This a tutorial for building API using Spring Boot. 
Project was created by Spring Initializer and Web, Actuator and Devtools options were added. 
The model package contains the entity classes Restaurant and Entree. 
The controller package contains the key class of RestaurantController which has the REST annotation.

This also has Spring Security and JWT dependencies added.
Look inside the security package that adds the Filter and Authentication Managers to enable JWT for security.

This example adds to springapidemo project in this repo.
The dependencies added are below

<!-- Add security -->
<dependency>
    		<groupId>org.springframework.boot</groupId>
    		<artifactId>spring-boot-starter-security</artifactId>
</dependency>


<!-- spring and jwt -->
<dependency>
		    <groupId>org.springframework.security</groupId>
		    <artifactId>spring-security-jwt</artifactId>
		    <version>1.0.9.RELEASE</version>
</dependency>

<!-- json web tokens of JWT -->
<dependency>
    		<groupId>io.jsonwebtoken</groupId>
    		<artifactId>jjwt</artifactId>
    		<version>0.7.0</version>
</dependency>
