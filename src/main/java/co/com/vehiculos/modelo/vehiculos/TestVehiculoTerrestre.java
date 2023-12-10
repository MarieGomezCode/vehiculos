package co.com.vehiculos.modelo.vehiculos;

import co.com.vehiculos.modelo.clientes.Propietario;
import co.com.vehiculos.modelo.matricula.Matricula;

public class TestVehiculoTerrestre {


    public static void main(String[] args) {

        Propietario propietario = new Propietario();
        Matricula matricula = new Matricula();

        VehiculoTerrestre vt = new VehiculoTerrestre();

        vt.propietario = propietario;
        vt.matricula = matricula;

        vt.generarVenta();
        vt.facturarVenta();



    }
}
