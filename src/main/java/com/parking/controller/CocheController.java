package com.parking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.parking.entity.Coche;
import com.parking.service.ICocheService;

@Controller
public class CocheController {

	@Autowired
	private ICocheService cocheService;
	
	@ModelAttribute("titulo")
	public String titulo() {
		return "Parking";
	}
	
	@GetMapping("coches/todos")
	public String getTodosLosCoches(Model model) {
		List<Coche> listaDeCoches = cocheService.getTodosLosCoches();
		model.addAttribute("coches", listaDeCoches);	
		return "vistas/coches";
	}
	
	@GetMapping("coche/{id}")
	public String getCochePorId(@PathVariable Long id, Model model) {
		Coche coche = cocheService.getCochePorId(id);
		model.addAttribute("coche", coche);
		return "vistas/coche";
	}
	
	@PostMapping("coche/eliminar/{id}")
	public String eliminarCochePorId(@PathVariable Long id) {
		cocheService.eliminarCochePorId(id);
		 return "redirect:/coches/todos";
	}
	
	@GetMapping("coches/colores/{color}")
	public String getCochesPorColores(@PathVariable String color, Model model) {		
		model.addAttribute("coches", cocheService.getCochesPorColores(color));
		return "vistas/coches";
	}
	
	@GetMapping("coches/electrico/{esElectrico}")
	public String getCochesPorSiSonElectricos(@PathVariable Boolean esElectrico, Model model) {
		model.addAttribute("coches", cocheService.getCochesFiltrandoPorSiSonElectricos(esElectrico));
		return "vistas/coches";
	}
	
	
	@GetMapping("/coches/incluir")
	public String mostrarFormulario(Model model) {
	    model.addAttribute("coche", new Coche()); 
	    return "vistas/agregar-coche"; 
	}
	
	@PostMapping("/coches/agregar")
	public String agregarCoche(@ModelAttribute Coche coche) {
	    cocheService.agregarCoche(coche);
	    return "redirect:/coches/todos";  
	}
}
