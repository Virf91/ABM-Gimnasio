package persistence;

import entities.Asistencia;
import entities.Clase;
import entities.Entrenador;
import entities.Socio;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.time.LocalTime;

public class AsistenciaData {

    private Connection connection;
    EntrenadorData ed = new EntrenadorData();

    public AsistenciaData() {
        connection = Conexion.getConexion();
    }

    public void agregarAsistencia(Asistencia asistencia) {
        String checkSocioSql = "SELECT COUNT(*) FROM socios WHERE Id_Socio = ?";
        String insertAsistenciaSql = "INSERT INTO asistencia (Id_Socio, ID_Clase, Fecha_Asistencia) VALUES (?, ?, ?)";

        try (PreparedStatement checkStatement = connection.prepareStatement(checkSocioSql)) {
            checkStatement.setInt(1, asistencia.getSocio().getIdSocio());

            ResultSet rs = checkStatement.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                try (PreparedStatement insertStatement = connection.prepareStatement(insertAsistenciaSql)) {
                    insertStatement.setInt(1, asistencia.getSocio().getIdSocio());
                    insertStatement.setInt(2, asistencia.getClase().getIdClase());
                    insertStatement.setDate(3, Date.valueOf(asistencia.getFechaAsistencia()));

                    int filasAfectadas = insertStatement.executeUpdate();
                    if (filasAfectadas > 0) {
                        JOptionPane.showMessageDialog(null, "Asistencia agregada exitosamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al agregar la asistencia.");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El socio con Id_Socio = " + asistencia.getSocio().getIdSocio() + " no existe.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int obtenerCapacidadActual(String nombreClase) {
        String sql = "SELECT COUNT(a.Id_Socio) AS SociosPresentes "
                + "FROM asistencia a "
                + "INNER JOIN clases c ON a.Id_Clase = c.Id_Clase "
                + "WHERE c.Nombre LIKE ? "
                + "AND a.Fecha_Asistencia = CURRENT_DATE";
        int capAct = 0;
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, nombreClase);
            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    capAct = rs.getInt("SociosPresentes");

                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return capAct;
    }

    public List<Clase> obtenerClasesDisponibles(String nombreClase) {
        String sql = "SELECT c.Id_Clase, c.Nombre, c.Id_Entrenador, c.Horario, c.Capacidad, c.Estado "
                + "FROM clases c "
                + "WHERE c.Nombre LIKE ? "
                + "AND c.Capacidad > ("
                + "    SELECT COUNT(a.Id_Socio) "
                + "    FROM asistencia a "
                + "    WHERE a.Id_Clase = c.Id_Clase "
                + "    AND a.Fecha_Asistencia = CURRENT_DATE"
                + ")";

        List<Clase> clasesDisponibles = new ArrayList<>();

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, "%" + nombreClase + "%"); // Establecer el parámetro para el patrón de nombre de clase

            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {
                    int idClase = resultSet.getInt("Id_Clase");
                    String nombre = resultSet.getString("Nombre");
                    Entrenador e = ed.buscarPorId(resultSet.getInt("Id_Entrenador"));
                    LocalTime horario = (resultSet.getTime("Horario").toLocalTime());
                    int capacidad = resultSet.getInt("Capacidad");
                    boolean estado = resultSet.getBoolean("Estado");
                    Clase clasePosible = new Clase(idClase, nombre, e, horario, capacidad, estado);
                    clasesDisponibles.add(clasePosible);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clasesDisponibles;
    }

    public void actualizarAsistencia(Asistencia asistencia) {
        String sql = "UPDATE asistencia SET ID_Socio = ?, ID_Clase = ?, Fecha_Asistencia = ? WHERE ID_Asistencia = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, asistencia.getSocio().getIdSocio()); // Obtener el ID del socio
            statement.setInt(2, asistencia.getClase().getIdClase()); // Obtener el ID de la clase
            statement.setDate(3, Date.valueOf(asistencia.getFechaAsistencia()));
            statement.setInt(4, asistencia.getIdAsistencia());

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Asistencia actualizada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar la asistencia.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void borrarAsistencia(int idAsistencia) {
        String sql = "DELETE FROM asistencia WHERE ID_Asistencia = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idAsistencia);

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Asistencia eliminada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar la asistencia.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Asistencia listarAsistenciaPorId(int idAsistencia) {
        String sql = "SELECT * FROM asistencia WHERE ID_Asistencia = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idAsistencia);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Asistencia asistencia = new Asistencia();
                    asistencia.setIdAsistencia(resultSet.getInt("ID_Asistencia"));

                    // Aquí se deben obtener los objetos Socio y Clase con los IDs correspondientes
                    Socio socio = new Socio();
                    socio.setIdSocio(resultSet.getInt("ID_Socio"));
                    asistencia.setSocio(socio);

                    Clase clase = new Clase();
                    clase.setIdClase(resultSet.getInt("ID_Clase"));
                    asistencia.setClase(clase);

                    asistencia.setFechaAsistencia(resultSet.getDate("Fecha_Asistencia").toLocalDate());
                    return asistencia;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejar la excepción adecuadamente
        }
        return null;
    }

    public List<Asistencia> listarAsistencias() {
        List<Asistencia> asistencias = new ArrayList<>();
        try {
            String sql = "SELECT * FROM asistencia";
            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Asistencia asistencia = new Asistencia();
                asistencia.setIdAsistencia(rs.getInt("ID_Asistencia"));

                // Aquí se deben obtener los objetos Socio y Clase con los IDs correspondientes
                Socio socio = new Socio();
                socio.setIdSocio(rs.getInt("ID_Socio"));
                asistencia.setSocio(socio);

                Clase clase = new Clase();
                clase.setIdClase(rs.getInt("ID_Clase"));
                asistencia.setClase(clase);

                asistencia.setFechaAsistencia(rs.getDate("Fecha_Asistencia").toLocalDate());
                asistencias.add(asistencia);
            }
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return asistencias;
    }
}
