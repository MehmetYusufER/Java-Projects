import java.util.Scanner;

public class DoWhileKullaniciGirisiAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, newPass, trashCan;
        String constantUserName = "patika", constantPass = "java123";
        boolean acces = false;
        int count = 1;

        do{
            System.out.println("Bitte geben Sie ihre Informationen ein");

            System.out.print("User Name: ");
            userName = input.nextLine();

            System.out.print("Password: ");
            password = input.nextLine();

            if((userName.equals(constantUserName) && password.equals(constantPass))){
                System.out.println("Erfolgreich!");
                acces = true;
            } else{
                System.out.println("Bitte versuchen Sie es noch einmal!");
                count++;
                if(count > 3){
                    System.out.println(" Möchten Sie ihre Kennwort ändern\n1-Ja\n2-Nein");
                    int aktion = input.nextInt();
                    switch (aktion){
                        case 1:
                            System.out.println("Geben Sie ihr neues Kennwort ein: ");
                            newPass = input.next();
                            if (!(newPass.equals(password))) {
                                constantPass = newPass;
                                System.out.println("Erfolgreich");
                                count = 0;
                                trashCan = input.nextLine(); // holds the new line character came from "next.Int"
                            } else {
                                System.out.println("Ihr neues Kennwort kann nicht mit dem alten identisch sein!");
                            }
                            break;
                        case 2:
                            System.out.println("Bitte versucen Sie es später!");
                            acces = true;
                            break;
                    }
                }
            }
        } while (!acces);

    }
}

