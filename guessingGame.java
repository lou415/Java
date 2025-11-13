package projects;

import java.util.Scanner;
import java.util.Random;

public class guessingGame {
    public static void main(String[] args) {
        int compNumber, userNumber;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        compNumber = random.nextInt(1,11);
        // ASK THE USER WHAT THEIR GUESS IS. THE NUMBER HAS TO BE BETWEEN 1 AND 10, IF ITS NOT, THEY'LL HAVE TO TRY AGAIN.
        do{
            System.out.print("User, please enter your number to begin the game (1-10): ");
            userNumber = scanner.nextInt();
        } while (userNumber < 1 || userNumber > 10);
        System.out.printf("The user has entered: %d%n", userNumber);

        // ENCHANCED SWITCH TO SAY IF ITS TOO HIGH OR TOO LOW
        while (userNumber != compNumber) {
            switch (Integer.compare(userNumber, compNumber)) {
                case -1 -> System.out.println("User, your guess is too low.");
                case 1 -> System.out.println("User, your guess is too high.");
                default -> System.out.println("Something has gone awry.");
            }
            System.out.print("Please enter your new guess: ");
            userNumber = scanner.nextInt();
        }
        System.out.println("CONGRATULATIONS, YOU HAVE BEAT A COMPUTER!");



// MAYBE 50 --> MEDIUM AND 100 --> HARD)


        scanner.close();
    }

}