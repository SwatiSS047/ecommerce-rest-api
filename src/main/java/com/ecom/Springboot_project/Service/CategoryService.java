package com.ecom.Springboot_project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.ecom.Springboot_project.entity.Category;
import com.ecom.Springboot_project.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}

	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	public void deleteCategory(Long id) {
		if(!categoryRepository.existsById(id)) {
			throw new RuntimeException("Category not found");
		}
		categoryRepository.deleteById(id);
	}


	
}
