package com.wan.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wan.common.BaseContext;
import com.wan.common.R;
import com.wan.entity.Orders;
import com.wan.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author moxinxin
 * @Date 2023/4/3 17:45
 * @Version 1.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 用户下单
     * @param orders
     * @return
     */
    @PostMapping("/submit")
    public R<String> submit(@RequestBody Orders orders){
        orderService.submit(orders);
        return R.success("成功");
    }

    @GetMapping("/userPage")
    public R<Page<Orders>> userPage(int page, int pageSize){
        //todo 重新封装成OrdersDto
        Long userId = BaseContext.getCurrentId();
        Page<Orders> pageInfo = new Page<>(page,pageSize);
        LambdaQueryWrapper<Orders> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Orders::getUserId,userId);
        orderService.page(pageInfo,queryWrapper);
        return R.success(pageInfo);
    }

}
