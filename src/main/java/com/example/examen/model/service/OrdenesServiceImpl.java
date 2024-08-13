package com.example.examen.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.model.dao.OrdenesRepository;
import com.example.examen.model.entity.Ordenes;

@Service
public class OrdenesServiceImpl implements OrdenesService{

	@Autowired
	private OrdenesRepository repository;
	@Override
	public Ordenes guardarOrdenes(Ordenes orden) {
		return repository.save(orden);
	}

	@Override
	public Ordenes buscarOrdenPorId(Integer Id) {
		return repository.findById(Id).get();
	}

}
