package com.csw.design.patterns.observer;

public class Setup {

	private Driver driver;
	private MySensor sensor;
	
	public Setup() {
		this.sensor = new MySensor();
		this.driver = new Driver(sensor);
		this.driver.start();
	}
	
	public MySensor getSensor() {
		return sensor;
	}

	public void shutdown() {
		this.driver.shutdown();
	}
}
