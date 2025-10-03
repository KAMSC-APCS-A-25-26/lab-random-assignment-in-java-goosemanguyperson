import java.text.DecimalFormat;
import java.util.Random;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        // TODO: Create Random object for phone number generation
        Random rand = new Random();
        DecimalFormat fmt = new DecimalFormat("000");
        // TODO: Generate first three digits (XXX)
        // Constraint: Cannot contain 8 or 9 (digits 0-7 only)

        int first3= rand.nextInt(8)+rand.nextInt(8)*10+(rand.nextInt(7))*100+100;
        
        // TODO: Generate second three digits (XXX) 
        // Constraint: Must be <= 742 (000-742)
        int next3= rand.nextInt(643)+100;

        
        // TODO: Generate third three digits (XXX)
        // No constraints (000-999)
        int last3 = rand.nextInt(999)+1;
        // TODO: Format and display phone number as XXX-XXX-XXX
        // Include the dashes in the output
        System.out.println(first3+"-"+next3+"-"+last3);
    }
}
