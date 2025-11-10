package projects;

import java.util.Scanner;

public class weightConversion {
    public static void main(String[] args){
        // WEIGHT CONVERSION PROGRAM

        // Declare the required variables
        Scanner scanner = new Scanner(System.in);
        double weight, newWeight;
        int choice;
        // Welcome Message
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // Prompt user input
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        // option 1: convert lbs to kgs
        if (choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f\n", newWeight);
        }
        // option 2: convert kgs to lbs
        else if (choice == 2) {
            System.out.println("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f\n", newWeight);
        }
        // else print not a valid choice
        else {
            System.out.println("That was not a valid choice!");
        }
        scanner.close();
    }
    
}
