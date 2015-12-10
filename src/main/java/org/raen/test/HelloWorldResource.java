package org.raen.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by d063398 on 12/10/15.
 */
@Path("helloworld")
public class HelloWorldResource {
    private static final String MESSAGE = "Hello World!";

    @GET
    @Produces("text/plain")
    public String getMessage(){
        return MESSAGE;
    }
}
