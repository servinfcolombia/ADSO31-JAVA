/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuracion;
import Interface.IGestorConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Felipe Rodriguez
 */
public class ConexionLocal implements IGestorConexion{
    
    private String url = "jdbc:mysql://localhost/crud_java_mvc";
    private String usuario = "root";
    private String clave = "";
    
    //Instancia de la clase Connection del sistema
    private Connection conexion;

    public ConexionLocal() {
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(this.url, this.usuario, this.clave);
            System.out.println("Conectado a la base de Datos Local");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexionLocal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void desconectar() {
        try {
            conexion.close();
            System.out.println("Desconectado de la base de datos local");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionLocal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void testearConexion() {
        try {
            if(conexion != null && !conexion.isClosed()){
                System.out.println("Conexion Abierta");
            } else {
                System.out.println("Conexion Cerrada");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionLocal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
