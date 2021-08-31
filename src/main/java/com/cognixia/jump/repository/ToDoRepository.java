package com.cognixia.jump.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.model.ToDo;

//JpaRepository -> interface that can be use to manage data
//-> we are managing data for a ToDo, that has a primary key of type Integer

//@Repository -> marks/label this is a repository (thing that handles management of data)

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Integer> {

}
