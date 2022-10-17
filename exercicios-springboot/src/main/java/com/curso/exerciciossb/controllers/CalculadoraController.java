package com.curso.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	@GetMapping("/somar/{num1}/{num2}")
	public Double somar(@PathVariable Double num1, @PathVariable Double num2) {
		Double result;
		result = num1 + num2;			
		return result;
	}
	
	@GetMapping("/subtrair")
	public double subtrair(@RequestParam(name = "num1") double num1, @RequestParam(name = "num2") double num2) {
		double result;
		result = num1 - num2;
		
		return result;
	}

}
