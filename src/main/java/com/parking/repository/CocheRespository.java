package com.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.entity.Coche;

@Repository
public interface CocheRespository extends JpaRepository<Coche, Long> {

}
