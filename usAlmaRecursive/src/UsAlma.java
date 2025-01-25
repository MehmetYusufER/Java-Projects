import java.util.Scanner;

public class UsAlma {

    /*
    static int f(int base, int exp) {

        int temp = base;
        temp *= base;
        exp--;
        System.out.println("base: " + base + " temp: " + temp + " exp: " + exp);
        if (exp == 1) {
            return temp;
        }
        return f(temp, exp);
    }
    */

    static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * pow(a, --b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, exp;

        System.out.println("Taban giriniz: ");
        base = input.nextInt();
        System.out.println("Us giriniz: ");
        exp = input.nextInt();

        System.out.println("sonuc: " + pow(base, exp));
    }
}