package com.upscode.service;

import com.upscode.model.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente save(Cliente c);
    List<Cliente> listAll();
}
