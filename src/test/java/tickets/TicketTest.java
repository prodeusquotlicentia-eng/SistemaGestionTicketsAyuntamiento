package tickets;

import org.junit.Test;
import static org.junit.Assert.*;

public class TicketTest {

    @Test
    public void crearTicketCorrectamente() {

        SistemaTickets sistema = new SistemaTickets();

        String resultado = sistema.crearTicket("No puedo iniciar sesión");

        assertEquals("Ticket creado correctamente", resultado);
    }

    @Test
    public void validarDescripcionVacia() {

        SistemaTickets sistema = new SistemaTickets();

        String resultado = sistema.crearTicket("");

        assertEquals("Descripción inválida", resultado);
    }
}