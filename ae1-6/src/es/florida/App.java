package es.florida;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void numeros(ArrayList<Integer> numer){

        Scanner reader = new Scanner(System.in);
        ArrayList<Integer>numbers = new ArrayList<Integer>();
        int nume = 0;
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el numero: ");
            nume = reader.nextInt();
            numbers.add(nume);
            suma+=nume;
        }
        System.out.println(suma);
    }
}
