package com.abukhoerul.pulsaapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abukhoerul.pulsaapi.model.Users;


public interface UsersRepository extends JpaRepository<Users, Long>{
	
	Optional<Users> findByUsernameAndPassword(String username, String password);

}
