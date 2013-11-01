package me.Ctownatlarge.eventsystem.events;

public class Event {
	
	/* This is just for debugging purposes this isnt needed at all you can always use a value of 0 when
	 * declaring variables if you wish */
	public static final int BASIC_EVENT = 0;
	
	private int eventId;
	
	public Event(int id)
	{
		this.eventId = id;
	}
	
	/**
	 * Returns the event ID associated with this event
	*/
	public int getEventID()
	{
		return this.eventId;
	}
}
