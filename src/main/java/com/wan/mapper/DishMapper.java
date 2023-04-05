package com.wan.mapper;

import com.wan.entity.Dish;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author moxinxin
* @description 针对表【dish(菜品管理)】的数据库操作Mapper
* @createDate 2023-03-31 18:19:55
* @Entity generator.domain.Dish
*/
@Mapper
public interface DishMapper extends BaseMapper<Dish> {

}




