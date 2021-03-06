package com.mykola.spring.aop;

import com.mykola.spring.camera.accessories.Lens;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ICamera camera = (ICamera) context.getBean("camera");

        camera.snap();
        camera.snap(500);
        camera.snap(1.8);
        camera.snap(500, 1.8);
        camera.snapNighttime();

        Car car = (Car) context.getBean("car");
        car.start();

        camera.snapCar(new Car());

//        context.close();

    }
}
