package com.example.examen.model.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ordenes")
@Setter
@Getter
public class Ordenes {
	@Id
	@Column(name="orden_id", nullable = false)
	private Integer ordenId;
	@Column(nullable = false)
	private Date fecha;
	@Column(nullable = false)
	private Double total;
	@ManyToOne
	private Sucursales sucursales;
}
