package com.bit.framework.util;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeModule02 implements MethodBeforeAdvice {
/*
module 동작 전 작동...
func01
[]
com.bit.framework.service.Module02@25af5db5
~~~~~~~~~service~~~~~~~~~~~~
*/
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("module 동작 전 작동...");			
	}

}
