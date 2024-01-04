package com.upscode.data;

import com.upscode.model.Cliente;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.io.Serializable;
import java.util.List;

@Stateless
public class ClienteDAO implements Serializable {

    @PersistenceContext
    private EntityManager em;

    private static final long serialVersionUID = 1L;

    //public static List<Curso> listaCurso = new ArrayList<>();
    public Cliente save(Cliente cliente) {
        //listaCurso.add(cliente);
        em.persist(cliente);
        return cliente;
    }


    public List<Cliente> listAll() {
        String jpql = "SELECT c FROM Cliente c";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }
}
