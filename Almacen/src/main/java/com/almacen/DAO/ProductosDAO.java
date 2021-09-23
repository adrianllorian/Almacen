package com.almacen.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.almacen.negocio.Productos;

@Repository
public interface ProductosDAO extends CrudRepository <Productos, Integer> {

}
