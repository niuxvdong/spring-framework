package com.itnxd.spring.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author niuxudong
 * @Date 2022/12/8 23:43
 * @Version 1.0
 * @Description BeanDefinitionRegistry 后置增强（也是 BeanFactory 后置增强）
 *
 * BeanDefinitionRegistryPostProcessor是BeanFactoryPostProcessor子接口，因此重写的方法 postProcessBeanFactory 是父接口的方法
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	public MyBeanDefinitionRegistryPostProcessor() {
		System.out.println("MyBeanDefinitionRegistryPostProcessor...................");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanDefinitionRegistryPostProcessor.postProcessBeanFactory");
		// 1.6 对BeanFactory进行增强...（后执行）
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("MyBeanDefinitionRegistryPostProcessor.postProcessBeanDefinitionRegistry");
		// 1.5 这里可以对BeanDefinition注册中心进行增强，例如额外添加一些BeanDefinition（先执行）
	}
}
