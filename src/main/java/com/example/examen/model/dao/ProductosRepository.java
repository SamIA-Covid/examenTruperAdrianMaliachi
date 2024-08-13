package com.example.examen.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.model.entity.Ordenes;
import com.example.examen.model.entity.Producto;

@Repository
public interface ProductosRepository extends JpaRepository<Producto, Integer>{

}
