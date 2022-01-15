package com.pattern.structural.decorator;

public class SmartMonitor extends ScreenType{
	
	private Monitors screen;
    
    public SmartMonitor(Monitors screen) {
        this.screen = screen;
    }
    
    @Override
    public String description() {
        return screen.description() + " and Smart monitor";
    }
}
