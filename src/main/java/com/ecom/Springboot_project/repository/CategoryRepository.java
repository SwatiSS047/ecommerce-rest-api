package com.ecom.Springboot_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.Springboot_project.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

