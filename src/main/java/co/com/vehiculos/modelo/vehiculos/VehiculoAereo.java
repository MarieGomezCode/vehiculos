package co.com.vehiculos.modelo.vehiculos;

import co.com.vehiculos.modelo.clientes.Propietario;
import co.com.vehiculos.modelo.matricula.Matricula;
import co.com.vehiculos.modelo.vehiculos.Vehiculo;

public class VehiculoAereo extends Vehiculo {


    private String tipoAeronave;

    Propietario propietario;
    Matricula matricula;

    public VehiculoAereo(){
        super();
    }

    public VehiculoAereo(int idVehiculo, String tipo, String marca, String referencia, String modelo, String tipoAeronave) {
        super(idVehiculo, tipo, marca, referencia, modelo);
        this.tipoAeronave = tipoAeronave;
    }


    public String getTipoAeronave() {
        return tipoAeronave;
    }

    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }

    //Metodos


    @Override
    public void generarVenta() {
        super.generarVenta();
        System.out.println("Ingrese el tipo de aeronave:");
        tipoAeronave = sc.nextLine();
    }

    @Override
    public void facturarVenta() {
        super.facturarVenta();
        System.out.println("Tipo de aeronave:" + tipoAeronave);
        System.out.println("NOmbre del cliente: " + propietario.getNombre());
        System.out.println("Numero de matricula: " + matricula.getMatricula());
        System.out.println("Ciudad de Matricula: " + matricula.getCiudad());
    }
}
