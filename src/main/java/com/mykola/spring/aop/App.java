package com.mykola.spring.aop;

import com.mykola.spring.camera.accessories.Lens;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Camera camera = (Camera) context.getBean("camera");
        Lens lens = (Lens) context.getBean("lens");

        try {
            camera.snap();
        } catch (Exception e) {
            System.out.println("Cought exception " + e.getMessage() );
        }

//        context.close();

    }
}
