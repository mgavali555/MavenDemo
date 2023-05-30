package com.learning.Maven.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	@RequestMapping("/helloWorld")
	public String getHelloWorld() {
		return  "Hello Maven Learning";
	}
}
