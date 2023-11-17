/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author 
 */


public class Configuracion {
    private Map<String, String> configuraciones;

    public Configuracion() {
        this.configuraciones = new HashMap<>();
    }

    public void agregarConfiguracion(String clave, String valor) {
        configuraciones.put(clave, valor);
    }

    public String obtenerConfiguracion(String clave) {
        return configuraciones.get(clave);
    }

    public boolean existeConfiguracion(String clave) {
        return configuraciones.containsKey(clave);
    }

    public void eliminarConfiguracion(String clave) {
        configuraciones.remove(clave);
    }

    public void mostrarConfiguraciones() {
        System.out.println("Configuraciones:");
        for (Map.Entry<String, String> entry : configuraciones.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

