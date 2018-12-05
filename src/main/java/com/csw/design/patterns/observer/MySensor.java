package com.csw.design.patterns.observer;

public class MySensor extends Observable {

	private String lastEvent;
	private float lastReading;
	
	public void updateSensor(String event, float reading) {
		setLastEvent(event);
		setLastReading(reading);
		notifyObservers();
	}

	public String getLastEvent() {
		return lastEvent;
	}

	public void setLastEvent(String lastEvent) {
		this.lastEvent = lastEvent;
	}

	public float getLastReading() {
		return lastReading;
	}

	public void setLastReading(float lastReading) {
		this.lastReading = lastReading;
	}		
		
}
