import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x, y, sum = 1;

        System.out.print("Taban Sayiyi Giriniz: ");
        x = input.nextFloat();
        System.out.print("Us Sayisini Giriniz: ");
        y = input.nextFloat();

        for (int i = 1; i <= y; i++) {
            sum *= x;
        }
        System.out.println(sum);
    }
}