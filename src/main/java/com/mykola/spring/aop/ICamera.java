package com.mykola.spring.aop;

public interface ICamera {

	public abstract void snap();

	public abstract void snap(int exposure);
	public abstract void snap(double exposure);
	public abstract void snap(int exposure, double value);

	public abstract String snap(String name);

	public abstract void snapNighttime();

	void snapCar(Car car);
}