package com.parking.service;

import java.util.List;

import com.parking.entity.Coche;

public interface ICocheService {

	List<Coche> getTodosLosCoches();
	
	Coche getCochePorId(Long id);
	
	void eliminarCochePorId(Long id);
}
