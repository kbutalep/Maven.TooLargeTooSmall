import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner askGuess = new Scanner(System.in);
        System.out.println("Guess a number from 1 to 100");
        int userGuess = askGuess.nextInt();
        double randomNumber = (int)(Math.random() * (100 - 1)) + 1;

        int attempts = 0;
        int lastGuess = 101;
        while (userGuess != randomNumber){
            if(userGuess == lastGuess) {
                System.out.println("You already guessed that number");
            }
            else if (userGuess > randomNumber){
                attempts ++;
                System.out.println("Too Large");
                lastGuess = userGuess;
            } else {
                attempts ++;
                System.out.println("Too Small");
                lastGuess = userGuess;
            }
            System.out.println("Guess again");
            userGuess = askGuess.nextInt();
        }
        attempts ++;
        System.out.println("Correct Guess. It took you " + attempts + " tries.");
    }
}
