/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import PantallasProyect.MenuCamera;
import PantallasProyect.PantallaBienve;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author JHON ORTEGA ECHENIQUE
 */
public class Usuarios {
    private int id;
    private String nombreUsuario;
    private String contraseña;

    public Usuarios() {
    }

    public Usuarios(int id, String nombreUsuario, String contraseña) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
   
    
    
    
    public void GuardarUsuario(JTextField p1nombreUsuario, JTextField p2contraseña ){
    
          setNombreUsuario(p1nombreUsuario.getText());
          setContraseña(p2contraseña.getText());
          
          Conexion conec = new Conexion();

          String consulta="INSERT INTO usuarios ( Nombre_Usuario, contraseña) VALUES (?,?);";
          
   try { 
          CallableStatement cs = conec.estableceConeccion().prepareCall(consulta);
          cs.setString(1, getNombreUsuario());
          cs.setString(2, getContraseña());
          cs.execute();
          
          JOptionPane.showMessageDialog(null, "Usuario Guardado Correctamente" );

    }catch(SQLException e)
       {
          JOptionPane.showMessageDialog(null, "El usuario no se guardo correctamente, error:"+e.toString() );

        }
    }
    
    
    public void accesoUsuario(String usuario, String contraseña)
   {
       Conexion conec = new Conexion();     
       String usuarioCorrecto = null;
       String contraseñaCorrecta = null;
      try { 
        Connection cn = conec.estableceConeccion();
        PreparedStatement pst = cn.prepareStatement("SELECT Nombre_Usuario, Contraseña FROM usuarios");
        ResultSet rs = pst.executeQuery();
        
        if(rs.next()){
        usuarioCorrecto = rs.getString(1);
        contraseñaCorrecta = rs.getString(2);
        }
        if(usuario.equals(usuarioCorrecto)&& contraseña.equals(contraseñaCorrecta)) { 
        
            JOptionPane.showMessageDialog(null, " bienvenido " + usuario );
          
            MenuCamera mn = new MenuCamera();
            mn.setLocationRelativeTo(null);
            mn.setVisible(true);       
              
       }else if(!usuario.equals(usuarioCorrecto) || contraseña.equals(contraseñaCorrecta)){  
        JOptionPane.showMessageDialog(null, "Usuarios O contraseña incorrectos");
       }  

       }catch(SQLException e)
       {
            System.out.println(e); 

        }

    }
       
    
}
