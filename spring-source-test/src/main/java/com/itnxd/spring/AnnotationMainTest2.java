package com.itnxd.spring;

import com.itnxd.spring.bean.Person;
import com.itnxd.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author niuxudong
 * @Date 2022/12/5 21:57
 * @Version 1.0
 * @Description
 */
public class AnnotationMainTest2 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

		Person person = applicationContext.getBean(Person.class);

		// 1. 获取 @Autowired 装配的 ioc
		/*ApplicationContext context = person.getContext();

		System.out.println(applicationContext == context); // true*/

		// 2. 实现 ApplicationContextAware 接口后重写set方法也可获取ioc容器
		ApplicationContext context = person.getContext();
		System.out.println(applicationContext == context);

	}
}
