package desafios.sectionOne.challenges;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guessing Game!!!");

        int tentativas = 0;

        for (int contador = 0; contador < 5; contador++) {
            System.out.println("Enter a number between 0 and 100: ");
            int valorDigitado = scanner.nextInt();
            System.out.printf("The number entered was: %2d\n", valorDigitado);


            int numeroAleatorio = new Random().nextInt(100);
            System.out.printf("The winning number was:  %2d\n\n", numeroAleatorio);

            if (valorDigitado == numeroAleatorio) {
                System.out.println("Well done, you got it right!!!");
                break;
            }

            tentativas++;
        }
        if (tentativas == 5) {
            System.out.println("Limit of attempts reached.");
        }
    }
}
