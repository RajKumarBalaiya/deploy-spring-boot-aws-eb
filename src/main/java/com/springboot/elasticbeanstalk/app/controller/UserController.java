package com.springboot.elasticbeanstalk.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.elasticbeanstalk.app.model.UserModel;
import com.springboot.elasticbeanstalk.app.service.User_Service;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private User_Service user_Service;

	@PostMapping("/register")
	public boolean register(@RequestBody UserModel user) {
		return user_Service.register(user);
	}

	@PostMapping("/login")
	public boolean login(@RequestBody UserModel user) {
		return user_Service.register(user);
	}
}
