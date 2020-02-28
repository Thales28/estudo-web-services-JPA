package com.thales.estudowebservicesJPA.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thales.estudowebservicesJPA.entities.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@GetMapping
	public ResponseEntity<Cliente> findAll(){
		Cliente c1 = new Cliente(1L, "Maria", "F", "P", "M", "+5581999991111");
		return ResponseEntity.ok().body(c1);		
	}
}