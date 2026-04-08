package com.ecom.Springboot_project.dto;

import lombok.Data;

@Data
public class RequestLogin {
	private String name;
	private String email;
	public String getEmail() {
		
		return email;
	}
	private String password;

	public String getPassword() {
	    return password;
	}
	
}
