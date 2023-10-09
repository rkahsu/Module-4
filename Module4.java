
import java.util.Scanner;

public class FloatingPointValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0; 
        double total = 0;
        double max = 0;
        double min = 0; 

        while (count < 5) {
            System.out.print("Enter a floating-point value: ");
            if (input.hasNextDouble()) {
                double value = input.nextDouble();
                
                if (count == 0) {
                    max = value;
                    min = value;
                }

                total += value;

                if (value > max) {
                    max = value;
                }

                if (value < min) {
                    min = value;
                }

                count++;
            } else {
                System.out.println("Error. Enter a floating-point value.");
                input.nextLine(); 
            }
        }

        double average = total / 5;
        double interest = total * 0.20;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on total at 20%: " + interest);

        input.close();
    }
}

