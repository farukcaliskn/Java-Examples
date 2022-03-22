package com.example.aop.serviceAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

	@Before("execution(* com.example.aop.service.*.*(..))")
	public void getMessageBefore(JoinPoint joinPoint) {

		System.out.println("getMessage metodundan önce paramere yakalandı : " + joinPoint.getArgs()[0]);
		System.out.println(joinPoint.getSignature());
	}

	@After("execution(* com.example.aop.service.*.*(..))")
	public void getMessageAfter(JoinPoint joinPoint) {

		System.out.println("getMessage metodundan sonra paramere yakalandı : " + joinPoint.getArgs()[0]);
		System.out.println(joinPoint.getSignature());
	}
}
