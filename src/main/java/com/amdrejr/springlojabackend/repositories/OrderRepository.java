package com.amdrejr.springlojabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdrejr.springlojabackend.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> { }