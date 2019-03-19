package com.mortgage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mortgage.model.User;
import com.mortgage.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User register(User user) {
		return userRepository.save(user);
	}

	@Override
	public User login(String userName) {
		return userRepository.findByUserName(userName);
	}

	@Override
	public User findByUserID(long id) {
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public User findByUserNameAndPassword(String userName, String password) {
		
		return userRepository.findByUserNameAndPassword(userName, password);
	}

}
