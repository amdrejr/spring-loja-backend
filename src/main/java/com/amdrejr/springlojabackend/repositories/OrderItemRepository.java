package com.amdrejr.springlojabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdrejr.springlojabackend.entities.OrderItem;
import com.amdrejr.springlojabackend.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> { } 