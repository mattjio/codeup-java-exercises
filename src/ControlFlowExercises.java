import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        /*
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");
        int j = 0;
        do {
            System.out.println(j+=2);
        } while (j < 100);

        int b = 105;
        do {
            System.out.println(b-=5);
        } while (b > -10);

        long a = 2;
        System.out.println(a);
        do {
            System.out.println(a*=a);
        } while (a < 10000);
        **********/

        //Refactor above codes into for loops

        for (int i = 5; i <= 15; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        for (int j = 0; j <= 100; j+=2) {
            System.out.print(j + " ");
        }

        System.out.println("\n");

        for (int b = 100; b >= -10; b-=5) {
            System.out.print(b + " ");
        }

        System.out.println("\n");

        for (long e = 2; e < 100000; e*=e) {
            System.out.println(e);
        }
        System.out.println("\n");
        for (int a = 1; a <= 100; a++) {
            if (a % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (a % 3 == 0) {
                System.out.println("Fizz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(a);
            }
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        System.out.println("your number is " + userInput);

        System.out.println("Here is your table");

    }
}
