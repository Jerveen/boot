package com.jay.boot.service;

import com.jay.boot.model.Account;

/**
 * @description: 用户信息Service
 * @author: JerveenXu
 * @create: 2019-04-03 10:32
 **/
public interface AccountService {

    Account selectById(String id);
}
