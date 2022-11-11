package com.test.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@ComponentScans({@ComponentScan("com.test.controller"), @ComponentScan("com.test.config")})
@EnableJpaRepositories("com.test.repository")
@EntityScan("com.test.model")
@EnableWebSecurity(debug=true)
public class SpringBootSecurityTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityTestApplication.class, args);
	}
}
