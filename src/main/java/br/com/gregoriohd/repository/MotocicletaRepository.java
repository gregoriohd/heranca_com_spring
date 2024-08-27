package br.com.gregoriohd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gregoriohd.entity.Motocicleta;

@Repository
public interface MotocicletaRepository extends JpaRepository<Motocicleta, Long>{

}
