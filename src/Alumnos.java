import java.util.Scanner;

public class Alumnos {

    private String nombre;

    private String apellido;
    private int nota;

    private int NroExamen;

    public Alumnos() {
    }

    public Alumnos(String nombre,String apellido, int NroExamen,int nota){

        this.nombre = nombre;
        this.nota = nota;
        this.apellido = apellido;
        this.NroExamen = NroExamen;

    }

    public String getNombreApellido() {
        return nombre + " " + apellido;
    }

    public int getNroExamen() {

        return NroExamen;

    }

    public int getNota(){
        return nota;
    }
}
