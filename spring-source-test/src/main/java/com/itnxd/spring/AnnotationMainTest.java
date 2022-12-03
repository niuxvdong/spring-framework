package com.itnxd.spring;

import com.itnxd.spring.bean.Cat;
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
		/*String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}*/

		// cat 为 prototype
		Cat cat1 = context.getBean(Cat.class);
		Cat cat2 = context.getBean(Cat.class);
		System.out.println(cat1 == cat2); // prototype false

		// cat 为 prototype，person 默认单例，person 包含 cat
		Person person1 = context.getBean(Person.class);
		Person person2 = context.getBean(Person.class);
		// person 单例，所以内部的 cat 都是容器中第一个创建的 cat
		System.out.println(person1.getCat() == person2.getCat()); // true -> false
		System.out.println(person1 == person2); // true -> true
		// 将 @Autowired 替换为 @Lookup，cat 为多例，则该方法获取 cat 每次都是重新创建新的。

	}
}
