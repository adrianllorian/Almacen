package com.almacen.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.almacen.DAO.TiendaDAO;
import com.almacen.DAO.UsuarioDAO;
import com.almacen.negocio.UsuarioBean;

@Controller
public class RutasUsuario {

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private TiendaDAO tiendaDAO;
	
	@GetMapping("/usuario/listar")
	public ModelAndView listaUsuario() {
		ModelAndView model = new ModelAndView();
		List <UsuarioBean> listaUsuario = (List<UsuarioBean>) usuarioDAO.findAll();
		model.addObject("listaUsuario",listaUsuario);
		model.setViewName("listaUsuario");
		return model;
	}
	
	@GetMapping("/usuario/add")
	public ModelAndView formularioAdd() {
		ModelAndView model = new ModelAndView();
		model.addObject("usuario", new UsuarioBean());
		model.addObject("listaTiendas", tiendaDAO.findAll());
		model.setViewName("formularioUsuario");
		return model;
	}
	
	@PostMapping("/usuario/post")
	public String usuarioPost(@ModelAttribute UsuarioBean usuario) {
		usuarioDAO.save(usuario);
		return "redirect:/usuario/listar";
	}
	
}
