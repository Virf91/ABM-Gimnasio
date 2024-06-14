package entities;

import java.time.LocalDate;
import java.util.Date;


public class Membresia {
private int idMembresia;
private Socio socio;
private LocalDate fechaInicio;
private LocalDate fechaFin;
private int cantPases; //a medida que asiste a clases se agota la cap de su membresía (consultar si esto define el tipo de membresía)
private double costo;
private int estado;

    public Membresia() {
    }

    public Membresia(int idMembresia, Socio socio, LocalDate fechaInicio, LocalDate fechaFin, int cantPases, double costo, int estado) {
        this.idMembresia = idMembresia;
        this.socio = socio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantPases = cantPases;
        this.costo = costo;
        this.estado = estado;
    }

    public Membresia(Socio socio, LocalDate fechaInicio, LocalDate fechaFin, int cantPases, double costo, int estado) {
        this.socio = socio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantPases = cantPases;
        this.costo = costo;
        this.estado = estado;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantPases() {
        return cantPases;
    }

    public void setCantPases(int cantPases) {
        this.cantPases = cantPases;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Membresia{" + "idMembresia=" + idMembresia + ", socio=" + socio + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cantPases=" + cantPases + ", costo=" + costo + ", estado=" + estado + '}';
    }
    
}
    