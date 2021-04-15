package com.prueba.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Apellido")
	private String apellido;
	
	@Column(name = "Genero")
	private char genero;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Usuario")
	private String usuario;
	
	@Column(name = "Password")
	private String password;
	
	
	@Column(name = "Fecha")
	private String fecha;
	
	@Column(name = "ultimoingreso")
	private String ultimoingreso;
	
	@Column(name = "cuentabloqueada")
	private String cuentabloqueada;
	
	//@Column(name = "intentosfallidos")
	//private int intentosfallidos;

	public String getCuentabloqueada() {
		return cuentabloqueada;
	}

	public void setCuentabloqueada(String cuentabloqueada) {
		this.cuentabloqueada = cuentabloqueada;
	}

	public String getUltimointentofallido() {
		return ultimointentofallido;
	}

	public void setUltimointentofallido(String ultimointentofallido) {
		this.ultimointentofallido = ultimointentofallido;
	}

	@Column(name = "ultimointentofallido")
	private String ultimointentofallido;


	public Usuario() {
		
	}
	
	public String getUltimoingreso() {
		return ultimoingreso;
	}


	public void setUltimoingreso(String ultimoingreso) {
		this.ultimoingreso = ultimoingreso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	/*public Integer getIntentosfallidos() {
		return intentosfallidos;
	}

	public void setIntentosfallidos(int intentosfallidos) {
		this.intentosfallidos = intentosfallidos;
	}*/

	
	
	
}