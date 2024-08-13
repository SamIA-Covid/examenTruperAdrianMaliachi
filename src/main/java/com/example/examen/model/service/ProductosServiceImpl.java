package com.example.examen.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.model.dao.OrdenesRepository;
import com.example.examen.model.dao.ProductosRepository;
import com.example.examen.model.entity.Ordenes;
import com.example.examen.model.entity.Producto;

@Service
public class ProductosServiceImpl implements ProductosService {

	@Autowired
	private ProductosRepository repository;
	
	@Autowired
	private OrdenesRepository ordenesRepository;
	
	@Override
	public List<Producto> guardarProductos(List<Producto> producto) {
		Double total=0.0;
		Integer idOrden=0;
		for (Producto item : producto) {
			repository.save(item);
			total+=item.getPrecio();
			idOrden=item.getOrdenes().getOrdenId();
		}	
		Ordenes orden = ordenesRepository.findById(idOrden).get();
		orden.setTotal(total);
		ordenesRepository.save(orden);
		
		
		return producto;
	}
	@Override
	public Producto actualizarProducto(Producto producto) {
		Producto productoActualizado= repository.findById(producto.getProductoId()).get();
		productoActualizado.setPrecio(producto.getPrecio());
		return repository.save(productoActualizado);
	}

	
}
