package persistence;
import entities.Clase;
import entities.Entrenador;
import java.sql.*;
import java.time.LocalTime;
import java.util.*;
import javax.swing.JOptionPane;

public class ClaseData {

    private Connection connection;
    private EntrenadorData ed = new EntrenadorData();

    public ClaseData() {
        connection = Conexion.getConexion();
    }

    public void agregarClase(Clase clase) {
        String query = "INSERT INTO clases (Nombre, Id_Entrenador, Horario, Capacidad, Estado) VALUES (?, ?, ?, ?, ?)";  //String nombreClase, Entrenador entrenador, LocalTime horarioClase, int capacidad, boolean estado
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, clase.getNombreClase());
            ps.setInt(2, clase.getEntrenador().getIdEntrenador());
            ps.setTime(3, Time.valueOf(clase.getHorarioClase()));
            ps.setInt(4, clase.getCapacidad());
            ps.setBoolean(5, clase.isEstado());
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Clase agregada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar la clase.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Clase> listarClases() {
        List<Clase> clases = new ArrayList<>();
        String query = "SELECT * FROM clases";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Clase clase = new Clase();
                clase.setIdClase(rs.getInt("Id_Clase"));
                clase.setNombreClase(rs.getString("Nombre"));
                clase.setEntrenador(ed.buscarPorId(rs.getInt("Id_Entrenador")));
                clase.setHorarioClase(rs.getTime("Horario").toLocalTime());
                clase.setCapacidad(rs.getInt("Capacidad"));
                clase.setEstado(rs.getBoolean("Estado"));
                clases.add(clase);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clases;

    }

    public Clase listarClasesPorId(int id) {
        Clase clase = null;
        String query = "SELECT * FROM clases WHERE Id_Clase = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    clase = new Clase();
                    clase.setIdClase(rs.getInt("Id_Clase"));
                    clase.setNombreClase(rs.getString("Nombre"));
                    Entrenador entrenador = new Entrenador();
                    entrenador.setIdEntrenador(rs.getInt("Id_Entrenador"));
                    clase.setEntrenador(entrenador);
                    clase.setHorarioClase(rs.getTime("Horario").toLocalTime());
                    clase.setCapacidad(rs.getInt("Capacidad"));
                    clase.setEstado(rs.getBoolean("Estado"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clase;
    }

    public void actualizarClase(Clase clase) {
        String query = "UPDATE clases SET Nombre = ?, Id_Entrenador = ?, Horario = ?, Capacidad = ?, Estado = ? WHERE Id_Clase = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, clase.getNombreClase());
            ps.setInt(2, clase.getEntrenador().getIdEntrenador());
            ps.setTime(3, Time.valueOf(clase.getHorarioClase()));
            ps.setInt(4, clase.getCapacidad());
            ps.setBoolean(5, clase.isEstado());
            ps.setInt(6, clase.getIdClase());
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Clase actualizada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar la clase.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Clase> buscarPorNombre(String nombreClase) {
        List<Clase> clases = new ArrayList<>();
        String query = "SELECT * FROM clases WHERE Nombre = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, nombreClase);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Clase clase = new Clase();
                    clase.setIdClase(rs.getInt("Id_Clase"));
                    clase.setNombreClase(rs.getString("Nombre"));
                    clase.setEntrenador(ed.buscarPorId(rs.getInt("Id_Entrenador")));
                    clase.setHorarioClase(rs.getTime("Horario").toLocalTime());
                    clase.setCapacidad(rs.getInt("Capacidad"));
                    clase.setEstado(rs.getBoolean("Estado"));
                    clases.add(clase);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clases;
    }

    public List<Clase> buscarPorEntrenador(int idEntrenador) {
        List<Clase> clases = new ArrayList<>();
        String query = "SELECT * FROM clases WHERE Id_Entrenador = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, idEntrenador);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Clase clase = new Clase();
                    clase.setIdClase(rs.getInt("Id_Clase"));
                    clase.setNombreClase(rs.getString("Nombre"));
                    clase.setEntrenador(ed.buscarPorId(rs.getInt("Id_Entrenador")));
                    clase.setHorarioClase(rs.getTime("Horario").toLocalTime());
                    clase.setCapacidad(rs.getInt("Capacidad"));
                    clase.setEstado(rs.getBoolean("Estado"));
                    clases.add(clase);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clases;
    }

    public List<Clase> buscarPorHorario(LocalTime horarioClase) {
        List<Clase> clases = new ArrayList<>();
        String query = "SELECT * FROM clases WHERE Horario = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setTime(1, Time.valueOf(horarioClase));
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Clase clase = new Clase();
                    clase.setIdClase(rs.getInt("Id_Clase"));
                    clase.setNombreClase(rs.getString("Nombre"));
                    clase.setEntrenador(ed.buscarPorId(rs.getInt("Id_Entrenador")));
                    clase.setHorarioClase(rs.getTime("Horario").toLocalTime());
                    clase.setCapacidad(rs.getInt("Capacidad"));
                    clase.setEstado(rs.getBoolean("Estado"));
                    clases.add(clase);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clases;
    }

    public List<Clase> buscarPorRangoHorario(LocalTime horaInicio, LocalTime horaFin) {
        List<Clase> clases = new ArrayList<>();
        String query = "SELECT * FROM clases WHERE Horario BETWEEN ? AND ?";
        
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setTime(1, Time.valueOf(horaInicio));
            pstmt.setTime(2, Time.valueOf(horaFin));

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Clase clase = new Clase();
                    clase.setIdClase(rs.getInt("Id_Clase"));
                    clase.setNombreClase(rs.getString("Nombre"));
                    clase.setEntrenador(ed.buscarPorId(rs.getInt("Id_Entrenador")));
                    clase.setHorarioClase(rs.getTime("Horario").toLocalTime());
                    clase.setCapacidad(rs.getInt("Capacidad"));
                    clase.setEstado(rs.getBoolean("Estado"));
                    clases.add(clase);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clases;
    }

    public void borrarClase(int id) {
        String query = "DELETE FROM clases WHERE Id_Clase = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Clase eliminada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar la clase.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Clase> buscarClasesPorSocio(int idSocio) {
        List<Clase> clases = new ArrayList<>();
        String query = "SELECT c.* FROM clases c "
                     + "INNER JOIN clases_socios cs ON c.Id_Clase = cs.Id_Clase "
                     + "WHERE cs.Id_Socio = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, idSocio);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Clase clase = new Clase();
                    clase.setIdClase(rs.getInt("Id_Clase"));
                    clase.setNombreClase(rs.getString("Nombre"));
                    
                    Entrenador entrenador = new Entrenador();
                    entrenador.setIdEntrenador(rs.getInt("Id_Entrenador"));
                    clase.setEntrenador(entrenador);
                    
                    clase.setHorarioClase(rs.getTime("Horario").toLocalTime());
                    clase.setCapacidad(rs.getInt("Capacidad"));
                    clase.setEstado(rs.getBoolean("Estado"));
                    
                    clases.add(clase);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clases;
    }
    
    
}
