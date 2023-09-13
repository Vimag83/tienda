package co.edu.uniquindio.tienda.modelo.entidades;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Transaccion implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    private LocalDateTime fecha;

    @ManyToOne
    private Cliente cliente;

    @OneToOne
    private Pago pago;

    @OneToMany(mappedBy = "transaccion")
    private List<TransaccionProducto> transaccionProductos;

}
