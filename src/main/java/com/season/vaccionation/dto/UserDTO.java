package com.season.vaccionation.dto;

import java.io.Serializable;

import com.season.vaccionation.domain.User;

public class UserDTO implements Serializable{

	private static final long serialVersionUID = 3176312273718630736L;
	private Long id;
	private String email;
	private String cpf;
	private String name;
	private String nasc;
	
	public UserDTO() {
		
	}
	
	public UserDTO(User obj) {
		id = obj.getId();
		email = obj.getEmail();
		cpf = obj.getCpf();
		name = obj.getName();
		nasc = obj.getNasc();
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNasc() {
		return nasc;
	}

	public void setNasc(String nasc) {
		this.nasc = nasc;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", email=" + email + ", cpf=" + cpf + ", name=" + name + ", nasc=" + nasc + "]";
	}
	
	
}
