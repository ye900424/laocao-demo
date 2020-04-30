package com.spring.demo.laocao.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author C.A.O
 * @date 2020/4/26
 */
public class MyInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("拦截器："+ methodInvocation.getMethod().getName());
        return methodInvocation.proceed();
    }
}
