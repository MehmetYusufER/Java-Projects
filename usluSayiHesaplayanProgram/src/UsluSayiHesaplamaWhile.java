import java.util.Scanner;

public class UsluSayiHesaplamaWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float x, y, sum = 1;
        int i = 1;

        System.out.print("Taban Sayiyi Giriniz: ");
        x = scan.nextFloat();
        System.out.print("Us Sayisini Giriniz: ");
        y = scan.nextFloat();

        while (i <= y) {
            sum *= x;
            i++;
        }
        System.out.println(sum);
    }
}
