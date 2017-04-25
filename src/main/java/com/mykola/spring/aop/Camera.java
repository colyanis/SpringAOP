package com.mykola.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by mtverdok on 4/24/2017.
 */
@Component
public class Camera {
    public void snap() {
        System.out.println("SNAP!");
    }
}
