package com.ecom.Springboot_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Springboot_project.Service.ProductService;
import com.ecom.Springboot_project.entity.Product;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService=productService;
	}
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	@GetMapping	//get all products
	public List<Product> getProduct() {
		return productService.getAll();
	}
	@GetMapping("/test") 	//get single product
	public String test() {
		return "Project working";
	}

}
