package com.example.employee_management.service.intf;

import com.example.employee_management.modle.entity.Account;

import java.util.List;

public interface AccountService {

	//查询所有账户密码
	List<Account> seltAccount();

	//根据账户名查询账号密码
	Account findAccount(String account);
}
