package co.com.vehiculos.modelo.matricula;

public class Matricula {

    private int matricula = 2345;
    private String ciudad = "Cartagena";


    public Matricula(){

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
