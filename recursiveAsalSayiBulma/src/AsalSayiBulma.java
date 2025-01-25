import java.util.Scanner;

public class AsalSayiBulma {

    static int isasal(int num, int temp) {
        int result = (num % temp);

        if (result == 0 && temp != 1) {
            return 1; // Asal degil
        }
        if (temp == 1){
            return 0; // Asal
        }
        return isasal(num,temp - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, temp, result;

        System.out.print("Sayı Giriniz: ");
        num = input.nextInt();
        temp = num - 1;

        result = isasal(num, temp);

        if (result == 1) System.out.println(num + " Sayısı ASAL değildir!");
        else System.out.println(num + " Sayısı ASALDIR!");
    }
}