package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({@ComponentScan("com.test.controller"), @ComponentScan("com.test.config")})
public class SpringBootSecurityTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityTestApplication.class, args);
	}
}
