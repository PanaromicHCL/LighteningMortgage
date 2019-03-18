package com.mortgage.service;

import com.mortgage.model.User;

public interface UserService {

	User register(User user);
	
	User login(String userName);
	
	User findByUserID(long id);
	
	User findByUserName(String userName);
	
	User findByUserNameAndPassword(String userName,String password);
}
