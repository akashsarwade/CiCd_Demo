package com.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cicdController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Jenkins CICD Implementation";
		
	}
	
}
