/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crud.java.mvc;

import Configuracion.ConexionLocal;
import Vistas.JFramePersona;

/**
 *
 * @author Daniela
 */
public class CRUDJAVAMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("CRUD Java MVC");

    // ✅ Test de conexión
    java.sql.Connection conn = ConexionLocal.getConnection();
    if (conn != null) {
        System.out.println("✅ Conexión exitosa a la base de datos.");
        ConexionLocal.closeConnection(conn);
    } else {
        System.out.println("❌ Error al conectar a la base de datos.");
    }

    // Mostrar formulario
    JFramePersona mostrarFormPersonas = new JFramePersona();
    mostrarFormPersonas.setLocationRelativeTo(null);
    mostrarFormPersonas.setVisible(true);
}
    
}
