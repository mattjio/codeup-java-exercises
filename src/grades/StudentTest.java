package grades;

public class StudentTest {

    public static void main(String[] args) {

        Student student = new Student("Matthew");
        Student student2 = new Student("Jimmy the tool");
        System.out.println(student.getName());
        student.addGrade(86);
        student.addGrade(96);
        student2.addGrade(100);
        student2.addGrade(93);
        System.out.println(student.getGradeAverage());
        System.out.println(student2.getGradeAverage());
    }

}
