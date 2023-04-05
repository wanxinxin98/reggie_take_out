package com.wan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wan.entity.Employee;
import com.wan.mapper.EmployeeMapper;
import com.wan.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @Author moxinxin
 * @Date 2023/3/30 15:56
 * @Version 1.0
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService {
}
