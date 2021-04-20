package com.cg.ovms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ovms.entities.User;
import com.cg.ovms.service.IUserService;

@RestController
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	IUserService userService;
	
	@PostMapping(value="/addUser")
	public User addUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	
	@DeleteMapping(value="/deleteById/{id}")
	public User deleteById(@RequestBody User user)
	{
		return userService.removeUser(user);
	}
}