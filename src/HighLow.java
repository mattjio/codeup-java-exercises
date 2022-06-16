import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
        Random rand = new Random();


        int randomNum = rand.nextInt(100);


        randomNum += 1;
        int guess;
        int lives = 10;
        for (int numOfGuesses = 0;numOfGuesses<=lives; numOfGuesses++) {
            System.out.println("I have a random number between 1 and 100, make a guess: ");

            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();
            if (randomNum == guess) {
                System.out.println(
                        "Congratulations!"
                                + " You guessed the number.");
                break;
            } else if (randomNum > guess) {
                System.out.println(
                        "The number is "
                                + "greater than " + guess);
            } else {
                System.out.println(
                        "The number is"
                                + " less than " + guess);
            }
        }
    }
    }

