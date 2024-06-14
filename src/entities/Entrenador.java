package entities;

public class Entrenador {

    private int idEntrenador;
    private String nombreEntrenador;
    private String apellidoEntrenador;
    private String dniEntrenador;
    private String especialidad; // armar combo con especialidades posibles desde la vista
    private boolean estado;

    public Entrenador() {
    }

    public Entrenador(String nombreEntrenador, String apellidoEntrenador, String dniEntrenador, String especialidad, boolean estado) {
        this.nombreEntrenador = nombreEntrenador;
        this.apellidoEntrenador = apellidoEntrenador;
        this.dniEntrenador = dniEntrenador;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getApellidoEntrenador() {
        return apellidoEntrenador;
    }

    public void setApellidoEntrenador(String apellidoEntrenador) {
        this.apellidoEntrenador = apellidoEntrenador;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public String getDniEntrenador() {
        return dniEntrenador;
    }

    public void setDniEntrenador(String dniEntrenador) {
        this.dniEntrenador = dniEntrenador;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombreEntrenador + " , " + apellidoEntrenador;
    }

    
    
    
}
