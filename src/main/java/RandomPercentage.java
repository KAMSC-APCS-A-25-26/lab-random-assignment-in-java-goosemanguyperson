import java.text.DecimalFormat;
import java.util.Random;

public class RandomPercentage {
    public static void main(String[] args) {
        // TODO: Create two Random objects
        // 1. One Random object without a seed (unseeded)
        // 2. One Random object with any seed value (seeded)
        Random rand1 = new Random();
        Random rand2= new Random(182957);
        DecimalFormat df = new DecimalFormat("##.00");
        
        // TODO: Generate random double values from both Random objects
        // Use nextDouble() method to get values between 0.0 and 1.0
        double num1 = rand1.nextDouble();
        double num2 = rand2.nextDouble();


        // TODO: Format as percentages
        // Format the values to exactly 2 decimal places
        // Display with % symbol
        num1 *=100;
        num2 *=100;

        // TODO: Display the values as percentages
        // Show both unseeded and seeded random values
        // Each value should be formatted as below
        System.out.printf("%.2f%%\n", num1);
        System.out.printf("%.2f%%\n", num2);
    }
}