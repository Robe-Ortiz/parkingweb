package com.parking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.entity.Coche;
import com.parking.repository.CocheRespository;

@Service
public class CocheService implements ICocheService {

	
	@Autowired
	private CocheRespository cocheRespository;
	
	public List<Coche> getTodosLosCoches(){
		return cocheRespository.findAll();
	}
	
	public Coche getCochePorId(Long id) {
		return cocheRespository.findById(id).get();
	}
	
	public void eliminarCochePorId(Long id) {
		cocheRespository.deleteById(id);
	}
}
