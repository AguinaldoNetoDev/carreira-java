public class Movie {
    String name;
    int releaseYear;
    boolean isIncludedInPlan;
    int totalEvaluations;
    double totalRating;
    int durationInMinutes;

    void showTechnicalSpecificationsPrint() {
        System.out.println("Movie name: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Duration movie in minutes: " + durationInMinutes);
    }

    void review(double stars) {
        totalRating  += stars;
        totalEvaluations++;

        System.out.printf("Total review is %.1f ", totalRating);
        System.out.printf("and sum of evaluation is %d.\n", totalEvaluations);

    }

    double getAverageRatings() {
        return totalRating / totalEvaluations;
    }
}
