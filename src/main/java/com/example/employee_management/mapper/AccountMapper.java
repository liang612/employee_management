package com.example.employee_management.mapper;

import com.example.employee_management.modle.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountMapper {

	//查询账户密码
	@Select("SELECT * FROM user")
	List<Account> seltAccount();

	////根据账户名查询账号密码
	@Select("SELECT * FROM user WHERE account=#{account}")
	Account findAccount(String account);
}
