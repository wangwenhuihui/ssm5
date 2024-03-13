package com.wang.mapper;

import com.wang.entity.Car;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICarMapper {
    List<Car> findCarByUid(@Param("uId") Integer uId);
}
