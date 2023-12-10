package co.com.vehiculos.modelo.clientes;

import co.com.vehiculos.modelo.clientes.CreaCliente;
import co.com.vehiculos.modelo.clientes.Propietario;
import co.com.vehiculos.modelo.clientes.UtilCliente;

public class PropietarioAvion implements UtilCliente {

    Propietario propietario = new Propietario();

    @Override
    public void crearCliente(CreaCliente creaCliente) {

        System.out.println("Cliente Avion");

        creaCliente.generarCliente(propietario);

    }

    @Override
    public void verCliente(CreaCliente creaCliente) {

        creaCliente.imprimirCliente(propietario);

    }
}
