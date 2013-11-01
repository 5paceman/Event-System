package me.Ctownatlarge.eventsystem.example;

import me.Ctownatlarge.eventsystem.EventManager;
import me.Ctownatlarge.eventsystem.EventHandler;

public class ExampleListener {
	
	private final EventManager eventManager = new EventManager();
	
	public ExampleListener()
	{
		eventManager.addEventListener(this);
	}
	
	@EventHandler
	public void onBasicEvent(EventExample e)
	{
		System.out.println(e.getString());
	}
	
}