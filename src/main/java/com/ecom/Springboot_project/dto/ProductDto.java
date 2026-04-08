package com.ecom.Springboot_project.dto;



import com.ecom.Springboot_project.entity.Category;

import lombok.Data;

@Data
public class ProductDto {
	private Long id;
	private String name;
	private Double price;
	private Integer quantity;
	private Category category;
	public void setCategoryName(String name2) {
		// TODO Auto-generated method stub
		
	}
}
