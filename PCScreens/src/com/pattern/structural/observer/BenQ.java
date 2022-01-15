package com.pattern.structural.observer;

public class BenQ implements Observer{

	@Override
	public void update(String screenType) {
		System.out.println("BenQ monitor is "+screenType+" type");
		
	}

}
