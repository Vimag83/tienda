package co.edu.uniquindio.tienda.modelo.entidades;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Producto {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    private String nombre;

    private int unidades;

    private float precio;

    private TipoProducto tipoProducto;

    @OneToMany(mappedBy = "producto")
    private List<TransaccionProducto> transaccionProductos;

}
