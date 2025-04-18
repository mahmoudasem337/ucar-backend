package com.graduationproject.asem.User;

import jakarta.persistence.*;

@Entity
@Table
public class User {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String username;
	    private String password;
	    @Enumerated(EnumType.STRING)
		private Role role;
	    private String phonenumber;
		private String email;

	public User() {
	}

	public User(Long id, String username, String password, Role role, String phonenumber, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.phonenumber = phonenumber;
		this.email = email;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
