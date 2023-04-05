package com.wan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wan.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author moxinxin
 * @Date 2023/3/30 15:53
 * @Version 1.0
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
