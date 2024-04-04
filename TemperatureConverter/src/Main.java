import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creation of Scanner object
        Scanner input = new Scanner(System.in);
        //creation of Temperature object
        Temperature temp = new Temperature();

        //prompting to the user with options
        System.out.println("Select the conversion: ");
        System.out.println("1.Celsius to Fahrenheit");
        System.out.println("2.Fahrenheit to Celsius");
        System.out.println("Enter only the number 1 or 2: ");

        //capture the user's selection
        int selection = input.nextInt();
        if (selection == 1){
            System.out.println("Enter Celsius value: ");
            double celsius = input.nextDouble();
            temp.setCelsius(celsius);
            temp.calculateFahrenheit();
            double fahrenheit = temp.toFahrenheit();
            System.out.println("Fahrenheit value for the Celsius value you entered is: " + fahrenheit);
        } else if (selection == 2){
            System.out.println("Enter Fahrenheit value: ");
            double fahrenheit = input.nextDouble();
            temp.setFahrenheit(fahrenheit);
            temp.calculateCelsius();
            double celsius = temp.toCelsius();
            System.out.println("Celsius value for the Fahrenheit value you entered is: " + celsius);
        } else {
            System.out.println("Invalid selection.");
        }

    }
}
