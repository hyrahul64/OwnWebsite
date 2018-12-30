package com.rshah.webportal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String username;
	private String first;
	private String last;
	private String password;
	private String email;
	
	private String role;
	
	
	public User() {
		super();
	}
	public User(String first, String last, String password, String email) {
		super();
		this.first = first;
		this.last = last;
		this.password = password;
		this.email = email;
	}
	public User(String first, String last, String password, String email, String role) {
		super();
		this.first = first;
		this.last = last;
		this.password = password;
		this.email = email;
		this.role = role;
	}
	
	public User(Long id, String username, String first, String last, String password, String email, String role) {
		super();
		this.id = id;
		this.username = username;
		this.first = first;
		this.last = last;
		this.password = password;
		this.email = email;
		this.role = role;
	}
	
	public User(String username, String first, String last, String password, String email, String role) {
		super();
		this.username = username;
		this.first = first;
		this.last = last;
		this.password = password;
		this.email = email;
		this.role = role;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
