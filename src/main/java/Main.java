import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        BadanieLiczbyPierwszej liczbaDoSprawdzenia = new BadanieLiczbyPierwszej();
        liczbaDoSprawdzenia.czyLiczbaJestPierwsza(scanner.nextInt());
        System.out.println(liczbaDoSprawdzenia);


    }
}
