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

import io.swagger.annotations.Api;

@Api(value="VehicleManagement")
@RestController
@RequestMapping(value="/vehicalManagement/user")
public class UserController {

	@Autowired
	IUserService userService;
	
	@PostMapping(value="/addUser")
	public ResponseEntity<Object> addUser(@RequestBody User user)
	{
		userService.addUser(user);
		return new ResponseEntity<Object>("added",HttpStatus.OK);
	}
	
	@DeleteMapping(value="/deleteById/{id}")
	public ResponseEntity<Object> deleteById(@RequestBody User user)
	{
		 userService.removeUser(user);
		 return new ResponseEntity<Object>("deleted",HttpStatus.OK);
	}
	
	@PostMapping(value="/validateUser")
	public ResponseEntity<Object> validateUser(@RequestBody User user)
	{
		if(userService.validateUser(user)==null)
		{
			return new ResponseEntity<Object>("invalid user",HttpStatus.NOT_FOUND);
		}
		else
		{
			return new ResponseEntity<Object>("user found",HttpStatus.OK);
		}
	}
}