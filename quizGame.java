package projects;
import java.util.Scanner;
public class quizGame {
    public static void main(String[] args){
        // ARRAY OF QUESTIONS[]
        String[] questions = {"What happened to JFK?", 
                              "Why did Batman die?", 
                              "What kind of create lives there?", 
                              "What does CPU stand for?", 
                              "What is Facebook?"};
        
        String[][] options = {{"1. Assassinated", "2. Heart faliure", "3. Old age", "4. scuttlebut"},
                              {"1. He never died", "2. He was killed in combat", "3. He was lasered", "4. Who knows?"},
                              {"1. The unimaginable", "2. Lochness", "3. The one from the black lagoon", "4. Andy"},
                              {"1. Central Processing Unit", "2. Central Peabody Unit", "3. Command Put Uline", "4. Central Pager Unit"},
                              {"1. Social media site", "2. Social media dump", "3. Hostile", "4. Under scrutiny"}};
        

        int[] answers = {1, 4, 1, 1, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("Welcome to the Java quiz game");
        System.out.println("*****************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println();
            System.out.println(questions[i]);
            for(String option:options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("Correct!");
                score++;
            }
            else{
                System.out.println("Wrong!");
            }
        }
        System.out.println("Your final score is: " + score + " out of " + questions.length);
        scanner.close();
    }
}
