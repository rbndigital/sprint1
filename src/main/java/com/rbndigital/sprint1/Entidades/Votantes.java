package com.rbndigital.sprint1.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Votantes {
    @Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	private int Identificacion;	
	private String Nombres;
	private String Apellidos;
	private String Correo;
	private String NumContacto;
	private String Direccion;
	private int Municipio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdentificacion() {
		return Identificacion;
	}
	public void setIdentificacion(int identificacion) {
		Identificacion = identificacion;
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
	public int getMunicipio() {
		return Municipio;
	}
	public void setMunicipio(int municipio) {
		Municipio = municipio;
	}

	@Override
	public String toString() {
		return "Votantes [id = " + id + 
		", Identificacion=" + Identificacion +
		", Nombres=" + Nombres +
		", Apellidos=" + Apellidos +
		", Correo=" + Correo +
		", NumContacto=" + NumContacto +
		", Direccion=" + Direccion + 
		", Municipio=" + Municipio + "]";
	}
}
