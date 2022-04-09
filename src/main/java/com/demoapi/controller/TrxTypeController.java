package com.demoapi.controller;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoapi.model.TrxType;
import com.demoapi.model.Users;
import com.demoapi.repository.TrxTypeRepository;
import com.demoapi.repository.UsersRepository;
import com.demoapi.responsebody.ResponseBodyListUsers;
import com.demoapi.utils.Utils;


@RestController
@RequestMapping("/api/trxType")
public class TrxTypeController {

	@Autowired
	private TrxTypeRepository trxTypeRepository;
	
	//add trx type
	@PostMapping(value = "/addTrxType", produces = "application/json", consumes = "application/json")
	@ResponseBody
	public TrxType addTrxType(@Valid @RequestBody TrxType trxType) {
	   
	
		
		return trxTypeRepository.save(trxType);
	}
}
