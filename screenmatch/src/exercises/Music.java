package exercises;

public class Music {

    String title;
    String artist;
    int releaseYear;
    int rating;
    double totalRating;

    void getInfo() {
        String text = """
                Title name: %s
                Artist name: %s
                Release year: %d
                """.formatted(title, artist, releaseYear);

        System.out.println(text);
    }

    void getRating(int value) {
        rating += value;
        totalRating++;
    }

    double getAverage() {
        return rating / totalRating;
    }

}
