package ciclosycondiciones;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Ciclosycondiciones {

    /*  
    &&  Y
    ||  o
    !   NOT = NEGACION
    =   Asignar
    ==  Comparacion
    %   residuo
    +  suma
    - resta
    / division
    * multiplicacion
    >  mayor que
    >= mayor o igual que
    <  menor que
    <= menor o igual que
     */
    public static void main(String[] args) {
        menu();

    }

    public static void ciclowhile() {

        int x = 0;
        while (x <= 20) {
            if ((x > 5) && (x < 10)) {

                System.out.println("valor " + x);

            }

            x = x + 1;
        }

    }

    public static void ciclodowhile() {

        Scanner leer = new Scanner(System.in);

        byte opcion = 0;

        do {
            System.out.println("1sumar");
            System.out.println("2-Restar");
            System.out.println("3-Salis");
            System.out.println("Digite una opcion");
        } while (opcion != 3);

    }

    public static void condicionswitch() {
        Scanner leer = new Scanner(System.in);
        byte dia = 0;
        System.out.println("Digite el dia");
        dia = leer.nextByte();

        switch (dia) {

            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Dia invalido");
        }
    }

    public static void menu() {
        Scanner leer = new Scanner(System.in);

        byte opcion = 0;

        do {
            System.out.println("1-sumar");
            System.out.println("2-Restar");
            System.out.println("3-multiplicar");
            System.out.println("4-dividir");
            System.out.println("5-Salir");
            System.out.println("Digite una opcion");
            opcion = leer.nextByte();
            switch (opcion) {

                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    mutiplicacion();
                    break;
                case 4:
                    dividir();
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion != 5);

    }

    public static void sumar() {
        float total, num1 = 0, num2 = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("digite un numero");
        num1 = leer.nextFloat();
        System.out.println("digite otro numero");
        num2 = leer.nextFloat();
        total = num1 + num2;
        System.out.println(" El total de la suma es: " + total);
    }

    public static void restar() {
        float total, num1 = 0, num2 = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("digite un numero");
        num1 = leer.nextFloat();
        System.out.println("digite otro numero");
        num2 = leer.nextFloat();
        total = num1 - num2;
        System.out.println(" El total de la esta es resta: " + total);
    }

    public static void conficionif() {
        int num1, num2, num3;

        num1 = 6;
        num2 = 7;
        num3 = 9;

        //condicion IF ELSE ELSE IF
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println(num1 + " es mayor ");

        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println(num2 + " es mayor ");

        } else if ((num3 > num1) && (num3 > num2)) {
            System.out.println(num3 + " es mayor");

        } else if ((num1 == num2) && (num2 == num3)) {
            System.out.println(" Los tres numeros son iguales ");

        }

    }

    public static void mutiplicacion() {
        float total, num1 = 0, num2 = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("digite un numero");
        num1 = leer.nextFloat();
        System.out.println("digite otro numero");
        num2 = leer.nextFloat();
        total = num1 * num2;
        System.out.println("El total de la multiplicacion es: " + total);

    }

    public static void dividir() {
        float total, num1 = 0, num2 = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("digite un numero");
        num1 = leer.nextFloat();
        System.out.println("digite otro numero");
        num2 = leer.nextFloat();
        total = num1 / num2;
        System.out.println("El total de la division es: " + total);

    }

}
