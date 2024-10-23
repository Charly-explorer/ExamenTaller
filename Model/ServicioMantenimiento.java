
package Model;


public class ServicioMantenimiento {
    private Vehiculo vehiculo;
    private String tipoServicio;
    private Estado estado;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

//    public void setEstado(Estado estado) {
//        estado;
//    }
//
//    public ServicioMantenimiento(Vehiculo vehiculo, String tipoServicio) {
//        this.vehiculo = vehiculo;
//        this.tipoServicio = tipoServicio;
//        this.estado = new Contexto();
//    }
    

    @Override
    public String toString() {
        return "ServicioMantenimiento{" + "tipoServicio=" + tipoServicio + ", estado=" + estado + '}';
    }
    
}
