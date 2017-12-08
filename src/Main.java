import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-- TEST AFSNIT--");
        Customer cus = new Customer("0205912533");

        System.out.println(cus.getId() + " " + cus.getRole());

        System.out.println("\n-- BANK -- \n");

        //Account a = new Account("0205912533", 4442533, 15000.0);
        //Account a2 = new Account("0205912533", 5552533, 2000.0);



        int userChoice;



        do {
            System.out.println("Log ind som:\n1) Administrator\t2) Medarbejder\t\t3) Kunde\t\t4) Afslut\n");

            Scanner in = new Scanner(System.in);
            userChoice = in.nextInt();

            switch (userChoice) {
                case 1: //Bank/Administrator/
                    do{
                        System.out.println("1) Se oversigt over brugere\t\t2) Se oversigt over kontoer\t\t3) Log ud\n");
                        userChoice = in.nextInt();
                        switch (userChoice){
                            case 1: //Bank/Administrator/OversigtBruger/
                                System.out.println("Oversigt over brugere (id): ");

                                do{System.out.println("1) Tilbage");
                                    userChoice = in.nextInt();
                                    if (userChoice != 1)
                                        System.out.println("Fejl: Forkert input!");
                                } while(userChoice != 1);
                                break;
                            case 2: //Bank/Administrator/OversigtKonto/
                                System.out.println("Oversigt over kontoer (konto nr. og balance): ");

                                System.out.println("1) Tilbage");
                                userChoice = in.nextInt();
                                if(userChoice == 1)
                                    break;
                        }
                    } while(userChoice !=3);break;
                case 2:
                    System.out.println("1) Opret kunde\n2) Opret konto\n ");break;
            }
        } while (userChoice != 4);

    }
}
