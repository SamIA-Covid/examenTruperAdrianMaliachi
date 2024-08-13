package com.example.examen.model.dto;

import java.util.List;

import com.example.examen.model.entity.Ordenes;
import com.example.examen.model.entity.Producto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrdenProductosDto {
	
	private Ordenes orden;
	private List<Producto> lstProducto;

}
