package com.wang.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private Integer uId;
    private String username;
    private String password;
    private Integer isDelete;

    //实现一对多
    private List<Car> cars;
}
