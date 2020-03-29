package com.example.employee_management.controller;

import com.example.employee_management.modle.entity.Employee;
import com.example.employee_management.service.intf.EmployeeService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	//跳转到员工信息页面emps
	@GetMapping("/emps")
	public ModelAndView showEmpl(){
		ModelAndView modelAndView = new ModelAndView();
		List<Employee> employees=employeeService.seltAll();
		modelAndView.addObject("emps",employees);
		modelAndView.setViewName("show");
		return modelAndView;
	}

	//删除员工信息，并刷新页面
	@DeleteMapping("/emp/{emplNum}")
	public String delEmpl(@PathVariable("emplNum") Integer emplNum){
		System.out.println("进入delEmpl方法");
		employeeService.delEmpl(emplNum);
		return "redirect:/emps";
	}

	//跳转到添加页面
	@RequestMapping("/emp")
	public String toAdd() {
		return "add";
	}

	//添加员工，，并返回查看页面
	@PostMapping("/emp")
	public String AddEmlp(Employee employee){
		employeeService.insEmpl(employee);
		return "redirect:/emps";
	}

	//跳转到修改页面
	@RequestMapping("/toUpdate")
	public String toUpdate(){
		return "update";
	}
}
