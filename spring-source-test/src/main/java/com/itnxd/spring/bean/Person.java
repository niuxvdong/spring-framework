package com.itnxd.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

/**
 * Aware 接口：可以帮我们装配 Spring 底层的组件，通过回调机制利用 set 方法进行装配
 *
 * Bean 功能增强都是利用 BeanPostProcessor后置处理器 + InitializingBean
 *
 * 所有骚操作，增强逻辑都是利用后置处理器和初始化 Bean 完成
 *
 * @Author niuxudong
 * @Date 2022/12/3 19:03
 * @Version 1.0
 * @Description
 */
@Component
public class Person implements ApplicationContextAware, MessageSourceAware {

	/*@Autowired*/
	private ApplicationContext context;

	private MessageSource messageSource;

	private String name;

	/*@Autowired*/
	private Cat cat;

	public Person() {
		System.out.println("Person 对象创建"); // 13. 创建成功
	}


	public ApplicationContext getContext() {
		return context;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

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

	/**
	 * 利用回调机制，将ioc容器传入
	 * @param applicationContext the ApplicationContext object to be used by this object
	 * @throws BeansException
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
}
