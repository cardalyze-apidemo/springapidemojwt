package com.cardalyze.springapidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.cardalyze.springapidemo"})
@SpringBootApplication
public class SpringapidemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringapidemoApplication.class, args);
	}
}
