package org.webservice.maruthi.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.webservice.maruthi.bean.Talk;
import org.webservice.maruthi.service.TalkService;


@Path("/talk")
public class TalkController {
	
	TalkService talkService =new TalkService();
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Talk> getTalks()
	{
		
		List<Talk> listOfTalks = talkService.getAllTalks();
		return listOfTalks;
	}

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Talk getTalkById(@PathParam("id") int id)
	{
		return talkService.getTalk(id);
	}
   
    @POST
    @Produces(MediaType.APPLICATION_JSON)
	public Talk addTalk(Talk talk)
	{
		return talkService.addTalk(talk);
	}

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
	public Talk updateTalk(Talk talk)
	{
		return talkService.updateTalk(talk);
		
	}
	
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public void deleteTalk(@PathParam("id") int id)
	{
    	talkService.deleteTalk(id);
		
	}
	
}
