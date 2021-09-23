package com.almacen.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.almacen.negocio.Categoria;

@Repository
public interface CategoriaDAO extends CrudRepository <Categoria,Integer> {

}
