package com.example.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.model.entity.Sucursales;
import com.example.examen.model.service.SucursalesService;

@RestController
@RequestMapping("/sucursales")
public class SucursalesController {
	
	@Autowired
	private SucursalesService sucursalesService;

	@PostMapping("/guardar")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public ResponseEntity<Sucursales> guardarSucursal(@RequestBody Sucursales sucursal) {
		return new ResponseEntity<>(sucursalesService.guardarSucursal(sucursal), HttpStatus.CREATED);
	}

}
