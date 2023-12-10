package co.com.vehiculos.modelo.clientes;

public class PropietarioYate implements UtilCliente{


    Propietario propietario = new Propietario();


    @Override
    public void crearCliente(CreaCliente creaCliente) {
        System.out.println("Cliente Yate");
        creaCliente.generarCliente(propietario);
    }


    @Override
    public void verCliente(CreaCliente creaCliente) {

        creaCliente.imprimirCliente(propietario);
    }
}
