package com.example.demo.common;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class TestAop {
	@Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
	public void getMapping() {
		log.info("getMapping");
	}

	@Before("getMapping()")
	public void before(JoinPoint joinPoint) {
		log.info("before");
	}

	@AfterReturning(pointcut = "getMapping()", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		log.info("afterReturning");
	}

	@Around("getMapping()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		log.info("around");
		return joinPoint.proceed();
	}
}
