package util;

import java.util.Scanner;



public class Input {
    private Scanner scanner = new Scanner(System.in);

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("please enter a string");
       return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Please enter yes or no.");

        return false;
    }

    public double getDouble() {
        System.out.println("please enter a number: ");
        return scanner.nextDouble();
    }

    public int movieChoice() {
        System.out.println("What would you like to do");
        System.out.println("\n");
        System.out.println("0: Exit");
        System.out.println("1: View all movies");
        System.out.println("2: View animated movies");
        System.out.println("3: View drama movies");
        System.out.println("4: View horror movies");
        System.out.println("5: View sci-fi movies");
        System.out.println("\n");
        System.out.println("Please enter a number corresponding to the above options: ");
        return scanner.nextInt();
    }

}
