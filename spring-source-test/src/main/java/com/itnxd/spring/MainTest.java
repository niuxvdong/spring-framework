package com.itnxd.spring;

import com.itnxd.spring.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author niuxudong
 * @Date 2022/12/3 18:56
 * @Version 1.0
 * @Description
 */
public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person = context.getBean(Person.class);
		System.out.println(person);
	}
}
