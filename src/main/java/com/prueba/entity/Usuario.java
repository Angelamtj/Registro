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
	
	@Column(name = "cuentanobloqueada", nullable = false, columnDefinition = "TINYINT(4)")
	private boolean cuentanobloqueada;
	
	@Column(name = "intentosfallidos", nullable = false, columnDefinition = "TINYINT(4)" )
	private int intentosfallidos;
	
	@Column(name = "tiempobloqueado")
	private Date tiempobloqueado;
	
	

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

	public boolean isCuentanobloqueada() {
		return cuentanobloqueada;
	}

	public void setCuentanobloqueada(boolean cuentanobloqueada) {
		this.cuentanobloqueada = cuentanobloqueada;
	}

	public int getIntentosfallidos() {
		return intentosfallidos;
	}

	public void setIntentosfallidos(int intentosfallidos) {
		this.intentosfallidos = intentosfallidos;
	}

	public Date getTiempobloqueado() {
		return tiempobloqueado;
	}

	public void setTiempobloqueado(Date tiempobloqueado) {
		this.tiempobloqueado = tiempobloqueado;
	}

}