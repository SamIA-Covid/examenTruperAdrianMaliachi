package com.example.examen.model.service;

import com.example.examen.model.entity.Ordenes;

public interface OrdenesService {
	
	public Ordenes guardarOrdenes (Ordenes orden);
	
	public Ordenes buscarOrdenPorId(Integer Id);

}
