package com.pattern.structural.observer;

import java.util.ArrayList;
import java.util.List;

public class Monitors implements Subject{

	private List<Observer> listOfObservers;
    private String typeOfScreen;    
    
    public Monitors() {
        listOfObservers = new ArrayList<Observer>();
    }
    
    public List<Observer> getListOfObservers() {
		return listOfObservers;
	}

	public void setListOfObservers(List<Observer> listOfObservers) {
		this.listOfObservers = listOfObservers;
	}

	
	
    
	

	public String getTypeOfScreen() {
		return typeOfScreen;
	}

	public void setTypeOfScreen(String typeOfScreen) {
		this.typeOfScreen = typeOfScreen;
	}

	@Override
	public void addObserver(Observer observer) {
		listOfObservers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		listOfObservers.remove(observer); 
		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : listOfObservers) {
            observer.update(typeOfScreen);
        }
		
	}
	public void CheckScreenTypeAvailable(String newScreenType) { 
		typeOfScreen = newScreenType;
        notifyObservers();
    }
	
}
