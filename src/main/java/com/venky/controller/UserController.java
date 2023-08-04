package com.venky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@GetMapping("/login")
	public String loginPage() {
		return "login";	}
	@GetMapping("/signup")
	public String signUpPage() {
		return "signup";	}
	@GetMapping("/forgot")
	public String forgotPwdPage() {
		return "forgotPwd";	}
	@GetMapping("/unlock")
	public String unlockPage() {
		return "unlock";	}


}
