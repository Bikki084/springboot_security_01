package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class welcomeController{
	@GetMapping("/welcome")
	public String sayWelcome() {
		return "this is the welcome page without spring security";
	}
}