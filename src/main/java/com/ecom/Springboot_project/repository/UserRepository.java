package com.ecom.Springboot_project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.Springboot_project.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
//	User save (User user);
	
	Optional<User> findByEmail(String email);
}
