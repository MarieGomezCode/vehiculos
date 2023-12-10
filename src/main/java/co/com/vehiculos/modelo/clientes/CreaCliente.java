package co.com.vehiculos.modelo.clientes;

import java.util.Scanner;

public class CreaCliente{

    Scanner sc = new Scanner(System.in);


    private UtilCliente creadorCliente;

    public CreaCliente(UtilCliente creadorCliente){

        this.creadorCliente = creadorCliente;
    }

    public void generarCliente(Propietario propietario){

        System.out.println("Ingrese el id del cliente: ");
        int id = sc.nextInt();
        propietario.setId(id);
        sc.skip("\n");
        System.out.println("INgrese el nombre: ");
        String nombre = sc.nextLine();
        propietario.setNombre(nombre);
        System.out.println("INgrese el apellido: ");
        String apellido = sc.nextLine();
        propietario.setApellido(apellido);
        System.out.println("Ingrese el correo del cliente: ");
        String correo = sc.nextLine();
        propietario.setCorreo(correo);
        System.out.println("Ingrese el telefono: ");
        String telefono = sc.nextLine();
        propietario.setTelefono(telefono);
        System.out.println("Vehiculo interes: ");
        String prospecto = sc.nextLine();
        propietario.setProspecto(prospecto);
    }


    public void imprimirCliente(Propietario propietario){

        System.out.println("ID: " + propietario.getId());
        System.out.println("NOmbre: " + propietario.getNombre());
        System.out.println("Apellido: " + propietario.getApellido());
        System.out.println("Correo: " + propietario.getCorreo());
        System.out.println("Telefono: " + propietario.getTelefono());
    }
}
