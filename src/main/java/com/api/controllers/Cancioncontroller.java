package com.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.CancionEntity;
import com.api.services.IcancionService;

@RestController
public class Cancioncontroller {
	
	@Autowired
	private IcancionService services;
	
//	@GetMapping("/prueba")
//	public ResponseEntity<List<CancionEntity>> getAllCancion(){
//		return ResponseEntity.ok().body(services.getAllCancion());
//	}
	
	@GetMapping("/canciones")
	public List<CancionEntity> getAllCancion(){
		return services.getAllCancion();
	}
	
	@GetMapping("/cancion/{idCancion}")
	public ResponseEntity<CancionEntity> getCancion(@PathVariable long idCancion){
		return ResponseEntity.ok().body(services.getCancionById(idCancion));
	}
	
	@PostMapping("/newcancion")
	public ResponseEntity<CancionEntity> createCancion(@RequestBody CancionEntity Cancion){
		return ResponseEntity.ok().body(services.createCancion(Cancion));
	}
	
	@DeleteMapping("/cancion/{id}")
	public HttpStatus deleteCancion(@PathVariable int id) {
		services.deleteCancion(id);
		return HttpStatus.OK;
	}
	
	@PutMapping("/cancion/update")
	public ResponseEntity<CancionEntity> updateCancion(@RequestBody CancionEntity can) {
//		can.setCancionId(id);
		return ResponseEntity.ok().body(services.updateCancion(can));
		
	}
	
}
