package com.season.vaccionation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.season.vaccionation.domain.User;
import com.season.vaccionation.domain.Vaccine;
import com.season.vaccionation.dto.VaccineDTO;
import com.season.vaccionation.repository.VaccineRepository;
import com.season.vaccionation.service.exception.ObjectNotFoundException;

@Service
public class VaccineService {
	
	@Autowired
	private VaccineRepository vr;
	
	
	@Autowired
	private UserService us;
	
	public Vaccine fromDTO(VaccineDTO obj) {
		User user = new User();
		if(obj.getUserid() != null) {
			user = us.findById(obj.getUserid());
		}else {
			throw new ObjectNotFoundException("Id must not be null");
		}
		return new Vaccine(obj.getId(),obj.getName(),user,obj.getDate()); 
	}
	
	public void insert(Vaccine vaccine) {
		try {
			 vr.save(vaccine);
		}catch(Exception e) {
			throw new ObjectNotFoundException("Bad Syntax");
		}
	}
	
	
}
