package com.smps.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smps.dto.UserDto;
import com.smps.repo.UserRepo;
import com.smps.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserDto registerUser(UserDto userDto) {
		
		
		return null;
	}

	@Override
	public UserDto findUserByUsername(String username) {
		
		return null;
	}

}
