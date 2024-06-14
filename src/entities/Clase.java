package entities;
import java.time.LocalTime;

public class Clase {
private int idClase;
private String nombreClase;
private Entrenador entrenador;
private LocalTime horarioClase; // es de tipo time
private int capacidad;// setear en 20
private boolean estado;

    public Clase() {
    }

    public Clase(int idClase, String nombreClase, Entrenador entrenador, LocalTime horarioClase, int capacidad, boolean estado) {
        this.idClase = idClase;
        this.nombreClase = nombreClase;
        this.entrenador = entrenador;
        this.horarioClase = horarioClase;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Clase(String nombreClase, Entrenador entrenador, LocalTime horarioClase) {
        this.nombreClase = nombreClase;
        this.entrenador = entrenador;
        this.horarioClase = horarioClase;
       
    }

    public Clase(String nombreClase, Entrenador entrenador, LocalTime horarioClase, int capacidad, boolean estado) {
        this.nombreClase = nombreClase;
        this.entrenador = entrenador;
        this.horarioClase = horarioClase;
        this.capacidad = capacidad;
        this.estado = estado;
    }


    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }


    public LocalTime getHorarioClase() {
        return horarioClase;
    }

    public void setHorarioClase(LocalTime horarioClase) {
        this.horarioClase = horarioClase;
    }


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

//     @Override
//    public String toString() {
//        return "Clase{" +
//                "idClase=" + idClase +
//                ", nombreClase='" + nombreClase + '\'' +
//                ", entrenador=" + entrenador +
//                ", horarioClase=" + horarioClase +
//                ", capacidad=" + capacidad +
//                ", estado=" + estado +
//                '}';
//    }

    @Override
    public String toString() {
        return nombreClase ;
                
    }
    
    
    
    

}
