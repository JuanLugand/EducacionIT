import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese dia");
        int dd = scanner.nextInt();

        System.out.println("Ingrese el mes");
        int mm = scanner.nextInt();

        System.out.println("Ingrese el año");
        int yyyy = scanner.nextInt();

        if((dd>=1 && dd <= 31) && (mm>=1 && mm<=12) && (yyyy>=1900 && yyyy<=2099)) {

            if(((yyyy % 4 == 0 && yyyy % 100 != 0) || (yyyy % 400 == 0)) && (mm==2) && (dd!=29)) {
                System.out.println("El mes 02 tiene ingresado incorrecta cantidad de días, dado que el año es bisiesto y llevar 29 días.");
            } else {

                if((mm==1 || mm==3 || mm==7 || mm==8 || mm==10 || mm==12) && dd!=31) {
                    System.out.println("La fecha ingresada es incorrecta, la cantidad de días no coinciden para el mes.");
                } else if((mm==4||mm==6||mm==9||mm==11) && dd!=30) {
                    System.out.println("La fecha ingresada es incorrecta, la cantidad de días no coinciden para el mes.");
                } else {
                    System.out.println("La fecha ingresada " + dd + "/" + mm + "/" + yyyy + " ES CORRECTA");
                }

            }

        } else {
            System.out.println("La fecha ingresada es incorrecta");
        }

    }
}