package DAO;

import Modelo.Clasificacion;
import conexion.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClasificacionDAO {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    ConexionDB conec = new ConexionDB();
    
    public List<Clasificacion> listarclasificacion() {
        ArrayList<Clasificacion> Listar = new ArrayList<>();
        String sql = "SELECT * FROM Clasificacion";
        
        try {
            con = conec.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Clasificacion c = new Clasificacion();
                c.setId(rs.getInt("Idclasi"));
                c.setNCodigo(rs.getString("Codigo"));
                c.setNombre(rs.getString("Nombre"));
                c.setEstado(rs.getString("Estado"));
                
                Listar.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error al listar clasificaciones: " + e);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar recursos: " + e);
            }
        }
        
        return Listar;
    }
}
