package com.example.examen.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.model.entity.Sucursales;

@Repository
public interface SucursalesRepository extends JpaRepository<Sucursales, Integer> {

}
