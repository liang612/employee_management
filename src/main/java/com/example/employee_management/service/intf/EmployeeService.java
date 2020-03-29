package com.example.employee_management.service.intf;

import com.example.employee_management.modle.entity.Employee;

import java.util.List;

public interface EmployeeService {

	//查询所有员工
	List<Employee> seltAll();

	//删除员工
	void delEmpl(Integer emplNum);

	//添加员工
	void insEmpl(Employee employee);


}
