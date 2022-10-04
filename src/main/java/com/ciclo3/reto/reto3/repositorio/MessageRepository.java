package com.ciclo3.reto.reto3.repositorio;

import com.ciclo3.reto.reto3.entidad.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
