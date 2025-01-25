import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double n1, n2, abschluss;
        int aktion;
        Scanner input = new Scanner(System.in);

        System.out.print("###Rechner###\nGeben Sie die erste Zahl ein: ");
        n1 = input.nextDouble();
        System.out.print("Geben Sie die zweite Zahl ein: ");
        n2 = input.nextDouble();

        System.out.println("1.Addition\n2.Subtraktion\n3.Multiplikation\n4.Division");
        System.out.print("\nBitte geben Sie die gewünschte Aktion ein: ");
        aktion = input.nextInt();

        switch (aktion) {
            case 1:
                abschluss = n1 + n2;
                System.out.println("Abschluss: " + abschluss);
                break;
            case 2:
                abschluss = n1 - n2;
                System.out.println("Abschluss: " + abschluss);
                break;
            case 3:
                abschluss = n1 * n2;
                System.out.println("Abschluss: " + abschluss);
                break;
            case 4:
                if(n1 != 0 && n2 != 0){
                    abschluss = n1 / n2;
                    System.out.println("Abschluss: "+ abschluss);
                }
                else {
                    System.out.println("Zahl kann nicht durh Null geteilt werden!");
                }
                break;
            default:
                System.out.println("Falsch Zahl!");
        }
    }
}
