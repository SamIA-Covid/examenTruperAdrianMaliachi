package com.example.examen.model.service;

import java.util.List;

import com.example.examen.model.entity.Producto;

public interface ProductosService {
	
	public List<Producto> guardarProductos (List<Producto> producto);
	public Producto actualizarProducto (Producto producto);
}
