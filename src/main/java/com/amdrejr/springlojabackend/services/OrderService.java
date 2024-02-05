package com.amdrejr.springlojabackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdrejr.springlojabackend.entities.Order;
import com.amdrejr.springlojabackend.repositories.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(long id) {
        return orderRepository.findById(id).orElse(null);
    }
}

