package com.itnxd.spring.bean;

/**
 * @Author niuxudong
 * @Date 2022/12/3 19:03
 * @Version 1.0
 * @Description
 */
public class Person {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}
}
