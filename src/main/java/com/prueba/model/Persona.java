package com.prueba.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Persona {

	@Id
	private String id;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private String tipoDocumento;
	
	@Column
	private Integer cedula;
	
	@Column
	private Date fechaNacimiento;
	
	@Column
	private String direccion;
	
	@Column
	private String celular;
	
	@CreationTimestamp
	@Column(name="creacion", nullable=false, updatable = false)
	private Timestamp creacion;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Timestamp getCreacion() {
		return creacion;
	}

	public void setCreacion(Timestamp creacion) {
		this.creacion = creacion;
	}
	
	
}
