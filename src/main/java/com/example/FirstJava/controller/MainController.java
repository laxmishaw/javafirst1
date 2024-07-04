package com.example.FirstJava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String home() {
		System.out.println("hello laxmi");
		return "home";
	}


	@RequestMapping("/test")
	public String test() {
		System.out.println("hello laxmi 1 ");
		return "test";
	}
}
