package ar.com.ada.api.creditos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.creditos.entities.Cliente;
import ar.com.ada.api.creditos.repos.ClienteRepository;

///vamos a crear un services con la funcionalidad de traer todos los clientes y de grabar un cliente

@Service
public class ClienteService{

    @Autowired //los objetos que se van a instaciar en @repositoy y @services los trae automaticamente
    ClienteRepository repo;

    public List<Cliente> traerTodos(){

        return repo.findAll();     
    }

    public void crearCliente(Cliente cliente) {

        repo.save(cliente);

    }


}