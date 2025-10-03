import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        // TODO: Create Random objects for dice rolling
        // 1. Three Random objects without seeds (unseeded dice)
        // 2. One Random object with any seed value (seeded die)
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        Random randseed= new Random(620320);

        
        // TODO: Generate random integers for dice rolls

        int die1, die2, die3, die4;
        die1 = 1 + rand1.nextInt(5);
        die2 = 1 + rand2.nextInt(5);
        die3 = 1 + rand3.nextInt(5);
        die4 = 1 + randseed.nextInt(5);


        // TODO: Display the dice rolls - 1-6
        System.out.println("Unseeded Die 1: " + die1);
        System.out.println("Unseeded Die 2: " + die2);
        System.out.println("Unseeded Die 3: " + die3);
        System.out.println("Seeded Die: " + die4);



        // TODO: Demonstrate the difference between seeded and unseeded
        // Run the program multiple times to show seeded consistency
    }
}
