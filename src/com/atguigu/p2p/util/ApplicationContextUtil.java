package com.atguigu.p2p.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextUtil implements ApplicationContextAware {
        
	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
                //初始化容器对象
		ApplicationContextUtil.applicationContext = applicationContext;
	}

	public static <T> T getBean(String name, Class<T> requiredType) {
		return applicationContext.getBean(name, requiredType);
	}

	public static Object getBean(String name) {
                //根据id获取实例
		return applicationContext.getBean(name);
	}

	public static <T> T getBean(Class<T> requiredType) {
                //根据class获取实例
		return applicationContext.getBean(requiredType);
	}

}
