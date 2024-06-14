package entities;

public class Socio {
private int idSocio;
private String dniSocio;
private String nombreSocio;
private String apellidoSocio;
private int edadSocio;
private String correoSocio;
private String telefonoSocio;
private int estado;

public Socio(){}

    public Socio(int idSocio, String dniSocio, String nombreSocio, String apellidoSocio, int edadSocio, String correoSocio, String telefonoSocio, int estado) {
        this.idSocio = idSocio;
        this.dniSocio = dniSocio;
        this.nombreSocio = nombreSocio;
        this.apellidoSocio = apellidoSocio;
        this.edadSocio = edadSocio;
        this.correoSocio = correoSocio;
        this.telefonoSocio = telefonoSocio;
        this.estado = estado;
    }

    public Socio(String dniSocio, String nombreSocio, String apellidoSocio, int edadSocio, String correoSocio, String telefonoSocio, int estado) {
        this.dniSocio = dniSocio;
        this.nombreSocio = nombreSocio;
        this.apellidoSocio = apellidoSocio;
        this.edadSocio = edadSocio;
        this.correoSocio = correoSocio;
        this.telefonoSocio = telefonoSocio;
        this.estado = estado;
    }





    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getDniSocio() {
        return dniSocio;
    }

    public void setDniSocio(String dniSocio) {
        this.dniSocio = dniSocio;
    }

    public String getNombreSocio() {
        return nombreSocio;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public String getApellidoSocio() {
        return apellidoSocio;
    }

    public void setApellidoSocio(String apellidoSocio) {
        this.apellidoSocio = apellidoSocio;
    }

    public int getEdadSocio() {
        return edadSocio;
    }

    public void setEdadSocio(int edadSocio) {
        this.edadSocio = edadSocio;
    }

    public String getCorreoSocio() {
        return correoSocio;
    }

    public void setCorreoSocio(String correoSocio) {
        this.correoSocio = correoSocio;
    }

    public String getTelefonoSocio() {
        return telefonoSocio;
    }

    public void setTelefonoSocio(String telefonoSocio) {
        this.telefonoSocio = telefonoSocio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }


}
