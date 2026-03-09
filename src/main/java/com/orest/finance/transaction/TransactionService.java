package com.orest.finance.transaction;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {


    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public List<Transaction> getAllTransactions() {
        return repository.findAll();
    }

    public Transaction createTransaction(Transaction transaction) {
        return repository.save(transaction);
    }

    public void deleteTransaction(Integer id) {
        repository.deleteById(id);
    }
}