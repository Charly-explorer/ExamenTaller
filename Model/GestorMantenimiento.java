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
    
    private ArrayList<vehiculo> vehiculos; 
    
    private GestorMantenimiento instance;

    private GestorMantenimiento() {
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        this.vehiculos = new ArrayList<>();
    }
    
    public synchronized GestorMantenimiento getInstance(){
        if(instance == null){
            instance = new GestorMantenimiento();
        }
        return instance;
        
    }
    
    public static void Agregar(vehiculo vehiculo){
        vehiculos.add(vehiculo)
    }
    public static void Eliminar(vehiculo vehiculo){
        vehiculos.remove(vehiculo);
    }
    public static void Buscar(int id){
        for(vehiculo v1 : vehiculos){
            if(v1.cliente.getId == vehiculo.cliente.getId){
                return v1;
            }
        }
    }
    
    
}
