package com.jay.boot.controller;

import com.jay.boot.model.Account;
import com.jay.boot.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 用户Controller
 * @author: JerveenXu
 * @create: 2019-04-03 10:35
 **/
@RestController
@RequestMapping("/account")
@Slf4j
public class AccountController {

    @Autowired
    private AccountService accountService;


    @GetMapping(value = "/getAccountById/{id}")
    public Account getAccountById(@PathVariable(value = "id") String id){
        // 判断参数是否为空
        if (StringUtils.isEmpty(id)){
            log.info("id is empty");
            return null;
        }
        // 查询具体信息
        Account account = accountService.selectById(id);
        return account;
    }
}
