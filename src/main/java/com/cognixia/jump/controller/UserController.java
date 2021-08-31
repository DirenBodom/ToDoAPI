package com.cognixia.jump.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.User;
import com.cognixia.jump.repository.UserRepository;

@RequestMapping("/api")
@RestController
public class UserController {
	
	@Autowired
	UserRepository repo;
	
	// Get users by their username and password
	@GetMapping("/user/{username}/{password}")
	public User findByUsername(@PathVariable String username, @PathVariable String password) {
		
		return repo.findByUserNameAndPassword(username, password);
	}
	
	// Create a new user
	@PostMapping("/user")
	public ResponseEntity<User> addUser(@Valid @RequestBody User user) {
		user.setId(-1);
		
		User created = repo.save(user);
		
		return ResponseEntity.status(201).body(created);		
	}
	
	// Pull todos for a single user
//	@GetMapping("/user/{id}")
//	public List<ToDo> 
}