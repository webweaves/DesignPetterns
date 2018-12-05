package com.csw.design.patterns.observer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Driver extends Thread {
	
	private boolean shutdown = false;
	private MySensor sensor;
	
	public Driver(MySensor sensor) {
		this.sensor = sensor;
	}
	
	@Override
	public void run() {
		try {
			while (!this.shutdown) {
				String event = "New event: " + getCurrentTimeUsingCalendar();
				Float reading = new Random().nextFloat();
				sensor.updateSensor(event, reading);
		
				Thread.sleep((long)5*1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getCurrentTimeUsingCalendar() {
		Calendar cal = Calendar. getInstance();
		Date date=cal. getTime();
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		return dateFormat. format(date);
	}
	
	public void shutdown() {
		this.shutdown = true;
	}
}
