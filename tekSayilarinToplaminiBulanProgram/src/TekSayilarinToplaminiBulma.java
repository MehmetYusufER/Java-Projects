import java.util.Scanner;

public class TekSayilarinToplaminiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;

        do {
            System.out.print("Bitte geben Sie ein Zahl ein: ");
            n = input.nextInt();
            if (n % 2 == 0 && n % 4 == 0) {
                sum += n;
            }
        } while (n % 2 != 1);
        System.out.println("Abschluss: " + sum);
    }
}