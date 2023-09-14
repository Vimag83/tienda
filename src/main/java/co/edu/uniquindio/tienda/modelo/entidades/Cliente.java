package co.edu.uniquindio.tienda.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cliente extends Persona implements Serializable {

    private String telefono;

    @OneToMany(mappedBy = "cliente")
    private List<Transaccion> transacciones;
}

/*
par ala tabla transaccion
@ManyToOne
private Cliente cliente;
@OneToOne(mapped by = "Transaccion")    va en la tabla que no depende de la otra
private Pago pago;

@ManyToMany
private List<Transaccion> transacciones;
@ManyToMany
private List<Producto> productos;

un @OnetoMany siempre lleva el mappedBy
y lleva una list<>

el @manytoOne nunca lleva el mapped by

la relacion @onetoOne lleva el mapped by donde no esta la llave foranesaa
donde esta la foranea solo va private Cita cita;

 */