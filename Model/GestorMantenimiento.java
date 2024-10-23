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
public class GestorMantenimiento implements IGestorMantenimiento<ServicioMantenimiento>{

    private ArrayList<ServicioMantenimiento> servicios;

    public GestorMantenimiento instance;

    public GestorMantenimiento() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.servicios = new ArrayList<>();
    }

    public GestorMantenimiento getInstance() {
        if (instance == null) {
            instance = new GestorMantenimiento();
        }
        return instance;
    }
    
    @Override
    public void Agregar(ServicioMantenimiento servicio) {
        servicios.add(servicio);
    }

    @Override
    public void Eliminar(ServicioMantenimiento servicio) {
        servicios.remove(servicio);
    }

    @Override
    public Vehiculo BuscarVehiculoCliente(String id) {
        for (ServicioMantenimiento v1 : servicios) {
            if (v1.getVehiculo().getCliente().getId == id){
                return v1;
            }
        }
        return null;
    }
    public ArrayList<Vehiculo> RetornarVehiculos(String id) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        for (ServicioMantenimiento v1 : servicios) {
            vehiculos.add(v1.getVehiculo());
        }
        return null;
    }
    
    @Override
    public int ContadorServicios(){
        int cont = 0;
        for (ServicioMantenimiento v1 : servicios){
            cont =+ 1;
        }
        return cont;
    }
    
}