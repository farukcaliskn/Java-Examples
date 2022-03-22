package com.example.springAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(IocConfig.class);
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		customerService.add();
	}

}
