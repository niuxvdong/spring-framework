package com.itnxd.spring.bean;

/**
 * @Author niuxudong
 * @Date 2022/12/3 20:29
 * @Version 1.0
 * @Description
 */
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
