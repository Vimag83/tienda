package co.edu.uniquindio.tienda.modelo.servicios;

public interface PQRservicios {

    void crearPQRS();
    void cambiarEstadoPQRS();
    void responderPQRs();
    void listarPQRSPaciente();/*informacion necesaria para responder PQRS*/
    void verDetallePQRS();/* al dar click a la lista se muestra el detalle de ese PQRS*/
}
