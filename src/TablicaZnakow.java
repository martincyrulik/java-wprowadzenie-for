/**
 * Dla dowolnej tablicy znaków policz, ile występuje tam liter 'a' lub 'A'
 */

public class TablicaZnakow {
    public static void main(String[] args) {

        char[] tablica = {'a','v','c','A','g','h','j','g','a','x','A'};

        int licznik = 0;    //inicjalizacja zmiennej przechowującej ilość występowania 'a' lub 'A'

        //liczymy występowanie znaku 'a' lub 'A' w podanej tablicy
        for (int i = 0; i < tablica.length; i++){
            if (tablica[i] == 'a' || tablica[i] == 'A'){
                licznik += 1;
            }
        }

        //wyświetlenie tablicy i wyniku
        System.out.println("W tablicy: ");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i]+",");
        }
        System.out.print(" znak "+ "'a' lub 'A' występuje " + licznik + " razy");
    }
}
