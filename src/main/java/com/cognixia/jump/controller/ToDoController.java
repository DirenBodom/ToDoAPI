package com.cognixia.jump.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.ToDo;
import com.cognixia.jump.repository.ToDoRepository;

@RequestMapping("/api")
@RestController
public class ToDoController {
	
	@Autowired
	ToDoRepository repo;
	
	@GetMapping("/todo")
	public List<ToDo> getProducts() {
		return repo.findAll();
	}
	
	@PostMapping("/todo")
	public ResponseEntity<ToDo> createToDo(@RequestBody ToDo todo) {
		
		todo.setId(-1);
		
		ToDo created = repo.save(todo);
		
		return ResponseEntity.status(201).body(created);
	}
}