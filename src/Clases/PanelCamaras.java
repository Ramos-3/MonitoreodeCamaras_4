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


public class PanelCamaras {
    private List<Camara> listaCamaras;

    public PanelCamaras() {
        this.listaCamaras = new ArrayList<>();
    }

    public void agregarCamara(Camara camara) {
        listaCamaras.add(camara);
        System.out.println("Cámara " + camara.getNombre() + " agregada al panel de cámaras.");
    }

    public void mostrarCamaras() {
        System.out.println("Cámaras en el panel:");
        for (Camara camara : listaCamaras) {
            System.out.println("- " + camara.getNombre());
        }
    }

}

