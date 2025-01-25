import java.util.Scanner;

public class manavKasaProgramiHesaplama {
    public static void main(String[] args) {
        // gram fiyatlari ile hesaplama yapilmistir
        double birneg = 0.00214, apfelg = 0.00367, tomateng = 0.00111, bananeng = 0.00095, aubergineg = 0.005;
        // fiyatlari tutan degiskenler
        double birne_gesamt, apfel_gesamt, tomaten_gesamt, bananen_gesamt, aubergine_gesamt, gesamt_preis;
        double x;
        Scanner input = new Scanner(System.in);

        System.out.print("Wie viele Kilo Birne: ");
        x = input.nextDouble();
        birne_gesamt = (x*1000) * birneg;

        System.out.print("Wie viele Kilo Apfel: ");
        x = input.nextDouble();
        apfel_gesamt = (x*1000) * apfelg;

        System.out.print("Wie viele Kilo Tomaten: ");
        x = input.nextDouble();
        tomaten_gesamt = (x*1000) * tomateng;

        System.out.print("Wie viele Kilo Bananen: ");
        x = input.nextDouble();
        bananen_gesamt = (x*1000) * bananeng;

        System.out.print("Wie viele Kilo Aubergine: ");
        x = input.nextDouble();
        aubergine_gesamt = (x*1000) * aubergineg;

        gesamt_preis = birne_gesamt + apfel_gesamt + tomaten_gesamt + bananen_gesamt + aubergine_gesamt;
        System.out.print("Gesamt Preis: " + gesamt_preis);
    }
}
