/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Felipe Rodriguez
 */
package Configuracion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class MiConexion {

    private Connection cnn;
    private String cadenaConexion, usuarioDb, claveDb;

    public MiConexion(String cadenaConexion, String usuarioDb, String claveDb) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.cadenaConexion = cadenaConexion;
            this.usuarioDb = usuarioDb;
            this.claveDb = claveDb;
            cnn = DriverManager.getConnection(this.cadenaConexion, this.usuarioDb, this.claveDb);
            System.out.print("estas conectado");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MiConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean testearConexion(){
        try {
            return !cnn.isClosed();
        } catch (SQLException ex) {
            Logger.getLogger(MiConexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }    
    public void abrirConexion(){
        try {
            cnn=DriverManager.getConnection(cadenaConexion, "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(MiConexion.class.getName()).log(Level.SEVERE, null, ex);
   
        }
    }
    public void cerrarConexion(){
        try {
            cnn.close();
            System.out.println("Desconectado");
        } catch (SQLException ex) {
        }
    }
}
