package com.example.springAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.springAnnotation")
@PropertySource("classpath:values.properties")
public class IocConfig {
	@Bean
	public ICustomerService service() {
		return new CustomerManeger(database());
	}

	@Bean
	public ICustomerDal database() {
		return new MysqlCustomerDal();
	}
}
