/**
 * Dla podanego słowa odwróć go. Korzystaj z typu char.
 * np.
 * Jurek -> keruJ
 * mama -> mama
 * tunel -> lenut
 */

public class OdwrocSlowo {
    public static void main(String[] args) {

        char[] word = {'J','u','r','e','k'};
        //char[] word = {'t','u','n','e','l'};
        //char[] word = {'m','a','m','a'};
        //char[] word = {'J','u','r','e','k','M','C','G'};

        //wyświetlenie słowa przed owróceniem
        System.out.print("Słowo przed odwróceniem: ");
        for (int i = 0; i < word.length; i++){
            System.out.print(word[i]);
        }
        System.out.println();

        //odwrócenie dokonamy poprzez zamianę miejscami liter w danym słowie
        //na przykładzie słowa Jurek:
        //zamiana word[i] <-> word[dł.tablicy-1-i]: word[0] <-> word[4], i = 0, pierwszy obieg pętli
        //zamiana word[i] <-> word[dł.tablicy-1-i]: word[1] <-> word[3], i = 1, drugi obieg pętli
        //Ilość obiegów pętli wyliczamy ze wzoru:
        //- dla parzystej ilości znaków: dł.tablicy - (dł.tablicy/2), chodzi o dzielenie całkowite
        //- dla nieparzystej: dł.tablicy - (dł.tablicy/2 + 1)
        //w powyższym przykładzie: ilość obiegów pętli: 5 - (5/2 + 1) = 5 -3 = 2

        //obliczamy ilość obiegów pętli w konkretnym przypadku
        int iloscObiegowPetli = 0;  //inicjalizacja
        if (word.length %2 == 0){
            iloscObiegowPetli = word.length - (word.length / 2);
        } else {
            iloscObiegowPetli = word.length - ((word.length)/2 + 1);
        }

        //a teraz dokonujemy zamiany
        int j = word.length;    // j=5
        for (int i = 0; i < iloscObiegowPetli; i++){
            char temp = word[i];
            word[i] = word[j - 1 - i];
            word[j - 1 - i] = temp;
        }

        //wyświetlenie słowa po odwróceniu
        System.out.print("Słowo po odwróceniu: ");
        for (int i = 0; i < word.length; i++){
            System.out.print(word[i]);
        }
        System.out.println();
    }
}
