package projects;
import java.util.Scanner;
public class compoun_interest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // our variables
        double principal, rate, amount;
        int timesCompounded, years;

        System.out.print("Please enter your principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (percentage): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal*Math.pow(1+rate/timesCompounded, timesCompounded*years);
        System.out.println("The amount after " + years + " is: $" + amount);
        scanner.close();
    }
}
