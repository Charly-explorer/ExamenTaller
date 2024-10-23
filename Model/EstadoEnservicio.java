/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Student
 */
public class EstadoEnservicio implements State{

    @Override
    public void estado() {
        System.out.println("El carro se encuentra en servicio");
    }
    
}
