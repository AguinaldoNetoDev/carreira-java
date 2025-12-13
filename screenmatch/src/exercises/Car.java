package exercises;

public class Car {
    String model;
    int year;
    String color;

    void getInfo() {
        String text = """
                Car model: %s
                Car year: %d
                Car color: %s
                """.formatted(model, year, color);

        System.out.println(text);
    }

    int getAgeCar() {
        return 2025 - year;
    }

}
