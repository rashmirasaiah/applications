package com.target.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {	
	
	@RequestMapping("/entry")
	public String login() {		
		return "entry";		
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return "logout";
	}
	
	@RequestMapping("/registerView")
	public String registerView() {
		return "newAccountRegistration";
	}
	
}
