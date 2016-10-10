package com.db.ncsu.sdc.rest;

import com.db.ncsu.sdc.model.Greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;

@Path("/greeting")
public class TestResource {
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGreeting(@PathParam("id") long id) {
        Greeting greeting = buildGreeting(id);
        return Response.status(200).entity(greeting).build();
    }

    private Greeting buildGreeting(long id) {
        return new Greeting(id, "Hello", Arrays.asList("Fry", "Leela", "Bender", "Zoidberg"));
    }
}
