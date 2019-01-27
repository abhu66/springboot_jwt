package com.abukhoerul.pulsaapi.controller;

import java.util.List;
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

import com.abukhoerul.pulsaapi.model.Voucher;
import com.abukhoerul.pulsaapi.repository.VoucherRepository;


@RestController
@RequestMapping("/api")
public class VoucherController{
	
	@Autowired
	private VoucherRepository voucherRepository;
	
	//controller ambil semua voucher
	@GetMapping("/voucher")
	public List<Voucher> getAll(){
		return voucherRepository.findAll();
	}
	
	//controller add new voucher
	@PostMapping(value = "/voucher",produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Voucher addVoucher(@Valid @RequestBody Voucher voucher) {
		return voucherRepository.save(voucher);
	}
	
	//controller login
	@GetMapping("/voucher/hargavoucher")
	public Optional<Voucher> findByOperatorIdAndPulsaId(@RequestParam(value="operatorId") Long operatorId,@RequestParam(value="pulsaId") Long pulsaId){
        return voucherRepository.findByOperatorIdAndPulsaId(operatorId,pulsaId);
	}
}
