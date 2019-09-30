package com.ronaldarias.apirest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personas")
public class PersonasVO {
	
	@Id
	@Column(name="documento_persona")
	private Integer documento;
	
	@Column(name="nombres_persona")
	private String nombres;
	
	@Column(name="apellidos_persona")
	private String apellidos;
	
	@Column(name="telefono_fijo")
	private String telefono;
	
	@Column(name="fecha_nacimiento")
	private String fecha;
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Integer getDocumento() {
		return documento;
	}

	public void setDocumento(Integer documento) {
		this.documento = documento;
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
		this.apellidos= apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setEmail(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Customer [documento=" + documento + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono + ", fecha: "+ fecha +"]";
	}

}
