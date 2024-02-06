package com.amdrejr.springlojabackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.amdrejr.springlojabackend.entities.User;
import com.amdrejr.springlojabackend.repositories.UserRepository;
import com.amdrejr.springlojabackend.services.exceptions.DataBaseException;
import com.amdrejr.springlojabackend.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(@NonNull User obj) {
        return userRepository.save(obj);
    }

    public void delete(long id) {
        try {
            userRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DataBaseException("The User probably has a order. Not possible to delete.");
        } 
    }

    public User update(long id, User user) {
        try {
            User entity = userRepository.getReferenceById(id);
            updateData(entity, user);
            return userRepository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(user);
        }
    }

    private void updateData(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        // entity.setPassword(user.getPassword());
        entity.setPhone(user.getPhone());
    }

}

