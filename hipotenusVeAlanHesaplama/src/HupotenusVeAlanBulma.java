import java.util.Scanner;

public class HupotenusVeAlanBulma {
    public static void main(String[] args) {
        double x, y, u, z, area;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of triangles first side: ");
        x = input.nextFloat();
        System.out.print("Enter the lenght of triangles second side: ");
        y = input.nextFloat();

        z = Math.sqrt((x * x) + (y * y));
        u = (x + y + z) / 2.0;
        area = Math.sqrt(u*(u-x)*(u-y)*(u-z));

        System.out.println("Hypothenus: " + z);
        System.out.println("Perimeter of triangle: " + u*2.0);
        System.out.println("Area of triangle: " + area);
    }
}