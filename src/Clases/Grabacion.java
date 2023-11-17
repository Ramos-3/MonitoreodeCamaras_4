/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.time.LocalDateTime;

/**
 *
 * @author USER
 */

public class Grabacion {
    private int id;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String nombreArchivo;

    public Grabacion(int id, String nombreArchivo) {
        this.id = id;
        this.nombreArchivo = nombreArchivo;
        this.fechaInicio = LocalDateTime.now(); 
    }

   

    public void finalizarGrabacion() {
        this.fechaFin = LocalDateTime.now(); 
        System.out.println("Grabación finalizada: " + nombreArchivo);
    }
}

