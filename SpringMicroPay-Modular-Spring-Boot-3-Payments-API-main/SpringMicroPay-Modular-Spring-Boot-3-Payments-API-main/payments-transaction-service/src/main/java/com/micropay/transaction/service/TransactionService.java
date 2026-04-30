package com.micropay.transaction.service;

import com.micropay.transaction.model.Transaction;
import com.micropay.transaction.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction save(Transaction txn) {
        return transactionRepository.save(txn);
    }
}
