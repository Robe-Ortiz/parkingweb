package com.parking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="coche")
public class Coche{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="marca")
	private String marca;
	@Column(name="color")
	private String color;
	@Column(name="es_electrico")
	private Boolean esElectrico;
		
	public Coche() {

	}

	public Coche(Long id, String marca, String color, Boolean esElectrico) {
		this.id = id;
		this.marca = marca;
		this.color = color;
		this.esElectrico = esElectrico;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean getEsElectrico() {
		return esElectrico;
	}

	public void setEsElectrico(Boolean esElectrico) {
		this.esElectrico = esElectrico;
	}
	
	
	
	
	
}
