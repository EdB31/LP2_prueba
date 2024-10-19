package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table
public class Profesor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cedula;
	
	@Column(name="nombres", length=45, nullable=false)
	private String nombres;
	
	@Column(name="apellidos", length=45, nullable=false)
	private String apellidos;
	
	@Column(name="genero", length=10, nullable=false)
	private String genero;
	
	public Profesor() {
		
	}

	public Profesor(Integer cedula, String nombres, String apellidos, String genero) {
		super();
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.genero = genero;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}