package desafios.sectionOne.classes;

import java.util.Scanner;

public class AnotherLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double averageReviews = 0;
        double value = 0;
        int totalReviews = 0;

        while (value != -1) {
            System.out.println("Tell me your review from movie or -1 to finish: ");
            value = scanner.nextDouble();

            if (value != -1) {
                averageReviews += value;
                totalReviews++;
            }
        }
        System.out.println("Average reviews " + averageReviews / totalReviews);
    }
}
