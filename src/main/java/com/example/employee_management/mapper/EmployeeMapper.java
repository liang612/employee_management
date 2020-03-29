package com.example.employee_management.mapper;

import com.example.employee_management.modle.entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {
	//查询所有员工
	@Select("SELECT * FROM employee")
	List<Employee> seltAll();

	//删除员工
	@Delete("DELETE * FROM employee WHERE emplNum=#{emplNum}")
	void delEmpl(Integer emplNum);

	//添加员工
	@Insert("INSERT INTO employee(emplNum,emplName,duty,sex,age,address)" +
			" VALUES (#{emplNum},#{emplName},#{duty},#{sex},#{age},#{address})")
	void insEmpl(Employee employee);
}
