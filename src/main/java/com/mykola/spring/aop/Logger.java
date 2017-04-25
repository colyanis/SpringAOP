package com.mykola.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by mtverdok on 4/24/2017.
 */
@Aspect
@Component
public class Logger {

    @Pointcut("execution(* com.mykola.spring.aop.Camera.snap())")
    public void cameraSnap() {
    }

    @Before("cameraSnap()")
    public void beforeAdvice() {
        System.out.println("Before advice...");
    }

    @After("cameraSnap()")
    public void afterAdvice() {
        System.out.println("After advice...");
    }

    @AfterReturning("cameraSnap()")
    public void afterReturningAdvice() {
        System.out.println("After returning advice...");
    }

    @AfterThrowing("cameraSnap()")
    public void afterThrowingAdvice() {
        System.out.println("After throwing advice...");
    }

    @Around("cameraSnap()")
    public void aroundAdvice(ProceedingJoinPoint p) {
        System.out.println("Around advice (before)...");

        try {
            p.proceed();
        } catch (Throwable throwable) {
            System.out.println("In around advice: " + throwable.getMessage());
        }

        System.out.println("Around advice (after)...");
    }
}
