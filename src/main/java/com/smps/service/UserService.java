package com.smps.service;

import com.smps.dto.UserDto;

public interface UserService {

	UserDto registerUser(UserDto userDto);
	
//	UserDto updateUser(UserDto userDto, Long id);
	
	UserDto findUserByUsername(String username);
	
	
	
}
