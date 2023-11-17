/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;
/**
 *
 * @author JHON ORTEGA ECHENIQUE
 */
public class Conexion {
  
    Connection conectar = null;
    
    public Connection estableceConeccion(){
    
        try{ 
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        conectar = DriverManager.getConnection(""+"jdbc:mysql://127.0.0.1:3306/Proyecto_Camaras_Web?"+"user=root&password= ");
        }catch(Exception e){ 
        
            JOptionPane.showMessageDialog(null,"Problemas en la conexion"+e.toString());
     
        }
        return conectar;
    }
    
}
  //com.mysql.cj.jdbc.Driver
  // com.mysql.jdbc.Driver