package com.itnxd.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author niuxudong
 * @Date 2022/12/3 20:29
 * @Version 1.0
 * @Description
 */
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class Cat {

	public Cat() {
		System.out.println("Cat .............");
	}

	private String name;

	public String getName() {
		return name;
	}

	@Value("${JAVA_HOME}") // 属性自动赋值
	public void setName(String name) {
		System.out.println("Cat....setName......");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				'}';
	}
}
