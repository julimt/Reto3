package com.ciclo3.reto.reto3.servicio;

import com.ciclo3.reto.reto3.entidad.Client;
import com.ciclo3.reto.reto3.repositorio.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    //Peticion Get
    public List<Client> getClients(){
        return repository.findAll();
    }

    //POST
    public Client saveClient(Client client) {
        return repository.save(client);
    }
}
