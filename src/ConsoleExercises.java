import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        System.out.println(userInput);

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter three words: ");
        String word1 = scanner1.next();
        String word2 = scanner1.next();
        String word3 = scanner1.next();
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter a sentence ye fool: ");
        //String sentence = scanner2.next();
        String sentence = scanner2.nextLine();
        System.out.println(sentence);

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Give me the length of your room or a random number: ");
        String length = scanner3.nextLine();
        int lengthInt = Integer.parseInt(length);

        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Give me the width of your room or a random number: ");
        String width = scanner4.nextLine();
        int widthInt = Integer.parseInt(width);

        System.out.println("The area of your room is " + lengthInt*widthInt);
        System.out.println("The perimeter of your room is " + (lengthInt*2+widthInt*2));

    }
}
