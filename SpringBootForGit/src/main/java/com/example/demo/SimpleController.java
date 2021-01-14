package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	public String getMessage() {
		return "Welcome to git !!!";
	}

}
