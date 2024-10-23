
package Model;

public class Cliente {
   private String nombre;
   private String id;
   private String numeroCel;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroCel(String numeroCel) {
        this.numeroCel = numeroCel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getNumeroCel() {
        return numeroCel;
    }

    public Cliente(String nombre, String id, String numeroCel) {
        this.nombre = nombre;
        this.id = id;
        this.numeroCel = numeroCel;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", id=" + id + ", numeroCel=" + numeroCel + '}';
    }
   
}
