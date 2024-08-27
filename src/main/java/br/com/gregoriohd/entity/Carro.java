package br.com.gregoriohd.entity;

import br.com.gregoriohd.abstrata.Veiculo;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "carro")
public class Carro extends Veiculo {

    private int quantidadePortas;

}
