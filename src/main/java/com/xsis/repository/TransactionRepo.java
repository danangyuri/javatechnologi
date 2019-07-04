package com.xsis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xsis.model.ModelTransaction;


public interface TransactionRepo extends JpaRepository<ModelTransaction, Long> {

}
