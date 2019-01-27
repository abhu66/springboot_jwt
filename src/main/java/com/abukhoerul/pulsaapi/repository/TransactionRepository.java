package com.abukhoerul.pulsaapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.abukhoerul.pulsaapi.model.Transaction;


public interface TransactionRepository extends JpaRepository<Transaction, Long>{
	
	@Query(value = "SELECT * FROM Transaction WHERE users_id  = ?1 order by id desc", nativeQuery = true)
	List<Transaction> findByUsersId(Long usersId);


}
