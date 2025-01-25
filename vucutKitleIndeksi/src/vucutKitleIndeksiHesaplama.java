import java.util.Scanner;

public class vucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        int weight;
        double len, index;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight(kg): ");
        weight = input.nextInt();
        System.out.print("Enter your lenght(m): ");
        len = input.nextDouble();

        index = weight / (len*len);
        System.out.println("Your Bodz Kite Index: " + index);
    }
}
