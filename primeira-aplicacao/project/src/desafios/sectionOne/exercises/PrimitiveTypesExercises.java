package desafios.sectionOne.exercises;

public class PrimitiveTypesExercises {

    public static void main(String[] args) {

        //1 - Write a program that calculates the average of two decimal grades and displays the result.
        double firstNome;
        double secondNote;

        firstNome = 9.5;
        secondNote = 6.0;
        double finalAverage = (firstNome + secondNote) / 2;

        System.out.printf("Ex: 1 - Final average is: %2f", finalAverage);

        //2 - Declare a variable of type double and a variable of type int. Cast the double variable to int and print the result.
        double valueOne = 10.5;
        int result = (int) valueOne;

        System.out.printf("\nEx: 2 - The result after casting is: %2d", result);

        //Declare a variable of type char (letter) and a variable of type String (word). Assign values to these variables and concatenate them into a message.
        char letraA = 'A';
        String frase = "vocado is very delicious";

        System.out.printf("\nEx: 3 - " + letraA + " " + frase + ".");

        /*
        * Declare a variable of type double productPrice and a variable of type int (quantity).
        Calculate the total value by multiplying the product price by the quantity and display the result in a message.
         */
        double productprice = 9.99;
        int quantity = 10;
        double totalValue = productprice * quantity;
        String totalValueMessage = """
                The total purchase amount is %2f.
                """.formatted(totalValue);

        System.out.println("\nEx: 4 - " + totalValueMessage);

        /*
        * Declare a variable of type double dollarValue. Assign a value in dollars to this variable. Consider that the value of 1 dollar is equivalent to 4.94 reais.
        * Convert the value from dollars to reais and print the formatted result.
        * */

        double conversionRate = 4.94;
        int totalValueInDollarCoin = 5;
        double totalValueInRealCoin = conversionRate * (double) totalValueInDollarCoin;

        String TotalMoneyValueInRealMessage = """
                The total value in REAL currency is %2f.
                """.formatted(totalValueInRealCoin);

        System.out.println("Ex: 5 - " + TotalMoneyValueInRealMessage);

        /*
        * Declare a variable of type double originalPrice. Assign a value in reais to this variable, representing the original price of a product.
        * Next, declare a variable of type double discountPercentage and assign a percentage discount value to the product (for example, 10 for 10%).
        * Calculate the discount value in reais (Brazilian currency), apply it to the original price, and print the new discounted price.
        * */
        double originalPrice = 10;
        double discount = 0.10;
        double priceWithDiscount = originalPrice - (originalPrice * discount);

        System.out.printf("Ex: 6 - The new price is: %2f", priceWithDiscount);

    }

}
