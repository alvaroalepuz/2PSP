package es.florida;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int edad = 0;
        String nombre="";
        System.out.println("Introduce el nombre del empleado: ");
        nombre = reader.next();

        System.out.println("Introduce el numero de años: ");
        edad = reader.nextInt();

        if (edad < 1) {
            System.out.println("Desarrollador Junior L1 – 15000-18000");

        } else if (edad >= 1 && edad <= 2) {
            System.out.println("Desarrollador Junior L2 – 18000-22000");
        } else if (edad >= 3 && edad <= 5) {
            System.out.println("Desarrollador Senior L1 – 22000-28000");
        }else
            if (edad >= 5 && edad <= 8) {
                System.out.println("Desarrollador Senior L2 – 28000-36000");
            }else
            if (edad >8) {
                System.out.println("Analista / Arquitecto. Salario a convenir en base a rol");
            }


    }
}