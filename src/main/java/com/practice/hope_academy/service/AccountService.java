package com.practice.hope_academy.service;

import com.practice.hope_academy.entity.Account;
import com.practice.hope_academy.repository.AccountRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository ar;


    public void create(Account account) {

        ar.save(account);

    }

    public List<Account> getAllData() {

        return ar.findAll();
    }

    @Transactional
    public void update(Account account) {

        ar.save(account);
    }

    public void delete(Account account) {

        ar.delete(account);
    }
}




