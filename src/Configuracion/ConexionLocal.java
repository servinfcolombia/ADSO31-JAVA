/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Clase de conexión local a MySQL para el proyecto CRUD-JAVA-MVC
 * @author Felipe Rodriguez
 */
public class ConexionLocal {
    private static final String URL = "jdbc:mysql://localhost:3306/crud_java_mvc";
    private static final String USUARIO = "root";
    private static final String CLAVE = "";
    /**
     * Obtiene una conexión activa a la base de datos
     * @return Connection o null si falla
     */
    public static Connection getConnection() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conexión exitosa a la base de datos."); 
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexionLocal.class.getName()).log(Level.SEVERE, "Error al conectar a la BD", ex);
        }
        return conexion;
    }
    /**
     * Cierra la conexión de forma segura
     * @param conexion objeto Connection a cerrar
     */
    public static void closeConnection(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConexionLocal.class.getName()).log(Level.SEVERE, "Error al cerrar conexión", ex);
            }
        }
    }
}