package com.mykola.spring.camera.accessories;

import org.springframework.stereotype.Component;

/**
 * Created by mtverdok on 4/25/2017.
 */
@Component
public class Lens {
    public void zoom(int factor) {
        System.out.println("Zooming lens:" + factor);
    }
}
