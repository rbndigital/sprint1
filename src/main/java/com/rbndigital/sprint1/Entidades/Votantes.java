package com.rbndigital.sprint1.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Votantes {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	

	private int identificacion;	
	private String Nombres;
	private String Apellidos;
	private String Correo;
	private String NumContacto;
	private String Direccion;
	private String Municipio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getNumContacto() {
		return NumContacto;
	}
	public void setNumContacto(String numContacto) {
		NumContacto = numContacto;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getMunicipio() {
		return Municipio;
	}
	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}

	@Override
	public String toString() {
		return "Votantes [id = " + id + 
		", Identificacion=" + identificacion +
		", Nombres=" + Nombres +
		", Apellidos=" + Apellidos +
		", Correo=" + Correo +
		", NumContacto=" + NumContacto +
		", Direccion=" + Direccion + 
		", Municipio=" + Municipio + "]";
	}
}
