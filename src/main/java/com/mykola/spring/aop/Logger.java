package com.mykola.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by mtverdok on 4/24/2017.
 */
@Aspect
@Component
public class Logger {
    @Pointcut("args(com.mykola.spring.aop.Camera)")
    public void somePointcut() {
    }

    @Before("somePointcut()")
    public void somePointcutDemo(JoinPoint jp) {
        System.out.println("--- Before advice... ---");

        Arrays.stream(jp.getArgs()).forEach( (Object p) -> System.out.println("Argument: " + p));
    }
}
