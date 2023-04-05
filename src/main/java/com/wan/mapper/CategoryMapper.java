package com.wan.mapper;

import com.wan.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author moxinxin
* @description 针对表【category(菜品及套餐分类)】的数据库操作Mapper
* @createDate 2023-03-31 17:16:51
* @Entity generator.domain.Category
*/
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}




