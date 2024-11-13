package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static Connection con;
    
    public static Connection ConectarDB() {
        String url = "jdbc:mysql://localhost:3306/almacenycompra";  // Asegúrate que el puerto y el nombre de la BD son correctos
        String user = "root";
        String password = ""; // Cambia según tu configuración

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Asegúrate de usar el driver correcto
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión Satisfactoria\n");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión: " + e);
        }
        
        return con;
    }
    
    public Connection getConnection() {
        return ConectarDB();
    }
}
