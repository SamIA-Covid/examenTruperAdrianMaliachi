package com.example.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.model.entity.Ordenes;
import com.example.examen.model.service.OrdenesService;

@RestController
@RequestMapping("/ordenes")
public class OrdenesController {
	@Autowired
	private OrdenesService ordenesService;
	
	@PostMapping("/guardar")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public ResponseEntity<Ordenes> guardarOrden(@RequestBody Ordenes orden) {			
		return new ResponseEntity<>(ordenesService.guardarOrdenes(orden),HttpStatus.CREATED);	
	}
	
	@GetMapping("/buscar/{id}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public ResponseEntity<Ordenes> buscarOrdenPorId(@PathVariable Integer id){
		return new ResponseEntity<>(ordenesService.buscarOrdenPorId(id),HttpStatus.OK);
	}
	

}
