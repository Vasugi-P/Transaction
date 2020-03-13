package com.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.account.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
