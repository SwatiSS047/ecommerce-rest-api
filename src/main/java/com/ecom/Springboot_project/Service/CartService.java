package com.ecom.Springboot_project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Springboot_project.entity.Cart;
import com.ecom.Springboot_project.entity.Product;
import com.ecom.Springboot_project.entity.User;
import com.ecom.Springboot_project.repository.CartRepository;
import com.ecom.Springboot_project.repository.ProductRepository;
import com.ecom.Springboot_project.repository.UserRepository;

@Service
public class CartService {
	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public void addToCart(Long UserId, Long ProductId, Integer quantity) {
		User user = new User();
		Product product = productRepository.findById(ProductId).orElseThrow(
				() -> new RuntimeException("Productnot Found")
				);
	}
	
	public Cart addCart(Cart cart) {
	    Long productId = cart.getProduct().getId();
	    Product product = productRepository.findById(productId)
	        .orElseThrow(() -> new RuntimeException("Product not found"));
	    cart.setProduct(product);
	    return cartRepository.save(cart);
	}

	public void deleteCart(Long id) {
		if(!cartRepository.existsById(id)) {
			throw new RuntimeException("Cart not found");
		}
		cartRepository.deleteById(id);
	}

	public Cart updateCart(Long id, Cart cart) {
		
		Cart existingCart = cartRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Cart not found"));
		
		existingCart.setProduct(cart.getProduct());
		existingCart.setQuantity(cart.getQuantity());
		existingCart.setUser(cart.getUser());
	
		return cartRepository.save(existingCart);
	}

}
