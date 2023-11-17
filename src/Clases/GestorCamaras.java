/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USER
 */


public class GestorCamaras {
    private List<Camara> listaCamaras;

    public GestorCamaras() {
        this.listaCamaras = new ArrayList<>();
    }

    public void agregarCamara(Camara camara) {
        listaCamaras.add(camara);
        System.out.println("Cámara " + camara.getId() + " agregada al gestor de cámaras.");
    }

    public void iniciarTodasLasCamaras() {
        for (Camara camara : listaCamaras) {
            camara.encender();
        }
        System.out.println("Todas las cámaras han sido iniciadas.");
    }

    public void detenerTodasLasCamaras() {
        for (Camara camara : listaCamaras) {
            camara.apagar();
        }
        System.out.println("Todas las cámaras han sido detenidas.");
    }

   
}

