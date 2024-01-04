package com.upscode.api;

import com.upscode.model.Cliente;
import com.upscode.service.ClienteService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/cliente")
public class ClienteResource {
    @Inject
    private ClienteService service;

    @GET
    @Path("/all")
    @Produces("application/json")
    public Response getCliente(){
        List<Cliente> list= service.listAll();
        return Response.ok().status(Response.Status.OK).entity(list).build();
    }

}
