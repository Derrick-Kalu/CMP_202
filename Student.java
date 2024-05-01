package OOP;

public class Student extends User {
    String matric_no = "bhu/23/04/05/0090";
    String admission_no = "10328390416";
    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "You cannot register your courses at this moment";
        } else {
            return "You have registered for all courses";
        }
    }
    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Cannot check your result.";
        } else {
            return "You got 8As, 2Cs and 1D";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Derrick Kalu";
        student.password = "derrickkalu2";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}
