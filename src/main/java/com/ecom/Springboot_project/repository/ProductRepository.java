package com.ecom.Springboot_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.Springboot_project.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
