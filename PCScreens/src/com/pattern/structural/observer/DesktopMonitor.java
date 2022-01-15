package com.pattern.structural.observer;

public class DesktopMonitor implements Observer{

	@Override
	public void update(String screenType) {
		System.out.println("Desktop monitor is "+screenType+" type");
		
	}

}
