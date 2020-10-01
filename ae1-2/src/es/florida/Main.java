package es.florida;

import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] nombres = {"Alex", "Jose", "Mark", "Alvaro", "Noelia", "Carla"};

        for (int i = 0; i < nombres.length; ++i) {
            System.out.println(nombres[i]);
        }


        ArrayList<String> nombre = new ArrayList<String>();
        nombre.add("Alex");
        nombre.add("Jose");
        nombre.add("Mark");
        nombre.add("Alvaro");
        nombre.add("Noelia");
        nombre.add("Carla");
        for (int i = 0; i < nombre.size(); ++i) {
            System.out.println(nombre.get(i));
        }
    }
}
