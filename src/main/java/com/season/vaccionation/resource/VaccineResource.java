package com.season.vaccionation.resource;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.season.vaccionation.domain.Vaccine;
import com.season.vaccionation.dto.VaccineDTO;
import com.season.vaccionation.service.VaccineService;

@RestController
@RequestMapping(value="/vaccines")
public class VaccineResource {
	
	@Autowired
	private VaccineService vs;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody VaccineDTO vaccine){
		
		Vaccine newvaccine = vs.fromDTO(vaccine);
		vs.insert(newvaccine);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("").buildAndExpand(newvaccine.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
