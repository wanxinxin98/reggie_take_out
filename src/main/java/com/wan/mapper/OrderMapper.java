package com.wan.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wan.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}