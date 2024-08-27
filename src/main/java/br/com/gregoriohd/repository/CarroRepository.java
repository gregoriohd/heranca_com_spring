package br.com.gregoriohd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gregoriohd.entity.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long>{

}
