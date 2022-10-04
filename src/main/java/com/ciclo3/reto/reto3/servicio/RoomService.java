package com.ciclo3.reto.reto3.servicio;

import com.ciclo3.reto.reto3.entidad.Room;
import com.ciclo3.reto.reto3.repositorio.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository repository;

    //GET
    public List<Room> getRooms(){
        return repository.findAll();
    }

    //POST
    public Room saveRoom(Room room){
        return repository.save(room);
    }
}
