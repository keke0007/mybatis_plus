package com.mp.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mp.entity.Employee;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jk
 * @since 2020-05-31
 */
public interface EmployeeService extends IService<Employee> {

    Page<Employee> selectByPage(Employee employee);
}
