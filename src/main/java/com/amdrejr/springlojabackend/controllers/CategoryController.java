package com.amdrejr.springlojabackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdrejr.springlojabackend.entities.Category;
import com.amdrejr.springlojabackend.services.CategoryService;

@RestController
@RequestMapping("/categorys")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        return ResponseEntity.ok().body(categoryService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(categoryService.findById(id));
    }
}
