package com.ciclo3.reto.reto3.servicio;

import com.ciclo3.reto.reto3.entidad.Message;
import com.ciclo3.reto.reto3.repositorio.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository repository;
    //GET
    public List<Message> getMessages(){
        return repository.findAll();
    }

    //POST
    public Message saveMessage(Message message){
        return repository.save(message);
    }
}
