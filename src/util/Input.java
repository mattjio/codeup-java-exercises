package util;

import java.util.Scanner;



public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("please enter a string");
       return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Please enter yes or no.");

        return false;
    }

}
