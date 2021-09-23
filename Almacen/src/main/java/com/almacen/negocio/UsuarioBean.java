package com.almacen.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Value;

@Entity
public class UsuarioBean {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String nombre;
	
	@Value("${stuff.value:@null}")
	@ManyToOne
	private Categoria categoria;
	
	@ManyToOne
	private Tienda tienda;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}
	
	
	

}
