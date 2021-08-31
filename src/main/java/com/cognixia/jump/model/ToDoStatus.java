package com.cognixia.jump.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class ToDoStatus {
	@EmbeddedId
	ToDoEntity id;
	
	@ManyToOne
	@MapsId("userId")
	@JoinColumn(name = "user_id")
	User user;
	
	@ManyToOne
	@MapsId("todoId")
	@JoinColumn(name = "todo_id")
	ToDo todo;
	
	boolean status;
	
	public ToDoStatus() {
		this(new ToDoEntity(), new User(), new ToDo(), false);
	}

	public ToDoStatus(ToDoEntity id, User user, ToDo todo, boolean status) {
		super();
		this.id = id;
		this.user = user;
		this.todo = todo;
		this.status = status;
	}

	public ToDoEntity getId() {
		return id;
	}

	public void setId(ToDoEntity id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ToDo getTodo() {
		return todo;
	}

	public void setTodo(ToDo todo) {
		this.todo = todo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ToDoStatus [id=" + id + ", user=" + user + ", todo=" + todo + ", status=" + status + "]";
	}
}
