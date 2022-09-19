package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.test.controller")
public class SpringBootSecurityTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityTestApplication.class, args);
	}

}
