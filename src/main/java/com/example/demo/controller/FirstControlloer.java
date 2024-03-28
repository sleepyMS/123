package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstControlloer {
	
	@GetMapping("/home")
	public String homeMethod() {
		return "home";
	}

	@GetMapping("/member/add")
	public String memberMethod() {
		return "member/add";
	}

}
