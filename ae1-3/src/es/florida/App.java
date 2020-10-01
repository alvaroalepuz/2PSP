package es.florida;

public class App {
    public static int suma (int num){
int numero = num;
int sumador=0;

        for (int i = 0; i < num; ++i) {
            if (i % 2 == 0)
                sumador+=i ;
        }
return  sumador;

    }
}
