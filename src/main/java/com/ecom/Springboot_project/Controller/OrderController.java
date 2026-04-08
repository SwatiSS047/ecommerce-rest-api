package com.ecom.Springboot_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Springboot_project.Service.OrderService;
import com.ecom.Springboot_project.entity.Order;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/place/{userId}")
    public Order placeOrder(@PathVariable Long userId){
        return orderService.placeOrder(userId);
    }

    @GetMapping("/user/{id}")   
    public List<Order> getOrders(@PathVariable Long id){   
        return orderService.getOrdersByUser(id);
    }
}