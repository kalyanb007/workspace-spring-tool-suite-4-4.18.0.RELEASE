package com.example.demo.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="login")
public class Entity {
	@Id
	private int id;
	private String username;
	public Entity() {
		super();
	}
	public Entity(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;

}