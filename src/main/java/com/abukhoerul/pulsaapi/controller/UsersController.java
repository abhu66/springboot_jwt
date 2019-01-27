package com.abukhoerul.pulsaapi.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.abukhoerul.pulsaapi.model.Users;
import com.abukhoerul.pulsaapi.repository.UsersRepository;


@RestController
@RequestMapping("/api")
public class UsersController{
	
	@Autowired
	private UsersRepository usersRepository;
	
	
	//controller login
	@GetMapping("/login")
	public Optional<Users> loginProcess(@RequestParam(value="username") String username, @RequestParam(value="password") String password){
        return usersRepository.findByUsernameAndPassword(username, password);
	}
	
	//controller add new user
	@PostMapping(value = "/users",produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Users addUsers(@Valid @RequestBody Users users) {
		return usersRepository.save(users);
	}
}
