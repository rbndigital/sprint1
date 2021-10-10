package com.rbndigital.sprint1.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CrudEntidades {
    @Id
	private Long codCurso;
	private String Grado;
	private String Grupo;
	
	public Long getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(Long codCurso) {
		this.codCurso = codCurso;
	}
	public String getGrado() {
		return Grado;
	}
	public void setGrado(String grado) {
		Grado = grado;
	}
	public String getGrupo() {
		return Grupo;
	}
	public void setGrupo(String grupo) {
		Grupo = grupo;
	}
}
