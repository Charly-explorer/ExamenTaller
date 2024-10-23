/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

/**
 *
 * @author Student
 */
public interface IGestorMantenimiento<T> {
    public void Agregar(T objeto);
    public void Eliminar(T objeto);
    public Vehiculo BuscarVehiculoCliente(String id);
    public int ContadorServicios();
}
