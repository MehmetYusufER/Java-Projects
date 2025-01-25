import java.util.Scanner;

public class CiftSayilariBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, count = 0;
        float sum = 0;


        System.out.print("Sayi gir: ");
        sayi = input.nextInt();

        for(int i = 1; i <= sayi; i++){
            if(i % 3 == 0 && i % 4 == 0){
                sum += i;
                count++;
            }
        }
        sum = sum / count;
        System.out.println("Ortalama" + sum);

    }
}
