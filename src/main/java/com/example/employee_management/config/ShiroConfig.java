package com.example.employee_management.config;

import com.example.employee_management.utils.UserRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Shiro的配置类
 */
@Configuration
public class ShiroConfig {

	//1、创建ShiroFilterFactoryBean
	@Bean
	public ShiroFilterFactoryBean getShiroFilterFactoryBean(
			@Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager securityManager){
		ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
		//设置安全管理器
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		//添加Shiro内置过滤器
		/**
		 * Shiro内置过滤器，可以实现权限相关的拦截器
		 * 		常用的过滤器：
		 * 			anon：无需认证（登录）可以访问
		 * 			authc：必须认证才可以访问
		 * 			user：使用rememberMe的功能可以访问
		 * 			perms：该资源必须得到资源权限才可以访问
		 * 			role：该资源必须得到角色权限才可访问
		 */
		//定义LinkedHashMap存放需要拦截的请求
		Map<String,String > filterMap=new LinkedHashMap();
		//授权拦截，需要授权才能访问
		filterMap.put("/toAdd","perms[user:add]");
		//认证拦截，需要登录才能访问，否则返回登录界面
		filterMap.put("/toUpdate","authc");

		/*//使用通配的方式设置需要拦截的请求
		filterMap.put("/*","authc");// /*意味着所有请求都被拦截*/

		//设置当请求被拦截时返回的界面
		shiroFilterFactoryBean.setLoginUrl("/toLogin");
		shiroFilterFactoryBean.setUnauthorizedUrl("/toLogin");

		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
		return shiroFilterFactoryBean;
	}

	//2、创建DefaulWebSecurityManager安全管理器
	@Bean
	public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("userRealm")UserRealm userRealm){
		DefaultWebSecurityManager defaultWebSecurityManager=new DefaultWebSecurityManager();
		//设置Realm
		defaultWebSecurityManager.setRealm(userRealm);
		return  defaultWebSecurityManager;
	}

	//3、创建Realm（需要自定义Realm类）
	@Bean("userRealm")
	public UserRealm getUserRealm(){
		return new UserRealm();
	}
}
