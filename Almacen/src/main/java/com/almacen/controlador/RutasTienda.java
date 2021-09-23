package com.almacen.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.almacen.DAO.TiendaDAO;
import com.almacen.negocio.Tienda;

@Controller
public class RutasTienda {
	
	@Autowired
	private TiendaDAO tiendaDAO;
	
	@GetMapping("/tienda/add")
	public ModelAndView addTeinda() {
		ModelAndView model = new ModelAndView();
		model.setViewName("formularioTienda");
		model.addObject("tienda",new Tienda());
		return model;
	}

	@PostMapping("/tienda/post")
	public String postTienda(@ModelAttribute Tienda tienda ) {
		String salida = "redirect:/tienda/listar";
		try {
			 tiendaDAO.save(tienda);
			}
			catch(Exception e) {
			 System.out.println("Hay un error en el guardado de la TIENDA " + "La salida es: " + e);
			}
		tiendaDAO.save(tienda);
		return salida;
	}
	
	@GetMapping("/tienda/listar")
	public ModelAndView viewTienda() {
		ModelAndView model = new ModelAndView();
		model.setViewName("listaTienda");
		List <Tienda> tiendas = (List<Tienda>) tiendaDAO.findAll();
		model.addObject("listaTiendas",tiendas);
		return model;
	}
}
