package com.season.vaccionation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.season.vaccionation.domain.Vaccine;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccine, Long>{
	
}
