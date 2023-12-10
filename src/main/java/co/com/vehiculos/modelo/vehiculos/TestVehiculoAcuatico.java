package co.com.vehiculos.modelo.vehiculos;

import co.com.vehiculos.modelo.clientes.Propietario;
import co.com.vehiculos.modelo.matricula.Matricula;

public class TestVehiculoAcuatico {

    public static void main(String[] args) {


        Propietario propietario = new Propietario();
        Matricula matricula = new Matricula();
        VehiculoAcuatico yateCarolG = new VehiculoAcuatico();

        yateCarolG.matricula = matricula;
        yateCarolG.propietario = propietario;

        yateCarolG.generarVenta();
        yateCarolG.facturarVenta();










    }



}
