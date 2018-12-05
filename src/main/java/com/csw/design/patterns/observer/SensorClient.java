package com.csw.design.patterns.observer;

public class SensorClient implements Observer {

	private static final int RUNTIME = 60;

	@Override
	public void update(Observable o) {
		MySensor sensor = (MySensor)o;
		System.out.println("Sensor has been updated: " + sensor.getLastEvent()
			+ ", reading: "+sensor.getLastReading());
	}
	
	public static void main(String[] args) {
		Setup s = new Setup();
		SensorClient sensorClient = new SensorClient();
		s.getSensor().add(sensorClient);
		
		System.out.println("Running for "+ RUNTIME + " seconds...");
		
		try {
			Thread.sleep(RUNTIME * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Shutting down!");
		s.shutdown();
	}
}
