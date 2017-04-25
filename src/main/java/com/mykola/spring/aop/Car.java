package com.mykola.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by mtverdok on 4/25/2017.
 */
@Component
@Deprecated
public class Car {
    public void start() {
        System.out.println("Car starting");
    }
}
