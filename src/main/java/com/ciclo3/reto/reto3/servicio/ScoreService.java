package com.ciclo3.reto.reto3.servicio;

import com.ciclo3.reto.reto3.entidad.Score;
import com.ciclo3.reto.reto3.repositorio.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository repository;

    // GET
    public List<Score> getScores(){
        return repository.findAll();
    }

    //Peticion POST
    public Score saveScore(Score score) {
        return repository.save(score);
    }
}
