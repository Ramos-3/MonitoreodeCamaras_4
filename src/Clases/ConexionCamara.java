/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author USER
 */
public class ConexionCamara {
    private String direccionIP;
    private int puerto;
    private boolean conectada;

    public ConexionCamara(String direccionIP, int puerto) {
        this.direccionIP = direccionIP;
        this.puerto = puerto;
        this.conectada = false; 
    }

    public void conectar() {
        
        this.conectada = true;
        System.out.println("Conexión establecida con la cámara en " + direccionIP + ":" + puerto);
    }

    public void desconectar() {
        
        this.conectada = false;
        System.out.println("Conexión cerrada con la cámara en " + direccionIP + ":" + puerto);
    }

    
    
   
}
