/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Student
 */
public class Vehiculo {
  private String marca;
  private String modelo; 
  private String matricula; 
  private Cliente cliente; 

    public Cliente getCliente() {
        return cliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Vehiculo(String marca, String modelo, String matricula, Cliente cliente) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cliente = cliente;
    }
  
  public Vehiculo (){
      this("","","",null);
  }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", cliente=" + cliente + '}';
    }
  
}
