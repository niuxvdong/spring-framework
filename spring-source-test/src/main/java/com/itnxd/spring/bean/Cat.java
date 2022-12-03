package com.itnxd.spring.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author niuxudong
 * @Date 2022/12/3 20:29
 * @Version 1.0
 * @Description
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class Cat {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				'}';
	}
}
