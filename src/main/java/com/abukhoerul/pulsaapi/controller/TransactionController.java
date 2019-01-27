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

import com.abukhoerul.pulsaapi.model.Transaction;
import com.abukhoerul.pulsaapi.repository.TransactionRepository;


@RestController
@RequestMapping("/api")
public class TransactionController{
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	//controller ambil semua transaksi
	@GetMapping("/transaction")
	public List<Transaction> getAll(){
		return transactionRepository.findAll();
	}
	
	//controller add new transaction
	@PostMapping(value = "/transaction",produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Transaction addTransaction(@Valid @RequestBody Transaction transaction) {
		return transactionRepository.save(transaction);
	}
	

	@GetMapping("/transaction/listbyuserid")
	public List<Transaction> listByUsersId(@RequestParam(value="usersId") Long usersId){
        return transactionRepository.findByUsersId(usersId);
	}
}
