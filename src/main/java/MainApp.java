import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Liczbę do sprawdzenia");
        int liczbaDoSprawdzenia = scanner.nextInt();


        System.out.println("Silnia z " + liczbaDoSprawdzenia + " wynosi " + Silnia.silnia(liczbaDoSprawdzenia));
        System.out.println("Czy ta liczba jest liczbą pierwszą? "+ BadanieLiczbyPierwszej.czyLiczbaJestPierwsza(liczbaDoSprawdzenia));

    }
}
