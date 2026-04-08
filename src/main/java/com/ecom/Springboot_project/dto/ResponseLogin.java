package com.ecom.Springboot_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseLogin {
	
	private String message;
	private boolean success;

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
}
