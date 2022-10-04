package com.ciclo3.reto.reto3.servicio;

import com.ciclo3.reto.reto3.entidad.Category;
import com.ciclo3.reto.reto3.repositorio.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    // GET
    public List<Category> getCategories(){
        return repository.findAll();
    }

    //Peticion POST
    public Category saveCategory(Category category) {
        return repository.save(category);
    }
}

