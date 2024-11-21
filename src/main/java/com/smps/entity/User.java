package com.smps.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String username;
	
	private String password;
	
	private String email;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	private String post;
	
	public enum Role{
		ADMIN,USER
	}
	
	

}
