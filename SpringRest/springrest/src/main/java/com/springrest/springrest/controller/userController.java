package com.springrest.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class userController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "hello";
}
}
