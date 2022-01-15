package com.pattern.structural.observer;

public class PCMonitor implements Observer{

	@Override
	public void update(String screenType) {
		System.out.println("PC monitor is "+screenType+" type");
		
	}

}
