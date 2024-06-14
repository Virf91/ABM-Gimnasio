package persistence;

import entities.Entrenador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EntrenadorData {

    private Connection connection;

    public EntrenadorData() {
        connection = Conexion.getConexion();
    }

    public void agregarEntrenador(Entrenador entrenador) {
        String query = "INSERT INTO entrenadores(DNI, Nombre, Apellido, Especialidad, Disponibilidad) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, entrenador.getDniEntrenador());
            ps.setString(2, entrenador.getNombreEntrenador());
            ps.setString(3, entrenador.getApellidoEntrenador());
            ps.setString(4, entrenador.getEspecialidad());
            ps.setBoolean(5, entrenador.isEstado());
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Entrenador agregado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar el Entrenador.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Entrenador> listarEntrenadores() {
        List<Entrenador> entrenadores = new ArrayList<>();
        String query = "SELECT * FROM Entrenadores";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Entrenador entrenador = new Entrenador();
                entrenador.setIdEntrenador(rs.getInt("Id_Entrenador"));
                entrenador.setDniEntrenador(rs.getString("DNI"));
                entrenador.setNombreEntrenador(rs.getString("Nombre"));
                entrenador.setApellidoEntrenador(rs.getString("Apellido"));
                entrenador.setEspecialidad(rs.getString("Especialidad"));
                entrenador.setEstado(rs.getBoolean("Disponibilidad"));

                entrenadores.add(entrenador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return entrenadores;
    }

    public Entrenador listarEntrenadoresPorNombreyApellido(String nombre, String apellido) {
        Entrenador entrenador = null;
        String query = "SELECT * FROM Entrenadores WHERE Nombre = ? AND Apellido = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    entrenador = new Entrenador();
                    entrenador.setIdEntrenador(rs.getInt("Id_Entrenador"));
                    entrenador.setDniEntrenador(rs.getString("DNI"));
                    entrenador.setNombreEntrenador(rs.getString("Nombre"));
                    entrenador.setApellidoEntrenador(rs.getString("Apellido"));
                    entrenador.setEspecialidad(rs.getString("Especialidad"));
                    entrenador.setEstado(rs.getBoolean("Disponibilidad"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return entrenador;
    }

    public Entrenador listarEntrenadoresPorApellido(String apellido) {
        Entrenador entrenador = null;
        String query = "SELECT * FROM Entrenadores WHERE Apellido = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, apellido);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    entrenador = new Entrenador();
                    entrenador.setIdEntrenador(rs.getInt("Id_Entrenador"));
                    entrenador.setDniEntrenador(rs.getString("DNI"));
                    entrenador.setNombreEntrenador(rs.getString("Nombre"));
                    entrenador.setApellidoEntrenador(rs.getString("Apellido"));
                    entrenador.setEspecialidad(rs.getString("Especialidad"));
                    entrenador.setEstado(rs.getBoolean("Disponibilidad"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return entrenador;
    }

    public Entrenador buscarPorId(int id) {
        Entrenador entrenador = null;
        String query = "SELECT * FROM Entrenadores WHERE Id_Entrenador = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    entrenador = new Entrenador();
                    entrenador.setIdEntrenador(rs.getInt("Id_Entrenador"));
                    entrenador.setDniEntrenador(rs.getString("DNI"));
                    entrenador.setNombreEntrenador(rs.getString("Nombre"));
                    entrenador.setApellidoEntrenador(rs.getString("Apellido"));
                    entrenador.setEspecialidad(rs.getString("Especialidad"));
                    entrenador.setEstado(rs.getBoolean("Disponibilidad"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return entrenador;
    }

    public Entrenador buscarPorDni(String dni) {
        Entrenador entrenador = null;
        String query = "SELECT * FROM Entrenadores WHERE DNI = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, dni);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    entrenador = new Entrenador();
                    entrenador.setIdEntrenador(rs.getInt("Id_Entrenador"));
                    entrenador.setDniEntrenador(rs.getString("DNI"));
                    entrenador.setNombreEntrenador(rs.getString("Nombre"));
                    entrenador.setApellidoEntrenador(rs.getString("Apellido"));
                    entrenador.setEspecialidad(rs.getString("Especialidad"));
                    entrenador.setEstado(rs.getBoolean("Disponibilidad"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return entrenador;
    }

    public List<Entrenador> listarEntrenadoresPorEspecialidad(String especialidad) throws SQLException {
        List<Entrenador> entrenadores = new ArrayList<>();
        String query = "SELECT * FROM Entrenadores WHERE Especialidad = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, especialidad);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Entrenador entrenador = new Entrenador();
                    entrenador.setIdEntrenador(rs.getInt("Id_Entrenador"));
                    entrenador.setDniEntrenador(rs.getString("DNI"));
                    entrenador.setNombreEntrenador(rs.getString("Nombre"));
                    entrenador.setApellidoEntrenador(rs.getString("Apellido"));
                    entrenador.setEspecialidad(rs.getString("Especialidad"));
                    entrenador.setEstado(rs.getBoolean("Disponibilidad"));

                    entrenadores.add(entrenador);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return entrenadores;
        }
    }
}
