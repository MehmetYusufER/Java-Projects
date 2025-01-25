import java.util.Scanner;

public class FibancciHesaplama {
    static int f(int x) {
        int result;
        System.out.println("x: " + x);
        if (x == 1 || x == 2) {
            System.out.println("if icerisinde x: " + x);
            return 1;
        }
        result = f(x - 1) + f(x - 2);
        System.out.println("res: " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;

        System.out.println("x sayisi gir: ");
        x = input.nextInt();
        System.out.println(f(x));

    }
}