import java.util.Scanner;

public class GirilenSayiyaKadarIkininKatlariniBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i, j, counter = 0;

        System.out.print("Sayi Giriniz: ");
        n = scan.nextInt();

        for (i = 1, j = 1; i <= n; i *= 4, j *= 5){
            System.out.println("4'ün " + counter + ". kuvveti: " + i);
            System.out.println("5'in " + counter + ". kuvveti: " + j);
            counter++;
        }
    }
}