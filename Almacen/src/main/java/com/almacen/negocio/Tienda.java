package com.almacen.negocio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Value;

@Entity
public class Tienda {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String nombre;
	
	@Value("${stuff.value:@null}")
	@OneToMany(mappedBy="tienda")
	private List <UsuarioBean> usuario;
	
	@Value("${stuff.value:@null}")
	@OneToMany(mappedBy="tienda")
	private List <Productos> productos;

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

	public List<UsuarioBean> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<UsuarioBean> usuario) {
		this.usuario = usuario;
	}

	public List<Productos> getProductos() {
		return productos;
	}

	public void setProductos(List<Productos> productos) {
		this.productos = productos;
	}
	
	
	
	
}
