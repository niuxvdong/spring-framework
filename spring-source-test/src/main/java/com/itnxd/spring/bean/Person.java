package com.itnxd.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @Author niuxudong
 * @Date 2022/12/3 19:03
 * @Version 1.0
 * @Description
 */
@Component
public class Person {

	private String name;

	/*@Autowired*/
	private Cat cat;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	/**
	 * 将 @Autowired 替换为 @Lookup，cat 为多例，则该方法获取 cat 每次都是重新创建新的
	 *
	 * 注意：@Bean 注册的Person 不会生效
	 * @return
	 */
	@Lookup
	public Cat getCat() {
		return cat;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}
}
