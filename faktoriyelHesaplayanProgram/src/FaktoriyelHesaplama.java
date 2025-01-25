import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n, r;
        float sum = 1, sum_n = 1, sum_r = 1;

        // C(n,r) = n! / (r! * (n-r)!)
        System.out.print("n sayisini Giriniz: ");
        n = input.nextInt();
        System.out.print("r sayisini Giriniz: ");
        r = input.nextInt();

        // n! / (n-r)!
        for (i = n; i > (n - r); i--) {
            sum *= i;
        }

        // 1 / r!
        for (i = 1; i <= r; i++) {
            sum_r *= 1.0/i;
        }
        System.out.println(sum * sum_r);

    }
}
