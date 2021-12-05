package entidad;

import java.time.LocalDate;
//import java.time.temporal.ChronoUnit;

// En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler
// se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
// devolución, la posición del amarre y el barco que lo ocupará.
public class Alquiler {

    private Cliente cliente;
    
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolución;
    private int posicionAmarre;
    private Barco barco;
    
    public Alquiler() {
    }

    public Alquiler(Cliente cliente, LocalDate fechaAlquiler, LocalDate fechaDevolución, int posicionAmarre,
            Barco barco) {
        this.cliente = cliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolución = fechaDevolución;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolución() {
        return fechaDevolución;
    }

    public void setFechaDevolución(LocalDate fechaDevolución) {
        this.fechaDevolución = fechaDevolución;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler [barco=" + barco + ", cliente=" + cliente + ", fechaAlquiler=" + fechaAlquiler
                + ", fechaDevolución=" + fechaDevolución + ", posicionAmarre=" + posicionAmarre + "]";
    }

    

}
