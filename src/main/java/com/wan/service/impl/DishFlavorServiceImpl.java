package com.wan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wan.entity.DishFlavor;
import com.wan.service.DishFlavorService;
import com.wan.mapper.DishFlavorMapper;
import org.springframework.stereotype.Service;

/**
* @author moxinxin
* @description 针对表【dish_flavor(菜品口味关系表)】的数据库操作Service实现
* @createDate 2023-03-31 23:21:48
*/
@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor>
    implements DishFlavorService{

}




