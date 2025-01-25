import java.util.Scanner;

public class GelismisHesapMakinesiIslemler {

    static void addition(double a, double b) {
        System.out.println("Ergebnis: " + (a + b));
    }

    static void subtraktion(double a, double b) {
        System.out.println("Ergebnis: " + (a - b));
    }

    static void division(double a, double b) {
        System.out.println("Ergebnis: " + (a / b));
    }

    static void multiplikation(double a, double b) {
        System.out.println("Ergebnis: " + (a * b));
    }
    static void uslusayialma(double a, double b) {
        int i;
        double result = 1;
        for (i = 1; i <= b; i++){
            result *= a;
        }
        System.out.println("Ergebis: " + result);
    }
    static void modalma(double a, double b) {
        System.out.println("Ergebis: " + (a % b));
    }
    static void rechteks(double a, double b) {
        double flache = a * b;
        double umfang = 2 * (a + b);
        System.out.println("die Fläche des Rechteks: " + flache + "\nder Umfang des Rechteks: " + umfang);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eingabe;
        double zahl1, zahl2;

        String menu = "1 - Addition \n" +
                "2 - Subtraktion\n" +
                "3 - Multiplikation\n" +
                "4 - Division\n" +
                "5 - Üslü Sayı Hesaplama\n" +
                "6 - Mod alma\n" +
                "7 - Berechnung der Fläche und des Umfangs eines Rechtecks\n" +
                "0 - Schließen";

        System.out.println(menu);

        do {
            System.out.println("Bitte wahlen Sie eine matematische Operation: ");
            eingabe = input.nextInt();

            switch (eingabe) {
                case 1:
                    System.out.println("Bitte geben Sie erste Zahl ein: ");
                    zahl1 = input.nextDouble();
                    System.out.println("Bitte geben Sie zweite Zahl ein: ");
                    zahl2 = input.nextDouble();
                    addition(zahl1, zahl2);
                    break;
                case 2:
                    System.out.println("Bitte geben Sie erste Zahl ein: ");
                    zahl1 = input.nextDouble();
                    System.out.println("Bitte geben Sie zweite Zahl ein: ");
                    zahl2 = input.nextDouble();
                    subtraktion(zahl1, zahl2);
                    break;
                case 3:
                    System.out.print("Bitte geben Sie erste Zahl ein: ");
                    zahl1 = input.nextDouble();
                    System.out.print("Bitte geben Sie zweite Zahl ein: ");
                    zahl2 = input.nextDouble();
                    multiplikation(zahl1 , zahl2);
                    break;
                case 4:
                    do {
                        System.out.print("Bitte geben Sie erste Zahl ein: ");
                        zahl1 = input.nextDouble();
                        System.out.print("Bitte geben Sie zweite Zahl ein: ");
                        zahl2 = input.nextDouble();
                        if (zahl2 == 0) {
                            System.out.println("Die zweite Zahl kann nicht null sein!\nBitte geben Sie wieder ein");
                        }
                    } while (zahl2 == 0);
                    division(zahl1, zahl2);
                    break;
                case 5:
                    System.out.print("Bitte geben Sie erste Zahl ein: ");
                    zahl1 = input.nextDouble();
                    System.out.print("Bitte geben Sie zweite Zahl ein: ");
                    zahl2 = input.nextDouble();
                    uslusayialma(zahl1, zahl2);
                    break;
                case 6:
                    System.out.print("Bitte geben Sie erste Zahl ein: ");
                    zahl1 = input.nextDouble();
                    System.out.print("Bitte geben Sie zweite Zahl ein: ");
                    zahl2 = input.nextDouble();
                    modalma(zahl1, zahl2);
                    break;
                case 7:
                    System.out.print("Bitte geben Sie erste Zahl ein: ");
                    zahl1 = input.nextDouble();
                    System.out.print("Bitte geben Sie zweite Zahl ein: ");
                    zahl2 = input.nextDouble();
                    rechteks(zahl1, zahl2);
                    break;
            }
        } while (eingabe != 0);

    }
}