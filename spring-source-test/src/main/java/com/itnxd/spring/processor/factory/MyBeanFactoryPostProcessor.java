package com.itnxd.spring.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @Author niuxudong
 * @Date 2022/12/8 23:40
 * @Version 1.0
 * @Description BeanFactory 后置增强
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor, PriorityOrdered {

	public MyBeanFactoryPostProcessor() {
		System.out.println("MyBeanFactoryPostProcessor ...................");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanFactoryPostProcessor.postProcessBeanFactory.............."); // 2.5 执行
	}

	@Override
	public int getOrder() {
		return 0; // 数字越小，优先级越高
	}
}
