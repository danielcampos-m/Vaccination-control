package com.season.vaccionation.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.season.vaccionation.domain.User;
import com.season.vaccionation.dto.UserDTO;
import com.season.vaccionation.repository.UserRepository;
import com.season.vaccionation.service.exception.BadRequestException;
import com.season.vaccionation.service.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository ur;
	
	
	public void insert(User user) {
		try {
			ur.save(user);
		}catch(Exception e) {
			throw new BadRequestException("Bad Syntax");
		}
		
	}
	
	public User fromDTO(UserDTO obj) {
		return new User(obj.getId(),obj.getName(),obj.getCpf(),obj.getEmail(),obj.getNasc());
	}
	
	public User findById(Long id) {
		Optional<User> user = ur.findById(id);
		if(user.isEmpty()) {
			throw new ObjectNotFoundException("User not found");
		}
		return user.get();
	}
}
