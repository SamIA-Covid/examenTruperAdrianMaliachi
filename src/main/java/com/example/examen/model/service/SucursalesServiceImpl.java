package com.example.examen.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.model.dao.SucursalesRepository;
import com.example.examen.model.entity.Sucursales;

@Service
public class SucursalesServiceImpl implements SucursalesService {

	@Autowired
	private SucursalesRepository sucursalesRepository;
	
	@Override
	public Sucursales guardarSucursal(Sucursales sucursal) {
		return sucursalesRepository.save(sucursal);
	}

}
