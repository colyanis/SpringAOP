package com.mykola.spring.aop;

import org.springframework.stereotype.Component;

@Component("camera")
public class Camera implements PhotoSnapper, Machine, ICamera {
	
	public Camera() {
		System.out.println("Hello from camera constructor");
	}

	@Deprecated
	public void snap() {
		System.out.println("SNAP!");

	}
	
	/* (non-Javadoc)
	 * @see com.caveofprogramming.spring.aop.ICamera#snap(int)
	 */
	public void snap(int exposure) {
		System.out.println("SNAP! Exposure:" + exposure);
	}

	public void snap(double exposure) {
		System.out.println("SNAP! Exposure:" + exposure);
	}

	public void snap(int exposure, double value) {
		System.out.println("SNAP! Exposure: " + exposure + ", " + value);
	}
	
	/* (non-Javadoc)
	 * @see com.caveofprogramming.spring.aop.ICamera#snap(java.lang.String)
	 */
	public String snap(String name) {
		System.out.println("SNAP! Name:" + name);
		
		return name;
	}
	
	/* (non-Javadoc)
	 * @see com.caveofprogramming.spring.aop.ICamera#snapNighttime()
	 */
	public void snapNighttime() {
		System.out.println("SNAP! Night mode.");
	}

	public void snapCar(Car car) {
		System.out.println("Snapping car!");
	}
}
