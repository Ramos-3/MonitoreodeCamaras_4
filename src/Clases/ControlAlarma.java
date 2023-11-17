/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author USER
 */
public class ControlAlarma {
    private boolean activada;
    private boolean sonando;

    public ControlAlarma() {
        this.activada = false;
        this.sonando = false;
    }

    public void activarAlarma() {
        if (!activada) {
            activada = true;
            System.out.println("Alarma activada.");
        } else {
            System.out.println("La alarma ya está activada.");
        }
    }

    public void desactivarAlarma() {
        if (activada) {
            activada = false;
            detenerSonido();
            System.out.println("Alarma desactivada.");
        } else {
            System.out.println("La alarma ya está desactivada.");
        }
    }

    public void activarSonido() {
        if (activada && !sonando) {
            sonando = true;
            System.out.println("¡Alarma sonando!");
        }
    }

    public void detenerSonido() {
        if (sonando) {
            sonando = false;
            System.out.println("Sonido de alarma detenido.");
        }
    }

   
}

