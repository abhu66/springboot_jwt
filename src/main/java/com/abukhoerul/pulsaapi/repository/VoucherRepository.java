package com.abukhoerul.pulsaapi.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abukhoerul.pulsaapi.model.Voucher;


/**
 * 
 * @author khoerulAbu
 *
 */
public interface VoucherRepository extends JpaRepository<Voucher, Long>{
	
	Optional<Voucher> findByOperatorIdAndPulsaId(Long operatorId, Long pulsaId);
}
