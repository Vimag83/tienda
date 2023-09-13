package co.edu.uniquindio.tienda.modelo.entidades;



import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pago implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    private LocalDateTime fecha;

    private float total;

    private EstadoPago estadoPago;

    private MedioPago medioPago;

    @OneToOne(mappedBy = "pago")
    private Transaccion transaccion;

}
