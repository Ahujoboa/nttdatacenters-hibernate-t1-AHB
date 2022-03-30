package com.everis.nttdatacenters_hibernate_t1_AHB;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

	
	private Long idCliente;

	
	private String nombre;

	
	private String primerApellido;


	private String segundoApellido;

	
	private String dni;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	public Long getId() {
		return idCliente;
	}

	
	public void setCustomerId(Long Id) {
		this.idCliente = Id;
	}

	
	@Column(name = "NOMBRE", nullable = false)
	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	@Column(name = "PRIMERAPELLIDO", nullable = false)
	public String getPrimerApellido() {
		return primerApellido;
	}

	
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	
	@Column(name = "SEGUNDOAPELLIDO", nullable = false)
	public String getSegundoApellido() {
		return segundoApellido;
	}

	
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	
	@Column(name = "DNI", nullable = false, unique = true, length = 9)
	public String getDni() {
		return dni;
	}

	
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Cliente [Id=" + this.idCliente + ", nombre=" + this.nombre + ", primer apellido=" + this.primerApellido + ", segundo apellido=" + this.segundoApellido + ", dni=" + this.dni + "]";
	}

}
