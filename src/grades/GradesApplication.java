package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {


        HashMap<String, Student> students = new HashMap<>();
        Student student3 = new Student("Matt");
        Student student4 = new Student("Jessica");
        Student student5 = new Student("Barry");
        Student student6 = new Student("Jon Snow");
        students.put("Tomatoesarefruits123", student3);
        students.put("Tacos4life", student4);
        students.put("startrekistotallybetterthanstarwars", student5);
        students.put("GoTseason8sucks", student6);

        student3.addGrade(90);
        student3.addGrade(84);
        student3.addGrade(96);
        student4.addGrade(100);
        student4.addGrade(98);
        student4.addGrade(100);
        student5.addGrade(76);
        student5.addGrade(88);
        student5.addGrade(99);
        student6.addGrade(58);
        student6.addGrade(63);
        student6.addGrade(43);

        //System.out.println(student3.getGradeAverage());
        System.out.println(student3.getName());
        System.out.println("Welcome\n\n Here is a list of our students:");
        System.out.println(students.keySet());
        System.out.println();
        System.out.println("What student would you like to see more info on?");
        Scanner scanner = new Scanner(System.in);
        //scanner.nextLine();
        //if (students.containsKey(scanner)) {

        //}
    }

}
