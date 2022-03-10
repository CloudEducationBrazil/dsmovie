package com.devsuperior.dsmovie.dto;

import java.util.Objects;

import com.devsuperior.dsmovie.entities.User;

public class UserDTO {
	private Long id;
	private String email;
	
	public UserDTO() {}

	public UserDTO(Long id, String email) {
		this.id = id;
		this.email = email;
	}
	
	public UserDTO(User user) {
		id = user.getId();
		email = user.getEmail();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", email=" + email + "]";
	}
}
