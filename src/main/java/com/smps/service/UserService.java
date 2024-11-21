package com.smps.service;

import java.util.Optional;

import com.smps.dto.UserDto;

public interface UserService {

	UserDto registerUser(UserDto userDto);
	
//	UserDto updateUser(UserDto userDto, Long id);
	Optional<UserDto> findUserByUsername(String username);

	
	
	
}
