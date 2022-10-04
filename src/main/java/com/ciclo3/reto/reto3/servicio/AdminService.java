package com.ciclo3.reto.reto3.servicio;

import com.ciclo3.reto.reto3.entidad.Admin;
import com.ciclo3.reto.reto3.repositorio.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository repository;

    // GET
    public List<Admin> getAdmins(){
        return repository.findAll();
    }

    //Peticion POST
    public Admin saveAdmin(Admin admin) {
        return repository.save(admin);
    }
}
