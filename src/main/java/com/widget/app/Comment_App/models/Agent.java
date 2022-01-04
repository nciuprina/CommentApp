package com.widget.app.Comment_App.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Agent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long agentId;
	private String username;
	private String email;
	private String password;

	public Agent() {
	}

	public Agent(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return agentId;
	}

	public void setId(Long id) {
		this.agentId = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", username=" + username + ", email=" + email + ", password=" + password
				+  "]";
	}

}
