package com.ronaldarias.apirest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="equipo")
public class EquiposVO {

	@Id
	@Column(name="imei")
	private Integer imei;
	
	@Column(name="serial_equipo")
	private String serial;
	
	@Column(name="numero_lineae")
	private String numeroLinea;
	
	@Column(name="marca_equipo")
	private String marca;
	
	@Column(name="descripcion_equipo")
	private String descripcion;
	
	@Column(name="estado_equipo")
	private String estado;

	
	

	public Integer getImei() {
		return imei;
	}

	public void setImei(Integer imei) {
		this.imei = imei;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getNumeroLinea() {
		return numeroLinea;
	}

	public void setNumeroLinea(String numeroLinea) {
		this.numeroLinea = numeroLinea;
	}

	public String getMarca_equipo() {
		return marca;
	}

	public void setMarca_equipo(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
