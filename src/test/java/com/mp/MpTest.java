//package com.mp;
//
//import com.baomidou.mybatisplus.core.conditions.Condition;
//import com.baomidou.mybatisplus.core.metadata.IPage;
//import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.mp.dao.EmployeeMapper;
//import com.mp.entity.Employee;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class MpTest {
//
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        return new PaginationInterceptor();
//    }
//
//    @Autowired
//    private ApplicationContext applicationContext;
//
//    @Autowired
//    private EmployeeMapper employeeMapper;
//
//    @Test
//    public void testDataSource() throws SQLException {
//        DataSource datasource = applicationContext.getBean("dataSource", DataSource.class);
//        System.out.println(datasource);
//        System.out.println(datasource.getConnection());
//    }
//
//    @Test
//    public void insertTest() {
//        Employee employee = new Employee();
//        employee.setId(1111);
//        employee.setAge(11);
//        employee.setLastName("mp");
//        int i = employeeMapper.insert(employee);
//        System.out.println(employee.getId());
//    }
//
//    @Test
//    public void queryWrapperTest() {
////        IPage<Employee> result = employeeMapper.selectPage(new Page<>(1, 2),
////                new QueryWrapper<Employee>()
////                        .between("age", 11, 50)
////                        .eq("last_name", "Tom")
////                        .eq("gender", 1)
////        );
//        IPage<Employee> result1 = employeeMapper.selectPage(new Page<>(1, 2),
//                Condition.create(new Employee())
//                        .between("age", 11, 50)
//                        .eq("last_name", "Tom")
//                        .eq("gender", 1)
//        );
//        System.out.println(result1);
//    }
//}
