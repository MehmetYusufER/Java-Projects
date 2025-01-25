import java.util.Scanner;

public class DaireninAlaniniveCevresiniHesaplama {
    public static void main(String[] args) {
        double r, a, area, permtr, pieceArea;
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap Giriniz: ");
        r = input.nextDouble();
        System.out.print("Merkez açısı giriniz: ");
        a = input.nextDouble();

        area = 3.14 * (r * r);
        permtr = 2 * 3.14 * r;
        pieceArea = (3.14 * (r*r) * a) / 360;

        System.out.println("Ucgenin Alani: " + area + "\n" +"Ucgenin Cevresi: " + permtr + "\n" + "Daire diliminin alani: " + pieceArea);
    }
}
