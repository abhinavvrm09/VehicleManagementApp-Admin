package com.cg.ovms.service;

import com.cg.ovms.entities.User;
import com.cg.ovms.repository.IUserRepository;

public class UserService implements IUserService {

	IUserRepository userService;
	
	@Override
	public User validateUser(User user) {
		// TODO Auto-generated method stub
		User user2= userService.findById(user.getUserId()).get();
		if(user.getPassword()==user2.getPassword())
		{
			return user;
		}
		else
		{
			return null;
		}
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userService.addUser(user);
	}

	@Override
	public User removeUser(User user) {
		// TODO Auto-generated method stub
		return userService.removeUser(user);
	}

	@Override
	public User signOut(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
