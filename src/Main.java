import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //int intMax = 2147483647;

        System.out.println("-- TEST AFSNIT--");
        Customer cus = new Customer("0205912533");

        System.out.println(cus.getId() + " " + cus.getRole());

        System.out.println();

//Test af ArrayList<User> users

        //Oprettelse af bank objekt og dermed ArrayList's
        Bank bankTest = new Bank();

        Admin adm1Test = new Admin("1234");
        Admin adm2Test = new Admin("4321");

        adm1Test.displayUsers();
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("\n-- BANK -- \n");

        //Account a = new Account("0205912533", 4442533, 15000.0);
        //Account a2 = new Account("0205912533", 5552533, 2000.0);

        Bank bank = new Bank();
        Admin adm1 = new Admin("0205912533");

        int userChoiceInt;
        double userChoiceDouble;
        String userChoiceString;


        do {
            System.out.println("Log ind som:\n1) Administrator\t2) Medarbejder\t\t3) Kunde\t\t4) Afslut\n");

            Scanner in = new Scanner(System.in);
            userChoiceInt = in.nextInt();

            switch (userChoiceInt) {
                case 1: //Bank/Administrator/
                    do{
                        System.out.println("1) Se oversigt over brugere\t\t2) Se oversigt over kontoer\t\t3) Log ud\n");
                        userChoiceInt = in.nextInt();
                        switch (userChoiceInt){
                            case 1: //Bank/Administrator/OversigtBruger/
                                System.out.println("Oversigt over brugere (id): ");

                                do{System.out.println("1) Tilbage");
                                    userChoiceInt = in.nextInt();
                                    if (userChoiceInt != 1){
                                        System.out.println("Fejl: Forkert input!");
                                    }
                                } while(userChoiceInt != 1);
                                break;
                            case 2: //Bank/Administrator/OversigtKonto/
                                System.out.println("Oversigt over kontoer (konto nr. og balance): ");

                                do {
                                    System.out.println("1) Tilbage");
                                    userChoiceInt = in.nextInt();
                                    if (userChoiceInt != 1){
                                        System.out.println("Fejl. Forkert input!");
                                    }
                                }while(userChoiceInt != 1);
                                    break;
                        }
                    } while(userChoiceInt !=3);break;
                case 2: //Bank/Medarbejder/
                    do {
                        System.out.println("1) Opret kunde\t\t2) Opret konto\t\t3) Log ud");
                        userChoiceInt = in.nextInt();
                        switch(userChoiceInt) {
                            case 1: //Bank/Medarbejder/OpretKunde/
                                System.out.println("Indtast CPR nr. og tryk enter:");
                                userChoiceString = in.next();

                                break;
                            case 2: //Bank/Medarbejder/OpretKonto/
                                System.out.print("Indtast CPR nr. og tryk enter: ");
                                userChoiceString = in.next();

                                System.out.print("Indtast et konto nr. og tryk enter (8 cifre): ");
                                userChoiceInt = in.nextInt();

                                System.out.print("Indtast kundens rådighedsbeløb: ");
                                userChoiceDouble = in.nextDouble();

                                System.out.println("\nNy konto er oprettet!\n");

                                break;
                        }
                    }while(userChoiceInt != 3);
                case 3: //Bank/Kunde/
                    do{
                        System.out.println("Vælg handling:");
                        System.out.println("1) Overfør beløb til konto\t\t2) Saldo for konto(er)\t\t3) Log ud");
                        userChoiceInt = in.nextInt();
                        switch(userChoiceInt){
                            case 1: break;
                            case 2: break;
                        }
                    }while(userChoiceInt != 3);

                    break;
            }
        } while (userChoiceInt != 4);

    }
}
