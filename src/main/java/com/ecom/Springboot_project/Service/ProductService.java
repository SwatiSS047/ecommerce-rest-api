package com.ecom.Springboot_project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Springboot_project.dto.ProductDto;
import com.ecom.Springboot_project.entity.Product;
import com.ecom.Springboot_project.exception.ResourceNotFoundException;
import com.ecom.Springboot_project.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository=productRepository;
	}
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	public ProductDto convertToDto(Product product) {
		ProductDto productDto = new ProductDto();
		productDto.setId(product.getId());
		productDto.setName(product.getName());
		productDto.setPrice(product.getPrice());
		productDto.setQuantity(product.getQuantity());
		
		if(product.getCategory() != null ){
			productDto.setCategoryName(product.getCategory().getName());
		}
		return productDto;
	}
	
	public List<ProductDto> getAllProducts() {
		
		return productRepository.findAll()
				.stream().map(this::convertToDto).toList();
	}
	
	//get all products
	public ProductDto getproductById(Long id) throws Throwable{
		Product product = productRepository.findById(id).orElseThrow(()->
			new ResourceNotFoundException("Product not found"));
			
		return convertToDto(product);
	}

	public Product updateProduct(Long id, Product updatedProduct) {
		Product product = productRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Product not found"));
		
		product.setName(updatedProduct.getName());
		product.setPrice(updatedProduct.getPrice());
		product.setQuantity(updatedProduct.getQuantity());
		
		return productRepository.save(product);
	}
	
	public void deleteproduct(Long id) {
		productRepository.deleteById(id);
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	
}
