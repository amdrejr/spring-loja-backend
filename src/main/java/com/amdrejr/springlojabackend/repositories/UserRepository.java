package com.amdrejr.springlojabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdrejr.springlojabackend.entities.User;

public interface UserRepository extends JpaRepository<User, Long> { }