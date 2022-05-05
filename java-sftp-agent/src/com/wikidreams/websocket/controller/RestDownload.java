package com.wikidreams.websocket.controller;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

 
@Path("")
public class RestDownload {

    final String path = "d:\\upload\\a.pdf";
    
    @GET()
    @Path("ping")
    @Produces(MediaType.APPLICATION_JSON)
    public Response doPing() throws Exception {
    	return Response.ok("OK").build();
    }
   
    
    @POST
    @Path("transfer/server")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response transferToServer( FilesDTO files ) throws Exception {
    	return Response.ok("OK").build();
    }
    
    @POST
    @Path("transfer/client")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response transferToClient( FilesDTO files ) throws Exception {
    	return Response.ok("OK").build();
    }

}