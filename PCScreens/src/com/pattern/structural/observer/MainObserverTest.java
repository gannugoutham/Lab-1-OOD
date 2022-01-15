package com.pattern.structural.observer;

public class MainObserverTest {

	public static void main(String[] args) throws InterruptedException {

		Monitors monitor = new Monitors();

        Observer benq = new BenQ();
        Observer pc = new PCMonitor();
        Observer desktop = new DesktopMonitor();

        monitor.addObserver(benq);
        monitor.addObserver(pc);
        monitor.addObserver(desktop);
        
        monitor.CheckScreenTypeAvailable("LED");
        
        System.out.println("\nChanging montior type to LCD...\n");
        
        Thread.sleep(1000);
        
        monitor.CheckScreenTypeAvailable("LCD");

	}

}
