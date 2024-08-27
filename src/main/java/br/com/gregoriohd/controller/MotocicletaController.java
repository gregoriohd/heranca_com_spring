package br.com.gregoriohd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gregoriohd.entity.Motocicleta;
import br.com.gregoriohd.service.MotocicletaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("moto")
public class MotocicletaController {
	
	@Autowired
	private MotocicletaService service;
	
	
	@PostMapping
	public ResponseEntity<Motocicleta> add(@RequestBody Motocicleta motocicleta) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.addMotocicleta(motocicleta));
	}
	
	@GetMapping
	public ResponseEntity<List<Motocicleta>> listMotocicleta(){
		return ResponseEntity.ok(service.listMotocicletas());
	}
	
}
