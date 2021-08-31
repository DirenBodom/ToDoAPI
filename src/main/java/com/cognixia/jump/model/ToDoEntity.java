package com.cognixia.jump.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ToDoEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@Column(name = "user_id")
	int userId;
	
	@Column(name = "todo_id")
	int todoId;
	
	public ToDoEntity() {
		this(-1, -1);
	}

	public ToDoEntity(int userId, int todoId) {
		super();
		this.userId = userId;
		this.todoId = todoId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getTodoId() {
		return todoId;
	}

	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(todoId, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToDoEntity other = (ToDoEntity) obj;
		return todoId == other.todoId && userId == other.userId;
	}

	@Override
	public String toString() {
		return "ToDoEntity [userId=" + userId + ", todoId=" + todoId + "]";
	}
}
