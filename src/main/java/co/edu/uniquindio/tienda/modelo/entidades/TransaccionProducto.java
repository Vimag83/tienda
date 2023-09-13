package co.edu.uniquindio.tienda.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class TransaccionProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @ManyToOne
    private Transaccion transaccion;

    @ManyToOne
    private Producto producto;

    private int unidades;

    private float precio;

}