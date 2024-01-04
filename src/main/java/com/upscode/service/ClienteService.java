package com.upscode.service;

import com.upscode.data.ClienteDAO;
import com.upscode.model.Cliente;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;
@Stateless
public class ClienteService {

    @Inject
    private ClienteDAO clienteDAO;

    public Cliente save(Cliente cliente){
        this.clienteDAO.save(cliente);
        return cliente;
    }

    public List<Cliente> getAll(){
        return clienteDAO.listAll();
    }



}
