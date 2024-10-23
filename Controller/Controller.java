/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.GestorMantenimiento;
import Model.IGestorMantenimiento;
import View.FrmViewServicios;
import View.FrmViewVehiculo;
import View.IView;

/**
 *
 * @author Student
 */
public class Controller extends Thread{
    IGestorMantenimiento GestorMantenimiento = new GestorMantenimiento();
    IView FrmViewVehiculo= new FrmViewVehiculo();
    IView FrmViewServicio =  new FrmViewServicios();
    
    @Override
    public void run(){
        
    }
    
}
