import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos");
        int cantAlumnos = entrada.nextInt();
        Alumnos[] alumnos = new Alumnos[cantAlumnos];

        for (int i=0;i<cantAlumnos;i++) {
            System.out.println("Ingrese nombre");
            String nombre = entrada.next();

            System.out.println("Ingrese apellido");
            String apellido = entrada.next();

            System.out.println("Ingrese nro de examen");
            int NroExamen = entrada.nextInt();

            System.out.println("Ingrese nota del examen");
            int nota = entrada.nextInt();

            while (nota < 0 || nota > 10) {
                System.out.println("La nota debe ser un numero entero");
                System.out.println("Ingrese nota");
                nota = entrada.nextInt();
            }

            alumnos[i] = new Alumnos(nombre,apellido,NroExamen,nota);
        }

        Alumnos notaMayor = alumnos[0];
        Alumnos notaMenor = alumnos[0];

        for (int i=0; i<alumnos.length;i++){

            if (alumnos[i].getNota() > notaMayor.getNota()) {
                notaMayor = alumnos[i];
            }
           if (alumnos[i].getNota() < notaMenor.getNota()) {
               notaMenor = alumnos[i];
           }
        }

        System.out.println("El alumno con la nota mas alta fue " + notaMayor.getNombreApellido() + " con una nota de: " + notaMayor.getNota());
        System.out.println("El alumno con la nota mas baja fue " + notaMenor.getNombreApellido() + " con una nota de: " + notaMenor.getNota());

        System.out.println("Alumnos que promocionan: ");
        for (Alumnos alumno: alumnos) {

            if (alumno.getNota()>=7) {
                System.out.println(alumno.getNombreApellido() + " " + alumno.getNota());
            }
        }

        System.out.println("Alumnos que tiene que recuperar: ");
        for (Alumnos alumno: alumnos) {
            if (alumno.getNota()<7) {
                System.out.println(alumno.getNombreApellido() + " " + alumno.getNota());
            }
        }


    }
}
