/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;
import java.sql.*;
import Configuracion.ConexionLocal;
import Models.ModelRoles;
import java.util.ArrayList;
import java.util.List;

public class ControllerRoles {
    public List<ModelRoles> ObtenerRoles() {
        List<ModelRoles> lista = new ArrayList<>();
        String sql = "SELECT id, nombre FROM Roles ORDER BY id";

        try (Connection conn = ConexionLocal.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                ModelRoles rol = new ModelRoles();
                rol.setId(rs.getInt("id"));
                rol.setNombre(rs.getString("nombre"));
                lista.add(rol);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
        
    public String obtenerNombrePorId(int id) {
        String sql = "SELECT nombre FROM Roles WHERE id = ?";
        try (Connection conn = ConexionLocal.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("nombre");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Desconocido";
    }
}
