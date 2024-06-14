package persistence;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
private static final String bd = "jdbc:mysql://localhost:3307/gimg8";
    private static final String usuario = "root";
    private static final String password = "root";
    private static Connection connection;

    private Conexion() {
    }

    public static Connection getConexion() {
        if (connection == null) { 
            try {
                Class.forName("org.mariadb.jdbc.Driver"); //se cargan los driver de conexión al gestor de base de datos
                //Setup the connection with the DB
                connection = DriverManager.getConnection(bd, usuario, password);//se establece la conexión a la base de datos invocando al método getConnection()
                // creando un objeto conexion


            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse al cargar los drivers");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
            }
        }

        return connection; // si ya esta conectadodevuelve la misma conexion

    }
}