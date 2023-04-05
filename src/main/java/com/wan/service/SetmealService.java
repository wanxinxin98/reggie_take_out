package com.wan.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wan.common.R;
import com.wan.dto.SetmealDto;
import com.wan.entity.Setmeal;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author moxinxin
* @description 针对表【setmeal(套餐)】的数据库操作Service
* @createDate 2023-03-31 18:21:36
*/
public interface SetmealService extends IService<Setmeal> {

    void saveSet(SetmealDto setmealDto);

    R<Page> pageList(int page,int pageSize);

    void updateSet(SetmealDto setmealDto);

    void removeSet(Long id);
}
