package com.csw.design.patterns.observer;

import java.util.HashSet;
import java.util.Set;

public abstract class Observable {

	private Set<Observer> observers;

	public Observable() {
		observers = new HashSet<>();
	}
	
	protected void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

	public void add(Observer o) {
		System.out.println("Adding an observer");
		observers.add(o);
	}

	public void remove(Observer o) {
		observers.remove(o);
	}
	
	public Set<Observer> getObservers() {
		return observers;
	}

	public void setObservers(Set<Observer> observers) {
		this.observers = observers;
	}
}
