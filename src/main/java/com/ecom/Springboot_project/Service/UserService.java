package com.ecom.Springboot_project.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Springboot_project.dto.RequestLogin;
import com.ecom.Springboot_project.dto.ResponseLogin;
import com.ecom.Springboot_project.entity.User;
import com.ecom.Springboot_project.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User register(User user) {
		return userRepository.save(user);
	}

	public ResponseLogin login(RequestLogin requestLogin) {
		if(requestLogin.getEmail() == null || requestLogin.getEmail().isEmpty()) {
			return new ResponseLogin("Email is Mandatory", false);
		}
		if(requestLogin.getPassword() == null || ((String) requestLogin.getPassword()).isEmpty()) {
			return new ResponseLogin("Password is Mandatory", false);
		}
	
		Optional<User> user = userRepository.findByEmail(requestLogin.getEmail());
		if(user.isPresent()){
			if(user.get().getPassword().equals(requestLogin.getPassword())) {
				return new ResponseLogin("Login Success", true);
			}else {
				return new ResponseLogin("Invalid Password", false);
			}
		}
		else {
			return new ResponseLogin("Data not found", false);
		}
	}
}
