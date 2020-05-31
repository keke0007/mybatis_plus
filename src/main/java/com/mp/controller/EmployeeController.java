package com.mp.controller;


import com.baomidou.mybatisplus.core.conditions.Condition;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mp.entity.Employee;
import com.mp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jk
 * @since 2020-05-31
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/page")
    public Page<Employee> selectByPage(Employee employee) {
        return employeeService.selectByPage(employee);
    }
}

