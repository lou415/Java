package projects;
import java.util.Scanner;
public class madLibsGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // declare the variables:
        String adj1;
        String noun1;
        String adj2;
        String verb1;
        String adj3;

        // grabbing the input and storing it:
        System.out.print("Enter adjective 1: ");
        adj1 = scanner.nextLine();
        System.out.print("Enter a noun (animal/person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter adjective 2: ");
        adj2 = scanner.nextLine();
        System.out.print("Enter a present tense verb (-ing): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter the final adjective: ");
        adj3 = scanner.nextLine();

        System.out.println("\nToday I went to a " + adj1 + " a zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adj2 + " and " + verb1 + "!");
        System.out.println("I was " + adj3 + "!");

        // always be sure to close the scaner
        scanner.close();

}
}