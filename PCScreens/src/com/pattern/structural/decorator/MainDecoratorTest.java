package com.pattern.structural.decorator;

public class MainDecoratorTest {
	public static void main(String[] args) {
		Monitors mon = new Monitors();
	        
		mon = new FlatMonitor(mon);
		mon = new CurvedMonitor(mon);
		mon = new SmartMonitor(mon);
	        
	    System.out.println("We have " + mon.description());
	}
}
