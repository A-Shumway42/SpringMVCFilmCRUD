package com.skilldistillery.film.entities;

import java.time.LocalDateTime;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDateTime createdAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Customer [id: " + id + ", firstName: " + firstName + ", lastName: " + lastName + ", email: " + email
				+ ", createdAt: " + createdAt + "]";
	}

}