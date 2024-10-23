/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Student
 */
public abstract class StadoServicio {
    protected EstadoServicio estado;

    public StadoServicio(EstadoServicio estado) {
        this.estado = estado;
    }
    
    public void enEspera(){}
    public void enProceso(){}
    public void completado(){}
}
