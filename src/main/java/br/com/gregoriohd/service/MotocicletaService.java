package br.com.gregoriohd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gregoriohd.entity.Motocicleta;
import br.com.gregoriohd.repository.MotocicletaRepository;

@Service
public class MotocicletaService {

	@Autowired
	private MotocicletaRepository repository;
	
	public Motocicleta addMotocicleta(Motocicleta motocicleta) {
		
		repository.save(motocicleta);
		
		return motocicleta;
	}
	
	public List<Motocicleta> listMotocicletas(){
		return repository.findAll();
	}
}
