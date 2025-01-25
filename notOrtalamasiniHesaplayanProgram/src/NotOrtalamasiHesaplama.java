import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int math, phys, chem, turk, hist, music;
        String str;

        System.out.print("Matematik notunu giriniz: ");
        math = input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        phys= input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        chem = input.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turk = input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        hist = input.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        music = input.nextInt();

        float sum = (math + phys + chem + turk + hist + music) / 6f;

        System.out.println("Ortalama Not " + sum);

        str = sum > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print(str);

    }
}
