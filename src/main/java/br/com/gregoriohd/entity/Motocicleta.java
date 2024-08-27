package br.com.gregoriohd.entity;

import br.com.gregoriohd.abstrata.Veiculo;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "motocicleta")
public class Motocicleta extends Veiculo {

    private boolean temSidecar;

}
