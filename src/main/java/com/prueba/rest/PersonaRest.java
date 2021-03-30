package com.prueba.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.dao.PersonaDAO;
import com.prueba.model.Persona;

@RestController
@RequestMapping("api/personas")
@CrossOrigin("*")
public class PersonaRest {
	@Autowired
	private PersonaDAO personaDAO;
	
	@PostMapping("/post")
	public ResponseEntity<Persona> postPersona(@RequestBody Persona persona){
		Persona res = personaDAO.save(persona);
		return new ResponseEntity<Persona>(res,HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public List<Persona> getPersonas(){
		return personaDAO.getPersonas();
	}

	@DeleteMapping("/delete/{cedula}")
	public void deletePersona(@PathVariable("cedula") Integer cedula) {
		personaDAO.deletePesonaByCedula(cedula);
	}
	
}
