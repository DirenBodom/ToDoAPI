package com.cognixia.jump.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String userName;
	
	@Column(nullable = false)
	private String password;
	
	@OneToMany(mappedBy = "user")
	Set<ToDoStatus> status;
	
//	@ManyToMany
//	@JoinTable(
//			name = "todo_entity",
//			joinColumns =  @JoinColumn(name = "user_id"),
//			inverseJoinColumns = @JoinColumn(name = "todo_id"))
//	Set<ToDo> todos;
//	@ManyToMany
//	@JoinTable(
//	  name = "course_like", 
//	  joinColumns = @JoinColumn(name = "student_id"), 
//	  inverseJoinColumns = @JoinColumn(name = "course_id"))
//	Set<Course> likedCourses;
	
	public User() {
		this(-1, "N/A", "N/A", "N/A");
	}

	public User(Integer id, String userName, String p, String name) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = p;
		this.name = name;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public Set<ToDoStatus> getStatus() {
//		return status;
//	}

	public void setStatus(Set<ToDoStatus> status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", userName=" + userName + ", password=" + password + ", status="
				+ status + "]";
	}	
}
