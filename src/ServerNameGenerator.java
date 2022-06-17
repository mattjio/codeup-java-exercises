import java.util.Random;

public class ServerNameGenerator {

    static String[] adj = {"large", "small", "bewildered", "calm", "microscopic", "repulsive", "brave", "obnoxious", "delightful", "colossal"};

    static String[] noun = {"llama", "Beach", "beer", "man", "woman", "shirt", "storm", "city", "mountain", "animal"};

    public static String randomAdj(String arr[]) {
        Random rand = new Random();

        int randNum = rand.nextInt(10);
        String randAdj = arr[randNum];
        return randAdj;
    }

    public static String randomNoun(String arr[]) {
        Random rand1 = new Random();

        int randNum = rand1.nextInt(10);
        String randNoun = arr[randNum];
        return randNoun;
    }

    public static void main(String[] args) {
        System.out.println(randomAdj(adj));
        System.out.println(randomNoun(noun));

        String randServer = randomAdj(adj)+ "-" + randomNoun(noun);
        System.out.println("Here is your random server name: ");
        System.out.println(randServer);
    }

}
