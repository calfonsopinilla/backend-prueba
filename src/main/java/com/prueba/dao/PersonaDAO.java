package com.prueba.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.model.Persona;

public interface PersonaDAO extends JpaRepository<Persona,String> {

	@Modifying
	@Transactional
	@Query("DELETE FROM Persona persona WHERE persona.cedula = :cedula")
	public void deletePesonaByCedula(@Param("cedula") Integer cedula);
	
	@Query("SELECT persona FROM Persona persona ORDER BY persona.creacion DESC ")
	public List<Persona> getPersonas();
	
}
