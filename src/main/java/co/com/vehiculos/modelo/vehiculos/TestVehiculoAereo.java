package co.com.vehiculos.modelo.vehiculos;

import co.com.vehiculos.modelo.clientes.Propietario;
import co.com.vehiculos.modelo.matricula.Matricula;

public class TestVehiculoAereo {
    public static void main(String[] args) {

        VehiculoAereo va = new VehiculoAereo();
        Propietario propietario = new Propietario();
        Matricula matricula = new Matricula();

        va.propietario = propietario;
        va.matricula = matricula;

        va.generarVenta();
        va.facturarVenta();


    }
}
