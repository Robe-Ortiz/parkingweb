package com.parking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class RootController {

	@ModelAttribute("titulo")
	public String titulo() {
		return "Parking";
	}
	
	@GetMapping({"", "/"})
	public String inicio() {
		return "vistas/index";
	}
	
	@GetMapping("zero")
	public String divisionPorCero() {
		int x = 10 / 0;
		return "";
	}
}
