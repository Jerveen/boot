package com.jay.boot.model;

import lombok.Data;
import lombok.ToString;

/**
 * @description: 用户信息Model
 * @author: JerveenXu
 * @create: 2019-04-03 10:29
 **/
@Data
@ToString
public class Account {

    private String id;

    private String accountName;

    private String idNo;

    private String sex;

    private String mobile;
}
