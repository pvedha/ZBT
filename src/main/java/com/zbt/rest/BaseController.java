package com.zbt.rest;

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
	public Response readAllActions() {
		return Response.ok().entity("I am Don!").build();
	}
	
}