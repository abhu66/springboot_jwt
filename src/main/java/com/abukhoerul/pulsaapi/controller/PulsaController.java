package com.abukhoerul.pulsaapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.abukhoerul.pulsaapi.model.Pulsa;
import com.abukhoerul.pulsaapi.repository.PulsaRepository;


@RestController
@RequestMapping("/api")
public class PulsaController{
	
	@Autowired
	private PulsaRepository pulsaRepository;
	
	//controller ambil semua buku
	@GetMapping("/pulsa")
	public List<Pulsa> getAll(){
		return pulsaRepository.findAll();
	}
	
	//controller add new user
	@PostMapping(value = "/pulsa",produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Pulsa addPulsa(@Valid @RequestBody Pulsa pulsa) {
		return pulsaRepository.save(pulsa);
	}
	
	//controller login
	@GetMapping("/pulsa/pulsabyoperator")
	public List<Pulsa> listPulsa(@RequestParam(value="operatorId") Long operatorId){
        return pulsaRepository.findByOperatorId(operatorId);
	}
		
	
	
}
