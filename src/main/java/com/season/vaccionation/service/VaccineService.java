package com.season.vaccionation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.season.vaccionation.domain.Vaccine;
import com.season.vaccionation.dto.VaccineDTO;
import com.season.vaccionation.repository.UserRepository;
import com.season.vaccionation.repository.VaccineRepository;

@Service
public class VaccineService {
	
	@Autowired
	private VaccineRepository vr;
	
	@Autowired
	private UserRepository ur;
	
	public Vaccine fromDTO(VaccineDTO obj) {
		return new Vaccine(obj.getId(),obj.getName(),ur.findById(obj.getUserid()).get(),obj.getDate());
	}
	
	public Vaccine insert(Vaccine vaccine) {
		return vr.save(vaccine);
	}
}
