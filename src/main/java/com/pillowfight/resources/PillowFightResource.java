package com.pillowfight.resources;

import com.pillowfight.models.PillowFight;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class PillowFightResource {

    @GET
    @Produces("application/json")
    public Response penis() {
        String dog = "Chun";
        String cat = String.format("This is a win %s", dog);
        return Response.ok(cat).build();
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/fight")
    public Response fight(PillowFight fight) {
        return Response.ok(fight.getFirstName()).build();
    }
}