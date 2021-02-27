package com.season.vaccionation.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.season.vaccionation.domain.User;
import com.season.vaccionation.dto.UserDTO;
import com.season.vaccionation.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository ur;
	
	
	public User insert(User user) {
		
		return ur.save(user);
	}
	
	public User fromDTO(UserDTO obj) {
		return new User(obj.getId(),obj.getEmail(),obj.getCpf(),obj.getName(),obj.getNasc());
	}
}
