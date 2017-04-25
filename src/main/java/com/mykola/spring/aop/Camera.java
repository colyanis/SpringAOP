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

    public void snap(int exposure) {
        System.out.println("SNAP! Exposure: " + exposure);
    }

    public String snap(String name) {
        System.out.println("SNAP! Name: " + name);

        return name;
    }

    public void snapNightTime() {
        System.out.println("Snap! Night mode.");
    }
}
