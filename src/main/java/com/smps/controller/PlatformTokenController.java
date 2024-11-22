package com.smps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smps.entity.PlatformToken;
import com.smps.service.PlatformTokenService;

@RestController
@RequestMapping("/platformToken")
public class PlatformTokenController {
	
	@Autowired
	private PlatformTokenService platformTokenService;

	@PostMapping("/create")
    public ResponseEntity<PlatformToken> createToken(@RequestBody PlatformToken platformToken){
		
		PlatformToken token = platformTokenService.createToken(platformToken);
		
		return new ResponseEntity<PlatformToken>(token,HttpStatus.CREATED);
		
	}
}
