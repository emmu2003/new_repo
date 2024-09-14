package com.authentication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.authentication.entities.User;
import com.authentication.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/signUp")
	public String addUser(@ModelAttribute User user) {
		
		boolean status =service.usernameExist(user.getUsername());
		if(status == false) {
			service.addUser(user);
		}
		
		else {
			System.out.println("username alreday exist");
			
		}
		return "login";
	}
	
	@PostMapping("/login")
	public String ValidateUser(@RequestParam String username,
								@RequestParam String password) {
		
		boolean status= service.validateUser(username,password);
		if(status==true) {
			return "home";
		}
		else {
			return "login";
		}
	
	}

}
