package com.wan.service;

import com.wan.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author moxinxin
* @description 针对表【category(菜品及套餐分类)】的数据库操作Service
* @createDate 2023-03-31 17:16:51
*/
public interface CategoryService extends IService<Category> {
    void remove(Long id);

}
