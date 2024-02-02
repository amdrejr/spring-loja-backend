package com.amdrejr.springlojabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdrejr.springlojabackend.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> { } 