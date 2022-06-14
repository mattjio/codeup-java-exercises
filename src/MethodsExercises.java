import java.util.Scanner;
import java.util.Random;
public class MethodsExercises {

    public static int addition(int x,int y) {
        return x+y;
    }

    public static int subtraction(int x,int y) {
        return x-y;
    }

    public static int multiplication(int x,int y) {
        return x*y;
    }

    public static int division(int x,int y) {
        return x/y;
    }

    public static int modulus(int x,int y) {
        return x%y;
    }

    public static int getInteger(int min, int max, int num) {

        if (num < min || num > max) {
            System.out.println("WRONG INPUT. PLease enter Integer between " +min+" and " +max+ ": ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            num = getInteger(min,max,num);
        }
        return num;
    }

    public static void factorial() {
        int num;
        System.out.println("Enter a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if (num < 1 || num > 10) {
            System.out.println("WRONG INPUT");
            factorial();
        }
        long fact = 1;
        for(int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of "+num+ " is: "+fact);
        System.out.println("Do you want to enter another number? (Y/N)");
        String userChoice = scanner.next();
        if(userChoice.equalsIgnoreCase("y")) {
            factorial();
        }


    }

    public static void dice() {
        int diceSides;
        System.out.println("How many sides does your dice have: ");
        Scanner scanner = new Scanner(System.in);
        diceSides = scanner.nextInt();
        Random rand = new Random();
        int die1 = rand.nextInt(diceSides);
        die1 +=1;
        int die2 = rand.nextInt(diceSides);
        die2 +=1;
        System.out.println("You rolled a " +die1+ " and a " +die2);
        System.out.println("Would you like to roll again (Y/N)");
        String userChoice = scanner.next();
        if(userChoice.equalsIgnoreCase("y")) {
            dice();
        }
    }


    public static void main(String[] args) {
        //System.out.println(addition(10,5));
        //System.out.println(subtraction(10,5));
        //System.out.println(multiplication(10,5));
        //System.out.println(division(10,5));
        //System.out.println(modulus(10,5));
        //System.out.println(getInteger(1,10,10));
        //factorial();
        dice();
    }
}
