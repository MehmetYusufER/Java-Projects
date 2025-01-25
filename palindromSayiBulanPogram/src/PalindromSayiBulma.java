import java.util.Scanner;

public class PalindromSayiBulma {

    static boolean pal(int x){
        int temp = x, reverseX = 0, lastX;
        while (temp != 0) {
            lastX = temp % 10;
            reverseX = (reverseX * 10) + lastX;
            temp /= 10;
        }
        if (reverseX == x){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("n sayisini giriniz: ");
        n = input.nextInt();

        if (pal(n)) {
            System.out.println("Palindrom Sayi");
        } else {
            System.out.println("Palindrom Degil");
        }
    }
}
