package com.itnxd.spring;

import com.itnxd.spring.bean.Person;
import com.itnxd.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author niuxudong
 * @Date 2022/12/3 19:52
 * @Version 1.0
 * @Description 注解版使用
 */
public class AnnotationMainTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		/*Person person = context.getBean(Person.class);
		System.out.println(person);*/

		// 获取所有组件
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}
}
