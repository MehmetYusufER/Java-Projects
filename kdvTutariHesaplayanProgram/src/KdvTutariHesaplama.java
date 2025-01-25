import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        float fiyat, kdvli, tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("KDV'si Hesaplanacak Tutarı Giriniz: ");
        fiyat = input.nextFloat();

        kdvli = fiyat > 1000 ? fiyat + (fiyat * (8f/100f)) : fiyat + (fiyat * (18f/100f));
        tutar = kdvli - fiyat;
        System.out.print("KDV'siz fiyat = " + fiyat + "\n" + "KDV'li Fiyat = " + kdvli + "\n" + "KDV Tutarı = " + tutar);
    }
}