import java.util.Scanner;

public class guessingGame {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        int guess = 1;
        int correctAnswer = (int)(Math.random() * 100) + 10;
        boolean correctGuess = false;

        for (int i = 1; i <= 4; i++) {
            
            System.out.println("Attempt " +i+ " I'm thinking of a number between 1 and 100. Guess the number I am thinking of: ");
            int answer = userInput.nextInt();
            int close = Math.abs(answer - correctAnswer);

            if (answer == -1){
                System.exit(0);
            }
            if (answer == 0){
                System.out.println("You don't read, do you? Pick a number between 1 - 10");
            }
            if (answer == correctAnswer){
                System.out.println("I'll get you next time.");
                correctGuess = true;
                System.exit(0);
            } else{
                System.out.println("You are " + close + " away from what I am thinking ");
            } 
            guess ++;
            }
            if (!correctGuess) {
                System.out.println("Sorry, the correct answer is " +correctAnswer);
                System.exit(0);
            }
            userInput.close();
        }
    }