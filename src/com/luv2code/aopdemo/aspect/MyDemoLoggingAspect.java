package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
		
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}
		
	@Before("forDaoPackage()")
	public void AddAccountAdvice() {		
		System.out.println("\n=====>>> Excuting @Before advice on addAccount()");
	}
	
	@Before("forDaoPackage()")
	public void performApiAnalytic() {
		System.out.println("\n=====>>> Peforming API analytics");
	}

}
