package com.smps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smps.dto.UserDto;
import com.smps.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	 @PostMapping("/register")
	    public ResponseEntity<?> registerUser(@RequestBody UserDto userDto) {
	        try {
	             UserDto user = userService.registerUser(userDto);
	            return ResponseEntity.ok("User registered successfully: " + user.getUsername());
	        } catch (Exception e) {
	            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
	        }
	    }
	
	@GetMapping("/{username}")
    public ResponseEntity<?> getUser(@PathVariable String username) {
        return userService.findUserByUsername(username)
                .map(user -> ResponseEntity.ok(user))
                .orElse(ResponseEntity.notFound().build());
    }
	

}
