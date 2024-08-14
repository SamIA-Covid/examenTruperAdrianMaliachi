package com.example.examen.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="productos")
@Setter
@Getter
public class Producto {
	@Id
	@Column(name="producto_id")
	private Integer productoId;
	@Column(nullable = false, length = 20)
	private String codigo;
	@Column(nullable = false, length = 200)
	private String descripcion;
	private Double precio;
	@ManyToOne
	private Ordenes ordenes;

}
