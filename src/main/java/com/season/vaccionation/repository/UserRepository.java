package com.season.vaccionation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.season.vaccionation.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public User findById(String s);
	public User findByEmail(String e);
}
