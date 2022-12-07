package com.itnxd.spring.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @Author niuxudong
 * @Date 2022/12/7 22:53
 * @Version 1.0
 * @Description 工厂 Bean 测试
 *
 * 工厂 Bean VS 普通 Bean ?
 *   - 普通 Bean：注册到容器的对象和类型确定，如 Person
 *   - FactoryBean：实现了FactoryBean接口的类，注册到容器中的对象不是 自己本身，而是
 *   				工厂Bean重写的 getObject 方法返回的对象，类型是 getObjectType 方法返回的类型
 *
 *   使用场景：Mybatis 和 Spring 整合 ---> SqlSessionFactoryBean (注册到容器的是SqlSession)
 */
public class HelloFactory implements FactoryBean<Hello> {

	@Override
	public Hello getObject() throws Exception {
		return new Hello();
	}

	@Override
	public Class<?> getObjectType() {
		return Hello.class;
	}
}
