/**
 * Wyświetl liczby od 91 do -7 korzystając z pętli for
 */

public class DisplayNumbers {
    public static void main(String[] args) {

        System.out.println("---------------Zadanie 1------------------------");
//        zadanie 1 od 91 do -7
//        System.out.println(91);
//        System.out.println(90);
//        System.out.println(89);

        for (int i = 91; i >= -7; i--) {
            System.out.println(i);
        }

        System.out.println("---------------Zadanie 2------------------------");

        //zadanie 2
        //Wyświetl liczby od 62349 do 62392 podzielne przez 2
        for (int i = 62349; i <= 62392; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        //Wyświetl od a do z
        System.out.println("---------------Zadanie 3------------------------");
        char a = 'a';
        char z = 'z';
//        System.out.println((int)a);
//        System.out.println((int)z);
        for (int i = 'a'; i <= 'z'; i++){
            System.out.println((char)i);
        }
    }
}