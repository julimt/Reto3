package com.ciclo3.reto.reto3.repositorio;

import com.ciclo3.reto.reto3.entidad.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
