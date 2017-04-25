package com.mykola.spring.aop;

import com.mykola.spring.camera.accessories.Lens;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Camera camera = (Camera) context.getBean("camera");
        Lens lens = (Lens) context.getBean("lens");

        camera.snap();
        camera.snap(1000);
        camera.snap("Prague castle");
        camera.snapNightTime();

        lens.zoom(5);

        context.close();

    }
}
