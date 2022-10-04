package com.ciclo3.reto.reto3.servicio;

import com.ciclo3.reto.reto3.entidad.Reservation;
import com.ciclo3.reto.reto3.repositorio.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository repository;

    //GET
    public List<Reservation> getReservations() {
        return repository.findAll();
    }

    //POST
    public Reservation saveReservation(Reservation reservation){
        return repository.save(reservation);
    }
}
