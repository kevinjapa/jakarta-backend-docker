package com.upscode.service;

import com.upscode.model.Cliente;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named
public class ClienteServiceImpl implements ClienteService{

    private static List<Cliente> list = new ArrayList<>();

    @Override
    public Cliente save(Cliente c) {
        list.add(c);
        return c;
    }

    @Override
    public List<Cliente> listAll() {
        return list;
    }
}
