package co.com.vehiculos.modelo.clientes;

import co.com.vehiculos.modelo.clientes.CreaCliente;
import co.com.vehiculos.modelo.clientes.Propietario;
import co.com.vehiculos.modelo.clientes.PropietarioAvion;
import co.com.vehiculos.modelo.clientes.UtilCliente;

public class TestCliente {


    public static void main(String[] args) {
        Propietario propietario = new Propietario();
        UtilCliente clienteAvion = new PropietarioAvion();
        PropietarioAvion propietarioAvion = new PropietarioAvion();
        CreaCliente creaCliente = new CreaCliente(clienteAvion);
        clienteAvion.crearCliente(creaCliente);
        clienteAvion.verCliente(creaCliente);


        UtilCliente clienteYate = new PropietarioYate();
        CreaCliente creaClienteYate = new CreaCliente(clienteYate);
        creaClienteYate.generarCliente(propietario);
        creaClienteYate.imprimirCliente(propietario);
       
        UtilCliente clienteMoto = new PropietarioYate();
        CreaCliente creaClienteMoto = new CreaCliente(clienteMoto);
        creaClienteMoto.generarCliente(propietario);
        creaClienteMoto.imprimirCliente(propietario);
        








    }




}
