/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author JHON ORTEGA ECHENIQUE
 */
public class Camara {
    private int id;
    private String nombre;
    private boolean encendida;

    public Camara() {}

    public Camara(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.encendida = false; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }
    

    public void encender() {
        this.encendida = true;
        System.out.println("Cámara " + nombre + " encendida.");
    }

    public void apagar() {
        this.encendida = false;
        System.out.println("Cámara " + nombre + " apagada.");
    }

    public void tomarImagen() {
        if (encendida) {
            System.out.println("Se ha tomado una imagen con la cámara " + nombre);
        } else {
            System.out.println("La cámara está apagada. Enciende la cámara para tomar una imagen.");
        }
    }

    
}
