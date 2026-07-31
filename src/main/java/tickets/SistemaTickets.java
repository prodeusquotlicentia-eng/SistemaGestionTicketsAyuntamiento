// Prueba de integración continua Travis CI
package tickets;

public class SistemaTickets {

    public String crearTicket(String descripcion) {

        if (descripcion == null || descripcion.isEmpty()) {
            return "Descripción inválida";
        }

        return "Ticket creado correctamente";
    }
}