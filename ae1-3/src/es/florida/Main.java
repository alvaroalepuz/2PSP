package es.florida;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduzca el numero");
        Scanner reader = new Scanner(System.in);



        int numero= reader.nextInt();
        System.out.println(App.suma(numero));
    }
}
