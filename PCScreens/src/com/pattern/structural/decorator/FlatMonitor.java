package com.pattern.structural.decorator;

public class FlatMonitor extends ScreenType{
	
	private Monitors screen;
    
    public FlatMonitor(Monitors screen) {
        this.screen = screen;
    }
    
    @Override
    public String description() {
        return screen.description() + " Flat monitor, ";
    }
}
