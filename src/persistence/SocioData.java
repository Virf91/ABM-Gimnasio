/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entities.Socio;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author carba
 */
public class SocioData {

    private Connection con = null;

    public SocioData() {
        con = Conexion.getConexion();
    }

    public void agregarSocio(Socio socio) {
        String query = "INSERT INTO socios ( DNI, Nombre, Apellido, Edad, Correo, Telefono, estado) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, socio.getDniSocio());
            ps.setString(2, socio.getNombreSocio());
            ps.setString(3, socio.getApellidoSocio());
            ps.setInt(4, socio.getEdadSocio());
            ps.setString(5, socio.getCorreoSocio());
            ps.setString(6, socio.getTelefonoSocio());
            ps.setInt(7, socio.getEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                // Obtener el id generado (opcional)
                socio.setIdSocio(rs.getInt(1));// el (1) es la columna 1 donde esta el id, originalmente se llama insert_id, ese campo
                JOptionPane.showMessageDialog(null, "Socio añadido con éxito.");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Socio: " + e.getMessage());
            e.printStackTrace();
        }
    }
// lista todos los socios

    public List<Socio> listarSocios() {
        List<Socio> socios = new ArrayList<>();
        String query = "SELECT * FROM socios";
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Socio socio = new Socio();
                socio.setDniSocio(rs.getString("dni"));
                socio.setNombreSocio(rs.getString("nombre"));
                socio.setApellidoSocio(rs.getString("nombre"));
                socio.setEdadSocio(rs.getInt("edad"));
                socio.setCorreoSocio(rs.getString("correo"));
                socio.setTelefonoSocio(rs.getString("telefono"));
                socio.setEstado(rs.getInt("Estado"));
                socios.add(socio);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Socio: " + e.getMessage());
            e.printStackTrace();
        }
        return socios;
    }

    //elimina socio pos id
    public void eliminarSocioPorId(int id) {
        try {
            String sql = "UPDATE socios SET estado = 0 WHERE id_socio = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó el Socio.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Socios: " + e.getMessage());
        }
    }

    //lista socios por id
    public Socio listarSociosPorId(int id) {
        Socio socio = null;
        String query = "SELECT * FROM Clases WHERE Id_Clase = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    socio = new Socio();
                    socio.setIdSocio(rs.getInt("Id_Socio"));
                    socio.setDniSocio(rs.getString("dni"));
                    socio.setNombreSocio(rs.getString("nombre"));
                    socio.setApellidoSocio(rs.getString("apellido"));
                    socio.setEdadSocio(rs.getInt("edad"));
                    socio.setCorreoSocio(rs.getString("correo"));
                    socio.setTelefonoSocio(rs.getString("telefono"));
                    socio.setEstado(rs.getInt("Estado"));

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return socio;
    }

    public Socio buscarSociosPorNombreyApellido(String nombre, String apellido) {
        Socio socio = null;
        String query = "SELECT * FROM socios WHERE Nombre = ? AND Apellido = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    socio = new Socio();
                    socio.setIdSocio(rs.getInt("Id_Socio"));
                    socio.setDniSocio(rs.getString("dni"));
                    socio.setNombreSocio(rs.getString("nombre"));
                    socio.setApellidoSocio(rs.getString("apellido"));
                    socio.setEdadSocio(rs.getInt("edad"));
                    socio.setCorreoSocio(rs.getString("correo"));
                    socio.setTelefonoSocio(rs.getString("telefono"));
                    socio.setEstado(rs.getInt("Estado"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return socio;
    }

    public void actualizarSocio(Socio socio) {
        //( DNI, Nombre, Apellido, Edad, Correo, Telefono, estado)
        String query = "UPDATE Socios SET DNI = ?, Nombre = ?, Apellido = ?, Edad = ?, Correo = ?, Telefono = ?, estado = ? WHERE Id_Socio = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, socio.getDniSocio());
            ps.setString(2, socio.getNombreSocio());
            ps.setString(3, socio.getApellidoSocio());
            ps.setInt(4, socio.getEdadSocio());
            ps.setString(5, socio.getCorreoSocio());
            ps.setString(6, socio.getTelefonoSocio());
            ps.setInt(7, socio.getIdSocio());
            ps.setInt(8, socio.getIdSocio());
            ps.executeUpdate();
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Socio no existe");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
// busca socio por id

    public Socio buscarSocio(int id) {
//SELECT `Id_Socio`, `DNI`, `Nombre`, `Apellido`, `Edad`, `Correo`, `Telefono`, `estado` 
        Socio socio = null;
        String sql = "SELECT dni, Nombre, Apellido, Edad, Correo, Telefono FROM socios WHERE id_Socio = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();//consulta

            if (rs.next()) {
                socio = new Socio();
                socio.setIdSocio(id);
                socio.setDniSocio(rs.getString("dni"));
                socio.setNombreSocio(rs.getString("nombre"));
                socio.setApellidoSocio(rs.getString("apellido"));
                socio.setEdadSocio(rs.getInt("edad"));
                socio.setCorreoSocio(rs.getString("correo"));
                socio.setTelefonoSocio(rs.getString("telefono"));
     

            } else {
                JOptionPane.showMessageDialog(null, "No existe el socio");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Socios: " + ex.getMessage());
        }

        return socio;
    }

public Socio buscarSocioPorDni(String dni) {
//SELECT Id_Socio, DNI, Nombre, Apellido, Edad, Correo, Telefono, estado 
        Socio socio = null;
        String sql = "SELECT Id_Socio, dni, Nombre, Apellido, Edad, Correo, Telefono, estado FROM socios WHERE dni = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);

            ResultSet rs = ps.executeQuery();//consulta

            if (rs.next()) {
                socio = new Socio();
                socio.setIdSocio(rs.getInt("Id_Socio"));
                socio.setDniSocio(dni);
                socio.setNombreSocio(rs.getString("nombre"));
                socio.setApellidoSocio(rs.getString("apellido"));
                socio.setEdadSocio(rs.getInt("edad"));
                socio.setCorreoSocio(rs.getString("correo"));
                socio.setTelefonoSocio(rs.getString("telefono"));
                socio.setEstado(rs.getInt("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el socio");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Socios: " + ex.getMessage());
        }
return socio;
}


// Método para verificar si el DNI existe en la base de datos
    public boolean existeDni(String dni) throws SQLException {
        // Consulta SQL para buscar el DNI en la base de datos
        String sql = "SELECT COUNT(*) AS count FROM socios WHERE dni = ?";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, dni);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int count = resultSet.getInt("count");
                    return count > 0; // Retorna true si el DNI existe, false en caso contrario
                }
            }
        }

        return false;
    }

}

