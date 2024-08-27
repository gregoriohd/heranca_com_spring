package br.com.gregoriohd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gregoriohd.entity.Carro;
import br.com.gregoriohd.repository.CarroRepository;

@Service
public class CarroService {
	
	@Autowired
	private CarroRepository repository;
	
	public Carro addCarro(Carro carro) {
		
		repository.save(carro);
		
		return carro;
	}
	
	public List<Carro> listCarros(){
		return repository.findAll();
	}

}
