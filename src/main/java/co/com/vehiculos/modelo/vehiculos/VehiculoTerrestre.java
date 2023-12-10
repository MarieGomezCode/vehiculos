package co.com.vehiculos.modelo.vehiculos;

import co.com.vehiculos.modelo.clientes.Propietario;
import co.com.vehiculos.modelo.matricula.Matricula;
import co.com.vehiculos.modelo.vehiculos.Vehiculo;

public class VehiculoTerrestre extends Vehiculo {

    private String categoria;

    Propietario propietario;

    Matricula matricula;


     public VehiculoTerrestre(){
         super();
     }


    public VehiculoTerrestre(int idVehiculo, String tipo, String marca, String referencia, String modelo, String categoria) {
        super(idVehiculo, tipo, marca, referencia, modelo);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Override
    public void generarVenta() {
        super.generarVenta();
        System.out.println("Ingrese la categoria");
        categoria = sc.nextLine();
    }

    @Override
    public void facturarVenta() {
        super.facturarVenta();
        System.out.println("Categorias" + categoria);
        System.out.println("Nombre del cliente:" + propietario.getNombre());
        System.out.println("Matricula " + matricula.getMatricula());
        System.out.println("Ciudad de matricula " + matricula.getCiudad());

    }
}
