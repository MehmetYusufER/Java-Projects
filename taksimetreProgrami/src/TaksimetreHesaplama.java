import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        double gidilenyol, tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen yolu giriniz(km): ");
        gidilenyol = input.nextDouble();

        tutar = 10 + (gidilenyol*2.20);
        tutar = tutar>20 ? tutar : 20.0;

        System.out.println("Tutar: " + tutar);

    }
}