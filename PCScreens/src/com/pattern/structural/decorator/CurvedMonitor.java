package com.pattern.structural.decorator;

public class CurvedMonitor extends ScreenType{
	
	private Monitors screen;
    
    public CurvedMonitor(Monitors screen) {
        this.screen = screen;
    }
    
    @Override
    public String description() {
        return screen.description() + " Curved monitor, ";
    }
}
