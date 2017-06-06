package org.webservice.maruthi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.webservice.maruthi.bean.Talk;

/*
 * It is just a helper class which should be replaced by database implementation.
 * It is not very well written class, it is just used for demonstration.
 */
public class TalkService {

	static HashMap<Integer,Talk> talkIdMap = getTalkIdMap();


	public TalkService() {
		super();

		if(talkIdMap==null)
		{
			talkIdMap=new HashMap<Integer,Talk>();
		// Creating some object of talks while initializing
			Talk talk1 = new Talk(1, "Victor", "Steve Jobs", "MSG", '2');
			Talk talk2 = new Talk(2, "Wei", "Steve Wozniak", "Red Rocks", '2');
			Talk talk3 = new Talk(3, "Kristian", "Phil Schiller", "Hollywood Bowl", '2');
			Talk talk4 = new Talk(4, "Karthik", "Eddy Cue", "Radio City", '2');

			talkIdMap.put(1,talk1);
			talkIdMap.put(2,talk2);
			talkIdMap.put(3,talk3);
			talkIdMap.put(4,talk4);
		}
	}

	public List<Talk> getAllTalks()
	{
		List<Talk> talk = new ArrayList<Talk>(talkIdMap.values());
		return talk;
	}

	public Talk getTalk(int id)
	{
		Talk talk= talkIdMap.get(id);
		return talk;
	}
	public Talk addTalk(Talk talk)
	{
		//country.setId(countryIdMap.size()+1);
		talkIdMap.put(talk.getId(), talk);
		return talk;
	}
	
	public Talk updateTalk(Talk talk)
	{
		if(talk.getId()<=0)
			return null;
		talkIdMap.put(talk.getId(), talk);
		return talk;

	}
	public void deleteTalk(int id)
	{
		talkIdMap.remove(id);
	}

	public static HashMap<Integer, Talk> getTalkIdMap() {
		return talkIdMap;
	}


}
