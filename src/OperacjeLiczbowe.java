/**
 * Dla dowolnych liczb podaj ich:
 * sumę,
 * iloczyn,
 * znajdź najmniejszą,
 * znajdź największą,
 * posortuj malejąco,
 * oblicz medianę
 * Mediana to środkowa liczba w posortowanym rosnąco zbiorze liczb
 * - w przypadku nieparzystej ilości liczb
 * - w przypadku parzystej liczb  mediana jest równa
 * średniej arytmetycznej dwóch środkowych wartości.
 * 7,8,3,4,9,2,11
 * 5,8,-1,6,6,1,10
 * 2,3,4,7,8,9
 */

public class OperacjeLiczbowe {
    public static void main(String[] args) {

        int[] zbiórLiczb1 = {2,3,4,7,8,9};
        int[] zbiórLiczb2 = {5,8,-1,6,6,1,10};
        int[] zbiórLiczb3 = {7,8,3,4,9,2,11};

        //wyświetlenie zbioru liczb
        System.out.print("Dla zbioru liczb: ");
        for (int i = 0; i < zbiórLiczb1.length; i++){
            System.out.print(zbiórLiczb1[i] + ",");
        }

        //policzmy sumę zbioru liczb i iloczyn zbioru liczb
        int suma = 0;   //inicjalizacja zmiennej suma - sumy elementów zbioru
        int iloczyn = 1;    //inicjalizacja zmiennej iloczyn - iloczynu elementów zbioru
        for (int i = 0; i < zbiórLiczb1.length; i++ ){
            suma += zbiórLiczb1[i];
            iloczyn *= zbiórLiczb1[i];
        }
        System.out.println("Suma wynosi: " + suma);
        System.out.println("Iloczyn wynosi: " + iloczyn);

        //szukamy teraz najmniejszej i największej liczby z zbiorze
        int najmniejszaLiczba = zbiórLiczb1[0];
        int najwiekszaLiczba = zbiórLiczb1[0];
        for (int i = 0; i < zbiórLiczb1.length - 1; i++){
            if (zbiórLiczb1[i+1] < najmniejszaLiczba){
                najmniejszaLiczba = zbiórLiczb1[i+1];
            }
            if (zbiórLiczb1[i+1] > najwiekszaLiczba){
                najwiekszaLiczba = zbiórLiczb1[i+1];
            }
        }
        System.out.println("Najmniejsza liczba to: " + najmniejszaLiczba);
        System.out.println("Największa liczba to: " + najwiekszaLiczba);

        //sortujemy malejąco
        for (int j = 0; j < zbiórLiczb1.length - 1; j++){
            for (int i = 0; i < zbiórLiczb1.length - 1; i++) {
                if (zbiórLiczb1[i + 1] > zbiórLiczb1[i]) {
                    int temp = zbiórLiczb1[i];      //jeśli następny element jest większy
                    zbiórLiczb1[i] = zbiórLiczb1[i + 1];  //od poprzedniego elementu
                    zbiórLiczb1[i + 1] = temp;            //to robimy zamianę miejscami
                }
            }
        }


        //wyświetlenie zbioru liczb posortowanego malejąco
        System.out.print("Zbiór posortowany malejąco: ");
        for (int i = 0; i < zbiórLiczb1.length; i++){
            System.out.print(zbiórLiczb1[i] + ",");
        }
        System.out.println();

        //Mediana to środkowa liczba w posortowanym rosnąco zbiorze liczb
        //więc najpierw posortujemy zbiór rosnąco

        //sortowanie liczb rosnąco
        for (int j = 0; j < zbiórLiczb1.length - 1; j++){
            for (int i = 0; i < zbiórLiczb1.length - 1; i++) {
                if (zbiórLiczb1[i + 1] < zbiórLiczb1[i]) {
                    int temp = zbiórLiczb1[i];      //jeśli następny element jest mniejszy
                    zbiórLiczb1[i] = zbiórLiczb1[i + 1];  //od poprzedniego elementu
                    zbiórLiczb1[i + 1] = temp;            //to robimy zamianę miejscami
                }
            }
        }

        System.out.print("Zbiór posortowany rosnąco: ");
        for (int i = 0; i < zbiórLiczb1.length; i++) {
            System.out.print(zbiórLiczb1[i] + ",");

        }
        System.out.println();

        //policzenie mediany
        System.out.print("Dla podanego zbioru liczb mediana wynosi: ");
        if ((zbiórLiczb1.length % 2) != 0){     //przypadek pierwszy gdy liczba elementów zbioru
            int elementSrodkowy = zbiórLiczb1.length / 2;   //jest nieparzysta, wtedy mediana jest
            int mediana = zbiórLiczb1[elementSrodkowy]; //środkowym elementem tego zbioru
            System.out.print(mediana);
        } else {
            //musimy znaleźć dwa elementy środkowe i obliczyć ich średnią arytmetyczną
            //indeks elementu pierwszego to wynik dzielenia długości zbioru/2,
            //a indeks elementu drugiego to indeks zmniejszony o jeden: (długość zbioru/2)-1
            int indexPierwszegoElementu = zbiórLiczb1.length / 2;
            int indexDrugiegoElementu = (zbiórLiczb1.length / 2) - 1;
            suma = zbiórLiczb1[indexPierwszegoElementu] + zbiórLiczb1[indexDrugiegoElementu];
            double mediana = (double) suma / 2;
            System.out.print(mediana);
        }
    }
}
