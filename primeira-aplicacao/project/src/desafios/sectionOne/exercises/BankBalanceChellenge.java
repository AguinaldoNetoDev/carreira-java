package desafios.sectionOne.exercises;

import java.util.Scanner;

public class BankBalanceChellenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String clientName = "Aguinaldo Neto";
        String accountType = "Corrente";
        double initialBalance = 2500;
        int option = 0;

        System.out.println("**********************************************************");

        System.out.println("Dados iniciais do cliente:\n");

        System.out.printf("Name: %s\n", clientName);
        System.out.printf("Account Type: %s\n", accountType);
        System.out.printf("Initial balance: R$ %.2f\n", initialBalance);


        System.out.println("**********************************************************\n");


        String menu = """
                \n
                **Operations**
                1- Check balance
                2- Receive value
                3- Transfer value
                4- Exit
                
                Enter your desired option:
                """;

        while (option != 4) {

            System.out.println(menu);
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.printf("The current balance is %.2f", initialBalance);
                    break;

                case 2:
                    System.out.println("Please state the amount to be received.");
                    double valueReceived = scanner.nextDouble();
                    initialBalance += valueReceived;

                    System.out.printf("Updated balance R$ %.2f", initialBalance);
                    break;

                case 3:
                    System.out.println("Please state the amount to be transferred.");
                    double valueTransferred = scanner.nextDouble();

                    if (initialBalance < valueTransferred) {
                        System.out.println("There are not enough funds to complete this transaction.");
                        break;
                    }

                    initialBalance -= valueTransferred;

                    System.out.printf("Updated balance R$ %.2f", initialBalance);
                    break;

                case 4:
                    System.out.println("You exit the app!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

    }
}
