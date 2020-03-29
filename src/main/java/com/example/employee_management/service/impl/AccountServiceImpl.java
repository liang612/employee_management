package com.example.employee_management.service.impl;

import com.example.employee_management.mapper.AccountMapper;
import com.example.employee_management.modle.entity.Account;
import com.example.employee_management.service.intf.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

	//注入Mapper
	@Autowired
	private AccountMapper accountMapper;


	@Override
	public List<Account> seltAccount() {

		return accountMapper.seltAccount();
	}

	@Override
	public Account findAccount(String account) {
		return accountMapper.findAccount(account);
	}
}
