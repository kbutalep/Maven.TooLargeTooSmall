import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner askGuess = new Scanner(System.in);
        System.out.println("Guess a number from 1 to 10");
        int userGuess = askGuess.nextInt();
        int min = 1;
        int max = 10;
        double randomNumber = (int)(Math.random() * (max - min)) + min;
        while (userGuess != randomNumber){
            if (userGuess > randomNumber){
                System.out.println("Too Large");
            } else {
                System.out.println("Too Small");
            }
            System.out.println("Guess again");
            userGuess = askGuess.nextInt();
        }

        System.out.println("Correct Guess");
    }
}
