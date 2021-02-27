package com.season.vaccionation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.season.vaccionation.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public Optional<User> findById(Long s);
	public User findByEmail(String s);
}
