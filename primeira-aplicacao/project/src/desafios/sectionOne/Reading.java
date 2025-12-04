package desafios.sectionOne;

import java.util.Scanner;

public class Reading {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your favorite movie: ");
        String favoriteMovie = scanner.nextLine();

        System.out.println("What is year of release?");
        int releaseYear = scanner.nextInt();

        System.out.println("Tell me your review of the movie.");
        double reviewValue = scanner.nextDouble();

        System.out.println(favoriteMovie + ", " + releaseYear + ", " + reviewValue);


    }
}
