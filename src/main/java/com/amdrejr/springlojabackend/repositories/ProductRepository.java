package com.amdrejr.springlojabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdrejr.springlojabackend.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{ }
