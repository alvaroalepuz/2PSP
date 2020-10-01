package es.florida;

public class Main {

    public static void main(String[] args) {
        double numero=15;
        double factorial=1;

        while ( numero!=0) {
        factorial=factorial*numero;
            numero--;
        }
        System.out.println(factorial);
    }
}
