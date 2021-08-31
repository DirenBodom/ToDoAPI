package com.cognixia.jump.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ToDo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false, name = "due_date")
	private LocalDate dueDate;
	
	@OneToMany(mappedBy = "todo")
    Set<ToDoStatus> status;
	
	public ToDo() {
		this(-1, "N/A", "N/A", LocalDate.now());
	}

	public ToDo(Integer id, String name, String description, LocalDate dueDate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Set<ToDoStatus> getStatus() {
		return status;
	}

	public void setStatus(Set<ToDoStatus> status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", name=" + name + ", description=" + description + ", status=" + ", dueDate=" + dueDate + "]";
	}
}
