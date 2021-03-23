package com.practiseApp.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pattern")
public class TestController {


	@RequestMapping("/test")
	public String testControl() {
		return "HelloWorld";
	}
	
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
	
}
