package com.wan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wan.entity.ShoppingCart;
import com.wan.mapper.ShoppingCartMapper;
import com.wan.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
