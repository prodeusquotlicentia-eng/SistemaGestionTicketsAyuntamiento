package tickets;

public class Ticket {

    private int id;
    private String descripcion;
    private String estado;

    public Ticket(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = "Pendiente";
    }

    public void cambiarEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public String getDescripcion() {
        return descripcion;
    }
}