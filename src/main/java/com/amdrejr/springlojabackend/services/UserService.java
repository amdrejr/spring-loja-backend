package com.amdrejr.springlojabackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.amdrejr.springlojabackend.entities.User;
import com.amdrejr.springlojabackend.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User insert(@NonNull User obj) {
        return userRepository.save(obj);
    }

    public void delete(long id) {
        userRepository.deleteById(id);
    }
}

