package io.javademo.examples.security;

import javax.annotation.security.RolesAllowed;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by marcomolteni on 05.06.17.
 */
//@Path("protected")
public class ProtectedController {

    private static final Logger LOGGER = Logger.getLogger(ProtectedController.class.getName());
    public static final String MESSAGE = "message";
    public static final String AUTHOR = "author";

    @RolesAllowed({"user"})
    @GET
    @Path("hello")
    public Response securedMethod(@Context HttpServletRequest request, @Context HttpServletResponse response) {

        LOGGER.log(Level.INFO, "securedMethod");
        JsonObject quote1 = Json.createObjectBuilder()
                .add(MESSAGE, "Good code is its own best documentation. As you're about to add a comment, ask yourself, 'How can I improve the code so that this comment isn't needed?'")
                .add(AUTHOR, "Steve McConnell")
                .build();

        JsonObject quote2 = Json.createObjectBuilder()
                .add(MESSAGE, "One of my most productive days was throwing away 1000 lines of code.")
                .add(AUTHOR, "Ken Thompson (computer scientist, early developer of UNIX OS)").build();

        JsonObject quote3 = Json.createObjectBuilder()
                .add(MESSAGE, "Always code as if the guy who ends up maintaining your code will be a violent psychopath who knows where you live.")
                .add(AUTHOR, "Martin Golding").build();

        JsonObject quote4 = Json.createObjectBuilder()
                .add(MESSAGE, "Debugging is twice as hard as writing the code in the first place. Therefore, if you write the code as cleverly as possible, you are, by definition, not smart enough to debug it.")
                .add(AUTHOR, "Brian W. Kernighan (Canadian computer scientist, co-author of 'C programming language')").build();


        JsonArray result = Json.createArrayBuilder()
                .add(quote3)
                .add(quote4)
                .add(quote2)
                .add(quote1).build();
        return Response.ok(result).build();

    }
}
