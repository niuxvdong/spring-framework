package com.itnxd.spring.processor.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Author niuxudong
 * @Date 2022/12/9 0:05
 * @Version 1.0
 * @Description 生命周期接口
 */
@Component
public class MyInitializingBean implements InitializingBean {

	public MyInitializingBean() {
		System.out.println("MyInitializingBean");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MyInitializingBean.afterPropertiesSet");
	}
}
