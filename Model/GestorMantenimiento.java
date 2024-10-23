/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class GestorMantenimiento {

    private ArrayList<Vehiculo> vehiculos;

    private GestorMantenimiento instance;

    private GestorMantenimiento() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.vehiculos = new ArrayList<>();
    }

    public synchronized GestorMantenimiento getInstance() {
        if (instance == null) {
            instance = new GestorMantenimiento();
        }
        return instance;
    }

    public void Agregar(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void Eliminar(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
    }

    public Vehiculo Buscar(String id) {
        for (Vehiculo v1 : vehiculos) {
            if (v1.getCliente().getId() == id) {
                return v1;
            }
        }
        return null;
    }
    
}