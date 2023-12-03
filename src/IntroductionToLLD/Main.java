package IntroductionToLLD;

public class Main {
    public static void main(String[] args) {
        Student Akshay = new Student("Akshay",1);
        Student Adi = new Student("Aditya", 2);

        Akshay.solvedProblems(1);
        Adi.solvedProblems(2);

        Akshay.solvedProblems(3);
        Adi.solvedProblems(1);
    }
}
