package com.jay.boot.service.impl;

import com.jay.boot.mapper.AccountMapper;
import com.jay.boot.model.Account;
import com.jay.boot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 用户信息Service实现类
 * @author: JerveenXu
 * @create: 2019-04-03 10:34
 **/
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account selectById(String id) {
        return accountMapper.selectByPrimaryKey(id);
    }
}
