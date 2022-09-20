package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:9000")
@Path("")
public interface HelloBackendProxy {
    @GET
    @Path("/hello")
    String get();   
}
