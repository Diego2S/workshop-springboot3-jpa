package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepositoty;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepositoty repositoty;
	
	public List<Order> findAll(){
		return repositoty.findAll();
	} 
	
	public Order findById(Long id) {
		Optional<Order> obj = repositoty.findById(id);
		return obj.get();
	}
}
