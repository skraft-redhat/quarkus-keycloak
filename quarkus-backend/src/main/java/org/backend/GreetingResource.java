package org.backend;

import javax.annotation.processing.Generated;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.annotation.security.RolesAllowed;
import io.quarkus.security.Authenticated;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @RolesAllowed("admin")
    public String hello() {
        return "Hello from Backend!";
    }
}