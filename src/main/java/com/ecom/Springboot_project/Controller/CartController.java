package com.ecom.Springboot_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Springboot_project.Service.CartService;
import com.ecom.Springboot_project.entity.Cart;

@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	private CartService cartService;
	
	//add cart
	@PostMapping
	public Cart addCart(@RequestBody Cart cart) {
		return cartService.addCart(cart);
	}
	
	//update cart
	@PutMapping("/{id}")
	public Cart updateCart(@PathVariable Long id, @RequestBody Cart cart) {
	    return cartService.updateCart(id, cart);
	}
	
	//delete cart
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCart(@PathVariable Long id) {
		cartService.deleteCart(id);
		return ResponseEntity.ok("Cart deleted successfully!");
	}
}
