/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Configuracion.ConexionLocal;
import Models.ModelPersona;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ControllerPersona {

    public boolean insertar(ModelPersona p) {
        String sql = "INSERT INTO Persona (nombre, apellidos, correo, fecha_nacimiento, pais, profesion, rol_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionLocal.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getNombre());
            stmt.setString(2, p.getApellidos());
            stmt.setString(3, p.getCorreo());
            stmt.setDate(4, new java.sql.Date(p.getFechaNacimiento().getTime()));
            stmt.setString(5, p.getPais());
            stmt.setString(6, p.getProfesion());
            stmt.setInt(7, p.getRol_id());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<ModelPersona> listar() {
        List<ModelPersona> lista = new ArrayList<>();
        String sql = "SELECT * FROM Persona";
        try (Connection conn = ConexionLocal.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                ModelPersona p = new ModelPersona();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setApellidos(rs.getString("apellidos"));
                p.setCorreo(rs.getString("correo"));
                p.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                p.setPais(rs.getString("pais"));
                p.setProfesion(rs.getString("profesion"));
                p.setRol_id(rs.getInt("rol_id"));
                lista.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public boolean actualizar(ModelPersona p) {
        String sql = "UPDATE Persona SET nombre = ?, apellidos = ?, correo = ?, fecha_nacimiento = ?, pais = ?, profesion = ?, rol_id = ? WHERE id = ?";
        try (Connection conn = ConexionLocal.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getNombre());
            stmt.setString(2, p.getApellidos());
            stmt.setString(3, p.getCorreo());
            stmt.setDate(4, new java.sql.Date(p.getFechaNacimiento().getTime()));
            stmt.setString(5, p.getPais());
            stmt.setString(6, p.getProfesion());
            stmt.setInt(7, p.getRol_id());
            stmt.setInt(8, p.getId());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminar(int id) {
        String sql = "DELETE FROM Persona WHERE id = ?";
        try (Connection conn = ConexionLocal.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ModelPersona buscarPorNombre(String nombre) {
    String sql = "SELECT * FROM Persona WHERE nombre LIKE ? LIMIT 1";
    try (Connection conn = ConexionLocal.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, "%" + nombre + "%");
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            ModelPersona p = new ModelPersona();
            p.setId(rs.getInt("id"));
            p.setNombre(rs.getString("nombre"));
            p.setApellidos(rs.getString("apellidos"));
            p.setCorreo(rs.getString("correo"));
            p.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
            p.setPais(rs.getString("pais"));
            p.setProfesion(rs.getString("profesion"));
            p.setRol_id(rs.getInt("rol_id"));
            return p;
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null; // no encontrado
}
}