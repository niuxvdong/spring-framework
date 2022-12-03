package com.itnxd.spring.bean;

import lombok.Data;

/**
 * @Author niuxudong
 * @Date 2022/12/3 19:03
 * @Version 1.0
 * @Description
 */
@Data
public class Person {

	private String name;

	public void setName(String name) {
		this.name = name;
	}
}
