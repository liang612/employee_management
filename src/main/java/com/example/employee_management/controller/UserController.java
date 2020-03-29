package com.example.employee_management.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {


	//默认访问页面
	@RequestMapping({"/","/login.html","/toLogin"})
	public String toLogin(){
		return "login";
	}

	//登录验证
	@RequestMapping("/login")
	public String Login(String accountName, String password, Model model, HttpSession session) {
		/**
		 * 进行shiro登录认证
 		 */
		//1、获取Subject
		Subject subject = SecurityUtils.getSubject();
		//2、封装用户数据
		UsernamePasswordToken token = new UsernamePasswordToken(accountName,password);
		//3、执行登录方法
		try {
			subject.login(token);
			session.setAttribute("loginName",accountName);
			//登录成功，跳转到main.html界面
			return "main";
		}catch (UnknownAccountException e){
			model.addAttribute("msg","用户不存在");
			return "login";
		}catch (IncorrectCredentialsException e){
			model.addAttribute("msg","密码错误");
			return "login";
		}
	}


}
