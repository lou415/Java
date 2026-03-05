package projects;

import java.util.Scanner;

public class banking {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // JAVA BANKING PROGRAM

        // DECLARE VARIABLES
        double balance = 0;
        boolean isRunning = true;
        int choice;

        // DISPLAY MENU: PICK A CHOICE
        while(isRunning){
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");
            System.out.println("***************");
            System.out.print("ENTER YOUR CHOICE (1-4):");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        System.out.println("***************************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("***************************");

        scanner.close();
    }
    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){
        double amount;
        System.out.print("Enter the amount you want to deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else {
            return amount;
        }
    }
    static double withdraw(double balance){

        double amount;
        System.out.print("Enter your withdraw amount: ");
        amount = scanner.nextDouble();
        // checking against withdrawing money you don't have.
        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    // CREATE EXIT METHOD

}
