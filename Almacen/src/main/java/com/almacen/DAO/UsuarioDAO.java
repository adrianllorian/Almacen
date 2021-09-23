package com.almacen.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.almacen.negocio.UsuarioBean;

@Repository
public interface UsuarioDAO extends CrudRepository <UsuarioBean, Integer> {

}
