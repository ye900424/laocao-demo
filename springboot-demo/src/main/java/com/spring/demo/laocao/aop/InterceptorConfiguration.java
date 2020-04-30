package com.spring.demo.laocao.aop;

import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author C.A.O
 * @date 2020/4/28
 */
@Configuration
public class InterceptorConfiguration {

    public static final String expression = "execution(* com.spring.demo.laocao..*.*(..))";


    @Bean
    public DefaultPointcutAdvisor defaultPointcutAdvisor2() {
        MyInterceptor interceptor = new MyInterceptor();
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression(expression);

        // 配置增强类advisor
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();
        advisor.setPointcut(pointcut);
        advisor.setAdvice(interceptor);
        return advisor;
    }

}
