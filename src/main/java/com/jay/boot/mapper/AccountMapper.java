package com.jay.boot.mapper;

import com.jay.boot.model.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @description: 用户信息
 * @author: Mr.Wang
 * @create: 2019-04-03 10:27
 **/
public interface AccountMapper {

    Account selectByPrimaryKey(String id);

    List<Account> listAccounts(Map<String, Object> params);
}
