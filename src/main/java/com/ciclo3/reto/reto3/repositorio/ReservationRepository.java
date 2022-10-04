package com.ciclo3.reto.reto3.repositorio;

import com.ciclo3.reto.reto3.entidad.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
