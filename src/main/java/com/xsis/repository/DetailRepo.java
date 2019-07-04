package com.xsis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xsis.model.DetailTransaction;

public interface DetailRepo extends JpaRepository<DetailTransaction, Long> {

}

