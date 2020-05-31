package com.mp.service.impl;

import com.baomidou.mybatisplus.core.conditions.Condition;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mp.entity.Employee;
import com.mp.mapper.EmployeeMapper;
import com.mp.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jk
 * @since 2020-05-31
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

    @Override
    public Page<Employee> selectByPage(Employee employee) {
        IPage<Employee> page = this.page(new Page<>(1, 2),
                Condition.create(employee)
                        .between("age", 11, 50)
                        .eq("last_name", "Tom")
                        .eq("gender", 1)
        );
        return (Page<Employee>) page;
    }
}
