package com.micropay.transaction.repository;

import com.micropay.transaction.model.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
