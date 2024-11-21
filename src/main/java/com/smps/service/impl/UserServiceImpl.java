package com.smps.service.impl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smps.dto.UserDto;
import com.smps.entity.User;
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
	    User user = modelMapper.map(userDto, User.class);

	   
	    User savedUser = userRepo.save(user);

	    return modelMapper.map(savedUser, UserDto.class);
	}


	@Override
	public Optional<UserDto> findUserByUsername(String username) {
	    return userRepo.findByUsername(username)
	                         .map(user -> modelMapper.map(user, UserDto.class));
	}


}
