package com.abukhoerul.pulsaapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.abukhoerul.pulsaapi.model.Operator;
import com.abukhoerul.pulsaapi.repository.OperatorRepository;


@RestController
@RequestMapping("/api")
public class OperatorController{
	
	@Autowired
	private OperatorRepository operatorRepository;
	
	
	//controller ambil semua buku
	@GetMapping("/operator")
	public List<Operator> getAll(){
		return operatorRepository.findAll();
	}
	
	//controller add new user
	@PostMapping(value = "/operator",produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Operator addOperator(@Valid @RequestBody Operator operator) {
		return operatorRepository.save(operator);
	}
	
//	//controller login
//	@GetMapping("/listpulsabyoperatorid")
//	public List<Pulsa> listPulsa(@RequestParam(value="operatorName") String operatorName){
//        return operatorRepository.findByOperatorName(operatorName);
//	}
}
