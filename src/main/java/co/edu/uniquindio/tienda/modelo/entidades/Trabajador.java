package co.edu.uniquindio.tienda.modelo.entidades;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Trabajador extends Persona implements Serializable {

    private float salario;

    private String jornada;

}
