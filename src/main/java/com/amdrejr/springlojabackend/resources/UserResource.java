package com.amdrejr.springlojabackend.resources;

import org.springframework.web.bind.annotation.RestController;

import com.amdrejr.springlojabackend.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "João", "123123",
            "joao@gmail.com", "joao123");
        return ResponseEntity.ok().body(u);
    }

    @GetMapping("/principal")
    public User getUser() {
        return new User(2l, "André", "00000", 
            "andre@mail.com", "12345");
    }
}

