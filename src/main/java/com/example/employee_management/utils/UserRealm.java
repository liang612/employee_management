package com.example.employee_management.utils;

import com.example.employee_management.modle.entity.Account;
import com.example.employee_management.service.impl.AccountServiceImpl;
import com.example.employee_management.service.intf.AccountService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 自定义Realm
 */
public class UserRealm  extends AuthorizingRealm {
	@Autowired
	private AccountService accountService;
	//执行授权逻辑
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		System.out.println("执行授权逻辑");
		return null;
	}

	//执行认证逻辑
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		System.out.println("执行认证逻辑");

		//编写Shiro逻辑代码，判断用户名和密码
		//1、验证账户是否存在
		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
		//从数据库获取账号对象
		Account account = accountService.findAccount(token.getUsername());

		//如果没有返回结果，则无此账号
		if(account==null){
			return null; //返回null，shiro底层会返回UnknownAccountException
		}
		//2、验证密码是否正确，创建AutnenticationInfo的子类SimpleAutenticationInfo传入密码，则Shiro会自动验证
		return new SimpleAuthenticationInfo("",account.getPasswork(),"");
	}
}
