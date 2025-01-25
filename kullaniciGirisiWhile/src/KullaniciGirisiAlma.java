import java.util.Scanner;

public class KullaniciGirisiAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, newPass;
        String constantUserName = "patika", constantPass = "java123";
        int count = 4; //temp =1
        boolean inp = true, inp1 = true, inp2 = true;

        while (inp) {
            //temp
            System.out.println(constantUserName + constantPass);

            System.out.println("Bitte geben Sie ihre Informationen ein");

            System.out.print("User Name: ");
            userName = input.nextLine();

            System.out.print("Password: ");
            password = input.nextLine();

            if (!(userName.equals(constantUserName) && password.equals(constantPass))) {
                if (count <= 3) {
                    System.out.println("Falsche Eingabe! Bitte versuchen Sie es noch mal.");
                    count++;
                } else {
                    inp1 = true;
                    inp2 = true;
                    System.out.println(" Möchten Sie ihre Kennwort ändern\n1-Ja\n2-Nein");
                    while (inp1){
                        int aktion = input.nextInt();
                        switch (aktion) {
                            case 1:
                                while (inp2) {
                                    System.out.println("Geben Sie ihr neues Kennwort ein: ");
                                    newPass = input.next();
                                    if (!(newPass.equals(password))) {
                                        password = newPass;
                                        System.out.println("Erfolgreich");
                                        inp2 = false;
                                        inp1 = false;
                                    } else {
                                        System.out.println("Ihr neues Kennwort kann nicht mit dem alten identisch sein!");
                                    }
                                }
                                //temp
                                System.out.println("flag");
                                break;
                            case 2:
                                System.out.println("Bitte versuchen Sie es noch einmal später!");
                                inp = false;
                                inp1 = false;
                                break;
                            default:
                                System.out.println("Falsche Eingabe!");
                                break;
                        }
                    }
                }
            } else {
                System.out.println("Erfolgreich!");
                inp = false;
            }
        }
    }
}
