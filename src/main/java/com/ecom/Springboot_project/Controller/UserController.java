package com.ecom.Springboot_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Springboot_project.Service.UserService;
import com.ecom.Springboot_project.dto.RequestLogin;
import com.ecom.Springboot_project.dto.ResponseLogin;
import com.ecom.Springboot_project.entity.User;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return service.register(user);
	}
	@PostMapping("/login")
	public ResponseLogin login(@RequestBody RequestLogin requestLogin) {
		return service.login(requestLogin);
	}
	
}
