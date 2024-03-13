package com.wang.entity;

import lombok.Data;

@Data
public class Goods {
    private Integer gId;
    private String name;
    private Double price;
    private Integer isDelete;

}
