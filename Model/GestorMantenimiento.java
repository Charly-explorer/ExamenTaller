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

    private ArrayList<ServicioMantenimiento> servicios;

    private GestorMantenimiento instance;

    private GestorMantenimiento() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.servicios = new ArrayList<>();
    }

    public synchronized GestorMantenimiento getInstance() {
        if (instance == null) {
            instance = new GestorMantenimiento();
        }
        return instance;
    }
    
    public void Agregar(ServicioMantenimiento servicio) {
        servicios.add(servicio);
    }

    public void Eliminar(ServicioMantenimiento servicio) {
        servicios.remove(servicio);
    }

    public Vehiculo BuscarVehiculoCliente(String id) {
        for (ServicioMantenimiento v1 : servicios) {
            if (v1.getVehiculo().getCliente().getId == id){
                return v1;
            }
        }
        return null;
    }
    
    public int ContadorServicios(){
        int cont = 0;
        for (ServicioMantenimiento v1 : servicios){
            cont =+ 1;
        }
        return cont;
    }
    
}