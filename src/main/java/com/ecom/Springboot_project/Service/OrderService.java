package com.ecom.Springboot_project.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Springboot_project.entity.Cart;
import com.ecom.Springboot_project.entity.Order;
import com.ecom.Springboot_project.entity.OrderItem;
import com.ecom.Springboot_project.entity.User;
import com.ecom.Springboot_project.repository.CartRepository;
import com.ecom.Springboot_project.repository.OrderRepository;
import com.ecom.Springboot_project.repository.UserRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private UserRepository userRepository;

	public Order placeOrder(Long userId) {
		//get user
		User user = userRepository.findById(userId).orElseThrow(()->new RuntimeException("usernotfound"));
		
		//Get Cart Item
		List<Cart> cartItems = cartRepository.findByUserId(userId);

		List<OrderItem> orderItems = new ArrayList<>();

		double total = 0;

		for (Cart cart : cartItems) {
		    OrderItem item = new OrderItem();
		    item.setProduct(cart.getProduct());
		    item.setQuantity(cart.getQuantity());
		    item.setPrice(cart.getProduct().getPrice());

		    total += item.getPrice() * item.getQuantity();

		    orderItems.add(item);
		}
		
		//save order
		Order order = new Order();
		order.setUser(user);
		order.setTotalAmount(total);
		order.setItems(orderItems);
		
		Order savedOrder = orderRepository.save(order);
		
		//Delete order
		cartRepository.deleteAll();
		return savedOrder;
		
	}

	public List<Order> getOrdersByUser(Long userId) {
		return orderRepository.findByUserId(userId);
	}
	
}
