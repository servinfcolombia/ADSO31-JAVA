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
        // Prueba de conexion a la base de datos
        System.out.println("CRUD Java MVC");
        ConexionLocal nConexion = new ConexionLocal();
        nConexion.conectar();
        nConexion.desconectar();
        nConexion.testearConexion();
        
        // Mostrar el formulario
        JFramePersona mostrarFormPersonas = new JFramePersona();
        mostrarFormPersonas.setLocationRelativeTo(null);
        mostrarFormPersonas.setVisible(true);
    }
    
}
