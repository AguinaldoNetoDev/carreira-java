package desafios.sectionOne.classes;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double reviewsAverage = 0;
        double values;

        for (int i = 0; i < 3; i++) {
            System.out.println("Tell me your review from movie: ");
            values = scanner.nextDouble();
            reviewsAverage += values;
        }
        System.out.println("Average reviews " + reviewsAverage / 3);
    }
}
