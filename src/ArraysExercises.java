import java.util.Arrays;

public class ArraysExercises {

    public static String[] addPerson(String arr[], String newPerson) {

        String newArray[] = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++)
            newArray[i] = arr[i];

        newArray[arr.length] = newPerson;

        return newArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        String[] Person = new String[4];
        Person[0] = "Matthew";
        Person[1] = "Other Matthew";
        Person[2] = "Matt";
        Person[3] = "Other Matt";
        System.out.println(Arrays.toString(Person));
        for (String names : Person) {
            System.out.println(names);
        }

        System.out.println(Arrays.toString(addPerson(Person,"David")));

    }
}
