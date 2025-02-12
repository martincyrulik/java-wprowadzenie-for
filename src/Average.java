/**
 * Dla dowolnej listy ocen, oblicz ich średnią, np.
 * dla ocen {1, 3, 5, 4, 5}
 * średnia 3.6
 *
 * dla ocen {3, 4 ,4, 4, 4, 3, 3, 5}
 * średnia 3.75
 */

public class Average {
    public static void main(String[] args) {

        int[] oceny1 = {1,3,5,4,5};
        int[] oceny2 = {3,4,4,4,4,3,3,5};

        //liczymy średnią dla tablicy oceny1
        int suma = 0;   //zmienna do przechowania sumy wszystkich ocen
        double average = 0;   //inicjalizacja zmiennej przechowującą wartość średniej
        for (int i = 0; i < oceny1.length; i++){
            suma += oceny1[i];
        }
        average = (double)suma/oceny1.length;
        //wyświetlenie tablicy i średniej dla tablicy oceny1
        System.out.print("Dla listy ocen: ");
        for (int i = 0; i < oceny1.length; i++){
            System.out.print(oceny1[i] + ",");
        }
        System.out.println(" średnia wynosi: " + average);

        //liczymy średnią dla tablicy oceny2
        suma = 0;   //zmienna do przechowania sumy wszystkich ocen
        average = 0;   //inicjalizacja zmiennej przechowującą wartość średniej
        for (int i = 0; i < oceny2.length; i++){
            suma += oceny2[i];
        }
        average = (double) suma/oceny2.length;
        //wyświetlenie tablicy i średniej dla tablicy oceny1
        System.out.print("Dla listy ocen: ");
        for (int i = 0; i < oceny2.length; i++){
            System.out.print(oceny2[i] + ",");
        }
        System.out.println(" średnia wynosi: " + average);
    }
}
