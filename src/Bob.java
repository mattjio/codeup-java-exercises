import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner convo = new Scanner(System.in);

        System.out.println("Talk to Bob.");
        String talk = convo.nextLine();
            if (talk.endsWith("?")) {
                System.out.println("Sure.");
            } else if (talk.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (talk.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }

    }
}