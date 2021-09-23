package com.almacen.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.almacen.negocio.Tienda;

@Repository
public interface TiendaDAO extends CrudRepository <Tienda, Integer> {

}
