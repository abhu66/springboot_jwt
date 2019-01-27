package com.abukhoerul.pulsaapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abukhoerul.pulsaapi.model.Pulsa;


public interface PulsaRepository extends JpaRepository<Pulsa, Long>{
	List<Pulsa> findByOperatorId(Long operatorId);


}
