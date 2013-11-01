package me.Ctownatlarge.eventsystem.events;

public class EventExample extends Event {
	
	/**
	 * This is just example code
	 */
	private final String eventString;
	
	public EventExample(String eventString)
	{
		super(Event.BASIC_EVENT);
		this.eventString = eventString;
	}
	
	/**
	 * Return the string parsed at creation of this event
	 */
	public String getString()
	{
		return eventString;
	}


}