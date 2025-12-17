public class Movie {
    private String name;
    private int releaseYear;
    private boolean isIncludedInPlan;
    private int totalEvaluations;
    private double totalRating;
    private int durationInMinutes;

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

    public void setTotalRating(double totalRating) {
        this.totalRating = totalRating;
    }

    public double getTotalRating() {
        return totalRating;
    }
}
