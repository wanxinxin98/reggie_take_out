package com.wan.service;

import com.wan.dto.DishDto;
import com.wan.entity.Dish;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author moxinxin
* @description 针对表【dish(菜品管理)】的数据库操作Service
* @createDate 2023-03-31 18:19:55
*/
public interface DishService extends IService<Dish> {
    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表:dish,dish_flavor
    void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息和对应的口味信息
    DishDto getByIdWithFlavor(Long id);

    void updateWithFlavor(DishDto dishDto);
}
