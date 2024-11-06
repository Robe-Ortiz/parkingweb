package com.parking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parking.entity.Coche;
import com.parking.service.ICocheService;

@RestController
public class CocheRestController {

	@Autowired
	private ICocheService cocheService;
	
	@GetMapping("/restcoches")
	public List<Coche> cochesRest() {
		
		return cocheService.getTodosLosCoches();
	}
	
}
