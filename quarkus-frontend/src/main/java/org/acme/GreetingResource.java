package org.acme;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;


@Path("/hello")
public class GreetingResource {

    @RestClient
    @Inject
    HelloBackendProxy proxy;

    @GET
    @RolesAllowed("admin")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return proxy.get();
        //return "Hello";
    }
}