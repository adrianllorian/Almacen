package com.almacen.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RutasBasicas {
	
	@GetMapping("/")
	public ModelAndView inicio() {
		ModelAndView mostrar = new ModelAndView();
		mostrar.setViewName("index");
		return mostrar;
	}
}
