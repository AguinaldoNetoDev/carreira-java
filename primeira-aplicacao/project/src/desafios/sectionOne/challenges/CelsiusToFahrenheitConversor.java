package desafios.sectionOne.challenges;

public class CelsiusToFahrenheitConversor {

    public static void main(String[] args) {
        int celsius = 30;
        double fahrenheit = (celsius * 1.8) + 32;

        String text =
                """
                A temperatura de %d graus Celsius para Fahrenheit é: %f
                """.formatted(celsius, fahrenheit);

        System.out.println(text);

        int fahrenheitConverted = (int) fahrenheit;
        String finalText =
                """
                A temperatura de %d graus Celsius para Fahrenheit é: %d
                """.formatted(celsius, fahrenheitConverted);

        System.out.println(finalText);
    }
}
