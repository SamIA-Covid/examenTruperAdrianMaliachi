package com.example.examen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.model.entity.Producto;
import com.example.examen.model.service.ProductosService;

@RestController
@RequestMapping("/productos")
public class ProductosController {
	
	@Autowired
	private ProductosService productosService;
	
	@PostMapping("/guardar")
	public ResponseEntity<List<Producto>> guardarProducto(@RequestBody List<Producto> producto){
		return new ResponseEntity<>(productosService.guardarProductos(producto),HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Producto> actualizarProducto(@RequestBody Producto producto){
		return new ResponseEntity<>(productosService.actualizarProducto(producto),HttpStatus.CREATED);
	}

}
