package com.upscode.api;

import com.upscode.model.Cliente;
import com.upscode.service.ClienteService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/cliente")
public class ClienteResource {
    @Inject
    private ClienteService service;

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCliente(){
        List<Cliente> list= service.getAll();
        return Response.ok().status(Response.Status.OK).entity(list).build();
    }
    @POST
    @Path("newuser")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveClientes(Cliente cliente){
        Cliente c= service.save(cliente);
        return Response.ok().status(Response.Status.CREATED).entity(c).build();
    }
}
