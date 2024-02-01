package com.amdrejr.springlojabackend.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.amdrejr.springlojabackend.entities.User;
import com.amdrejr.springlojabackend.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    UserService userService;
    
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(userService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }
}

