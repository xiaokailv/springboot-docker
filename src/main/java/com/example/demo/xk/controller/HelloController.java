package com.example.demo.xk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("hello")
	public String hello() {
		return "hello,dockerFile for springboot!";
	}
	

}
