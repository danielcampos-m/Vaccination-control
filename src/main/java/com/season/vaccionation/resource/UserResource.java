package com.season.vaccionation.resource;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.season.vaccionation.domain.User;
import com.season.vaccionation.dto.UserDTO;
import com.season.vaccionation.service.UserService;



@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService us;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody UserDTO userdto){
		User obj = us.fromDTO(userdto);
		obj = us.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
