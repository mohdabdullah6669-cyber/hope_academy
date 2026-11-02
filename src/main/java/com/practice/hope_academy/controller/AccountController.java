package com.practice.hope_academy.controller;


import com.practice.hope_academy.entity.Account;
import com.practice.hope_academy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/acc")
public class AccountController {

    @Autowired
    AccountService as;

    @PostMapping("/create/acc")
    // @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Account ac) {

        as.create(ac);

    }

    @GetMapping("/get")
    public List<Account> getData() {

        return as.getAllData();
    }

    @PutMapping("/acc/update/{accNum}")
    public void update(@PathVariable Long accNum, @RequestBody Account ac) {

        as.update(ac);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Account ac) {

        as.delete(ac);

    }

}
