package co.edu.uniquindio.tienda.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
public class Cliente implements Serializable {
    @Id
    private String cedula;
    private String nombre;
    private String email;
    private String telefono;
    public Cliente(){
        super();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        return cedula.equals(cliente.cedula);
    }

    @Override
    public int hashCode() {
        return cedula.hashCode();
    }
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

 */