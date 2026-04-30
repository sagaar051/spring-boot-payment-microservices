package com.micropay.transaction.controller;

import com.micropay.transaction.model.Transaction;
import com.micropay.transaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public Transaction submit(@RequestBody Transaction txn) {
        return transactionService.save(txn);
    }
}
