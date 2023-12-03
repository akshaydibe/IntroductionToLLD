package IntroductionToLLD;

public class Student {
    private String name;
    private int id;
    private int totalProblemsSolved;

    public void solvedProblems(int count) {
        totalProblemsSolved += count;
        System.out.println(this.name + " solved " + totalProblemsSolved + " problems");
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.totalProblemsSolved = 0;
    }
}
