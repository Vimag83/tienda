package co.edu.uniquindio.tienda.modelo.servicios;

public interface CitaServicios {

    void agendarCita();

    void listarCitasPaciente(); // historial de cita

    void verDetalleCita();

    void filtrarCitasMedico();
    void filtrarCitasporFecha();

    void listarCitasPendientesMedico();

    void atenderCita();  // debe estar diagnostico tratamiento y notas medicas

    void listarTodasCitasMedico();// las citas que ha tenido el medico en este metodo llega el codigo del medico
}
