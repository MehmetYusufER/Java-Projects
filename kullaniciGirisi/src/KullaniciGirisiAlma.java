import java.util.Scanner;

public class KullaniciGirisiAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, newPass, newUserName;
        String constantUserName = "patika", constantPass = "java123";

        System.out.println("Bitte geben Sie ihre Informationen ein");

        System.out.print("User Name: ");
        userName = input.nextLine();

        System.out.print("Password: ");
        password = input.nextLine();

        if (userName.equals(constantUserName) && password.equals(constantPass)) {
            System.out.println("Erfolgreich!");
        } else {
            System.out.println("Falsche Eingabe! Möchten Sie ihre Kennwort ändern\n1-Ja\n2-Nein");
            int aktion = input.nextInt();
            switch (aktion) {
                case 1:
                    System.out.println("Geben Sie ihr neues Kennwort ein: ");
                    newPass = input.next();
                    if((newPass.equals(password))){
                        password = newPass;
                        System.out.println("Erfolgreich");
                    }else{
                        System.out.println("Ihr neues Kennwort kann nicht mit dem alten identisch sein!");
                    }
                    break;
                case 2:
                    System.out.println("Bitte versuchen Sie es noch einmal später!");
                    break;
                default:
                    System.out.println("Falsche Eingabe!");
                    break;
            }
        }
    }
}

