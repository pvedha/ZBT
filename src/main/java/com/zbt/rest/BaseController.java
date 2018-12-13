package com.zbt.rest;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/base")
public class BaseController {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/whoami")
	public Response getWhoAmI() {
		return Response.ok().entity("I am Don!").build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/time")
	public Response getTime() {
		return Response.ok().entity("The time is : " + Calendar.getInstance().getTime()).build();
	}
}