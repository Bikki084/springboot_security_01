package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	@GetMapping("/contact")
	public String saveContactInquiryDetails(String input) {
		return "inquiry details are saved to the DB";
	}
}
