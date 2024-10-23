/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Student
 */
public class ServicioMantenimiento {
    String tipoServicio;
    EstadoServicio estado;

    public String getTipoServicio() {
        return tipoServicio;
    }

    public EstadoServicio getEstado() {
        return estado;
    }
    
    public void setEstado(EstadoServicio estado) {
        this.estado = estado;
    }

    public ServicioMantenimiento(String tipoServicio) {
        this.tipoServicio = tipoServicio;
        this.estado = EstadoServicio.EnEspera;
    }
    

    @Override
    public String toString() {
        return "ServicioMantenimiento{" + "tipoServicio=" + tipoServicio + ", estado=" + estado + '}';
    }
    
}
