import java.util.Scanner;

public class Silnia {

    /*1. Utwórz nowy branch o nazwie silnia.
            2. Utwórz klasę która liczy silnie z liczby 5 która jest wpisana w klasie
            3. Utwórz klasę która zczytuje dane z konsoli i liczy silnie dla dowolnej liczby
            4. Napisz metodę która policzy silnie stosując rekurencję
            5. Napisz testy do klasy, która liczy silnie
            6. Napisz klasę MainApp która wczyta liczbę z konsoli oraz policzy dla niej silnię oraz
               sprawdzi czy jest to liczba pierwsza
    Uwaga! Po wykonaniu każego kroku należy zakomitować zmiany oraz przebudować projekt aby wysyłać działającego jara.*/

    public static void main(String[] args) {

        System.out.println(silnia(5));

        Scanner scanner = new Scanner(System.in);


    }



    private static int silnia(int i)
    {
        if (i < 1)
            return 1;
        else
            return i * silnia(i - 1);
    }
    
    private static int silniaZeScannera(int i)
    {if (i < 1)
        return 1;
    else
        return i * silnia(i - 1);

    }

}
