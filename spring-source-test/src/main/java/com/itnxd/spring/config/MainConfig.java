package com.itnxd.spring.config;

import com.itnxd.spring.bean.Cat;
import com.itnxd.spring.bean.Person;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author niuxudong
 * @Date 2022/12/3 20:03
 * @Version 1.0
 * @Description
 */
@Import({Person.class, MainConfig.MyImportRegistrar.class,
		MainConfig.MyImportSelector.class}) // 第二种及第三种及第四种创建Bean方式
@Configuration
public class MainConfig {

	/**
	 * 第一种创建Bean方式
	 * @return
	 */
	/*@Bean
	public Person person() {
		Person person = new Person();
		person.setName("nxd");
		return person;
	}*/

	/**
	 * 第三种：ImportBeanDefinitionRegistrar，操作Bean定义注册中心
	 * 		注册Bean定义，无法进行属性赋值操作
 	 */
	static class MyImportRegistrar implements ImportBeanDefinitionRegistrar {

		/**
		 * 注册Bean定义信息
		 * @param importingClassMetadata annotation metadata of the importing class
		 * @param registry BeanDefinitionRegistry,Bean定义信息注册中心，图纸
		 *                 存储 beanName 与 BeanDefinition 映射
		 */
		@Override
		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

			RootBeanDefinition tomCatDefinition = new RootBeanDefinition();
			tomCatDefinition.setBeanClass(Cat.class);
			// 存储 beanName 与 BeanDefinition 映射
			registry.registerBeanDefinition("TomCat", tomCatDefinition);
		}
	}

	/**
	 * 第四种：使用 ImportSelector
	 */
	static class MyImportSelector implements ImportSelector {
		/**
		 * 返回需要注册组件的全类名信息
		 * @param importingClassMetadata
		 * @return
		 */
		@Override
		public String[] selectImports(AnnotationMetadata importingClassMetadata) {
			return new String[]{"com.itnxd.spring.bean.Cat"};
		}
	}
}
