package org.webservice.maruthi.bean;

public class Talk{
	
	int id;
	String name, speaker, venue;	
	int duration;
	
	public Talk() {
		super();
	}
	public Talk(int id, String name, String speaker, String venue, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.speaker = speaker;
		this.venue = venue;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSpeaker() {
		return speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}