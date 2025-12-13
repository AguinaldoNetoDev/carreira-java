package exercises;

public class MainExercises {
    public static void main(String[] args) {
        /*
        * 1 - Create a Person class with a method that displays "Hello, world!" in the console.
        * */
        Person person = new Person();
        person.phrase = "Hello World!";

        System.out.println(person.welcomeMessage());

        /*
         * 2 - Create a Calculator class with a method that receives a number as a parameter and returns double that number.
         * */
        Calculator calculator = new Calculator();
        System.out.println(calculator.doubleValue(5));

        /*
         * 3 - Create a Music class with attributes title, artist, releaseYear, rating, and numberOfRatings, and methods to display the technical
         * information, rate the song, and calculate the average rating.
         * */
        Music music = new Music();
        music.title = "Potato";
        music.artist = "Chef";
        music.releaseYear = 2025;
        music.getInfo();

        music.getRating(5);
        music.getRating(4);
        System.out.println(music.getAverage());

        /*
         * 4 -Create a Car class with attributes model, year, color, and methods to display the technical information and calculate the car's age.
         * */
        Car car = new Car();
        car.model = "Volks";
        car.year = 2022;
        car.color = "black";
        car.getInfo();
        System.out.println(car.getAgeCar());

        /*
         * 5 - Create a Student class with attributes name, age, and a method to display information.
         * Create an instance of the Student class, assign values its attributes, and use the method to display the information.
         * */
        Student student = new Student();
        student.name = "Luísa";
        student.age = 2;
        student.getInfo();
    }
}
