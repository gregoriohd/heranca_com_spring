package br.com.gregoriohd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gregoriohd.entity.Carro;
import br.com.gregoriohd.service.CarroService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("carro")
public class CarroController {
	
	@Autowired
	private CarroService service;
	
	@PostMapping
	public ResponseEntity<Carro> addCarro(@RequestBody Carro carro) {
			
		return ResponseEntity.status(HttpStatus.CREATED).body(service.addCarro(carro));
	}
	
	@GetMapping
	public ResponseEntity<List<Carro>> listCarros() {
		return  ResponseEntity.status(HttpStatus.OK).body(service.listCarros());
	}

}
