package com.mortgage.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mortgage.model.User;
import com.mortgage.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<User> register(@Valid @RequestBody User user){
		logger.info("user : " + user);
		User response = userService.register(user);
		return new ResponseEntity<User>(response, HttpStatus.OK);
	}
	
}
