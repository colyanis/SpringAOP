package com.mykola.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by mtverdok on 4/24/2017.
 */
@Aspect
@Component
public class Logger {

    @Pointcut("execution(void com.mykola.spring.aop.Camera.snap())")
    public void cameraSnap() {
    }

    @Before("cameraSnap()")
    public void aboutToTakePhoto() {
        System.out.println("About to take photo...");
    }
}
