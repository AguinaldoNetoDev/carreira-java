package exercises;

public class Student {
    String name;
    int age;

    void getInfo() {
        String text = """
                Student name: %s
                Student age: %d
                """.formatted(name, age);

        System.out.println(text);
    }
}
