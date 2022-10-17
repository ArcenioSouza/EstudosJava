package com.curso.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "333.458.789-98");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId(@PathVariable int id) {
		return new Cliente(id, "Pedro", "333.458.789-98");
	}
	
	@GetMapping
	public Cliente obterClientePorIdComQuery(@RequestParam(name="id") int id) {
		return new Cliente(id, "Pedro", "333.458.789-98");
	}

}
