package com.example.employee_management.service.impl;

import com.example.employee_management.mapper.EmployeeMapper;
import com.example.employee_management.modle.entity.Employee;
import com.example.employee_management.service.intf.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	//查询所有员工
	@Override
	public List<Employee> seltAll() {

		return employeeMapper.seltAll();
	}

	//删除一位员工，并刷新
	@Override
	public void delEmpl(Integer id) {
		employeeMapper.delEmpl(id);
	}

	//添加一位员工，并返回查看页面
	@Override
	public void insEmpl(Employee employee) {
		employeeMapper.insEmpl(employee);
	}
}
