package com.ronaldarias.apirest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="linea")
public class LineasVO {

	@Id
	@Column(name="numero_linea")
	private Integer numeroLinea;
	
	@Column(name="documento_personal")
	private Integer documento;
	
	@Column(name="estado_linea")
	private String estado;

	
	public Integer getNumeroLinea() {
		return numeroLinea;
	}

	public void setNumeroLinea(Integer numeroLinea) {
		this.numeroLinea = numeroLinea;
	}

	public Integer getDocumentoPersona() {
		return documento;
	}

	public void setDocumentoPersona(Integer documentoPersona) {
		this.documento = documentoPersona;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
