package persistence;

import entities.Clase;
import entities.Membresia;
import entities.Socio;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class MembresiaData {

    private Connection connection;

    public MembresiaData() {
        connection = Conexion.getConexion();
    }

    public void agregarMembresia(Membresia membresia) {
        String query = "INSERT INTO `membresias`(`CantidadPases`, `Id_Socio`, `Fecha_Inicio`, `Fecha_Fin`, `Costo`, `Estado`) VALUES (?, ?, ?, ?, ?, ? )";
        try (PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, membresia.getCantPases());
            ps.setInt(2, membresia.getSocio().getIdSocio());
            ps.setDate(3, java.sql.Date.valueOf(membresia.getFechaInicio()));
            ps.setDate(4, java.sql.Date.valueOf(membresia.getFechaFin()));
            ps.setDouble(5, membresia.getCosto());
            ps.setInt(6, membresia.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                // Obtener el id generado (opcional)
                membresia.setIdMembresia(rs.getInt(1));// el (1) es la columna 1 donde esta el id, originalmente se llama insert_id, ese campo
                JOptionPane.showMessageDialog(null, "Socio añadido con éxito.");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Socio: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public Membresia MembresiaxSocio(Socio socio) {
        int id = socio.getIdSocio();
        Membresia membresia = null; // Initialize as null to handle the case where no membership is found
        String sql = "SELECT * FROM membresias WHERE Id_Socio = ? AND Estado = 1"; // Add WHERE clause to filter by Socio ID and active state

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    membresia = new Membresia();
                    membresia.setIdMembresia(rs.getInt("Id_Membresia"));
                    membresia.setCantPases(rs.getInt("CantidadPases"));
                    membresia.setSocio(socio);
                    membresia.setFechaInicio(rs.getDate("Fecha_Inicio").toLocalDate());
                    membresia.setFechaFin(rs.getDate("Fecha_Fin").toLocalDate());
                    membresia.setCosto(rs.getDouble("Costo"));
                    membresia.setEstado(rs.getInt("Estado"));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Membresias: " + ex.getMessage());
        }
        return membresia;
    }

    public List<Membresia> listarMembresia() {
        List<Membresia> membresia = new ArrayList<>();
        SocioData socioData = new SocioData();
        String query = "SELECT * FROM membresias";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Membresia i = new Membresia();
                i.setIdMembresia(rs.getInt("Id_Membresia"));
                i.setCantPases(rs.getInt("CantidadPases"));
                i.setSocio(socioData.buscarSocio(rs.getInt("Id_Socio")));
                i.setFechaInicio(rs.getDate("Fecha_Inicio").toLocalDate());
                i.setFechaFin(rs.getDate("Fecha_Fin").toLocalDate());
                i.setCosto(rs.getInt("Costo"));
                i.setEstado(rs.getInt("Estado"));
                membresia.add(i);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Membresia: " + e.getMessage());
            e.printStackTrace();
        }
        return membresia;
    }

    public Membresia buscarMembresia(int id) {
        Membresia membresia = null;
        SocioData socioData = new SocioData();
        String sql = "SELECT  CantidadPases, Id_Socio, Fecha_Inicio, Fecha_Fin, Costo, Estado FROM membresias WHERE Id_Membresia = ? AND Estado = 1";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();//consulta

            if (rs.next()) {
                membresia = new Membresia();
                membresia.setIdMembresia(id);
                membresia.setCantPases(rs.getInt("CantidadPases"));
                membresia.setSocio(socioData.buscarSocio(rs.getInt("Id_Socio")));
                membresia.setFechaInicio(rs.getDate("Fecha_Inicio").toLocalDate());
                membresia.setFechaFin(rs.getDate("Fecha_Fin").toLocalDate());
                membresia.setCosto(rs.getInt("Costo"));
                membresia.setEstado(rs.getInt("Estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe la Membresia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Membresia: " + ex.getMessage());
        }

        return membresia;

    }

    public List<Membresia> listarMembresiaxSocio(Socio socio) {
        int id = socio.getIdSocio();
        List<Membresia> membresias = new ArrayList<>();
        String sql = "SELECT * FROM membresias";

        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {

                Membresia i = new Membresia();

                i.setIdMembresia(rs.getInt("Id_Membresia"));
                i.setCantPases(rs.getInt("CantidadPases"));
                i.setSocio(socio);
                i.setFechaInicio(rs.getDate("Fecha_Inicio").toLocalDate());
                i.setFechaFin(rs.getDate("Fecha_Fin").toLocalDate());
                i.setCosto(rs.getDouble("Costo"));
                i.setEstado(rs.getInt("Estado"));
                membresias.add(i);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones: " + ex.getMessage());
        }
        return membresias;

    }

    public void actualizarMembresia(Membresia membresia) {
        String query = "UPDATE membresias SET CantidadPases=?,Fecha_Inicio=?,Fecha_Fin=?,Costo=?,Estado=? WHERE Id_Membresia LIKE ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, membresia.getCantPases());
            ps.setDate(2, java.sql.Date.valueOf(membresia.getFechaInicio()));
            ps.setDate(3, java.sql.Date.valueOf(membresia.getFechaFin()));
            ps.setDouble(4, membresia.getCosto());
            ps.setInt(5, membresia.getEstado());
            ps.setInt(6, membresia.getIdMembresia());
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("id membre: " + membresia.getIdMembresia());
                JOptionPane.showMessageDialog(null, "Membresia actualizada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar la Membresia.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void borrarMembresia(int id) {
        String query = "DELETE FROM membresias WHERE Id_Membresia = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Membresia eliminada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar la Membresia.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
