import java.util.ArrayList;

public class StudentGradeFilter {
    public static void main(String[] args) {

        // Creating ArrayList of exam scores
        ArrayList<Integer> scores = new ArrayList<>();

        // Adding sample scores
        scores.add(95);
        scores.add(78);
        scores.add(35);
        scores.add(90);
        scores.add(50);
        scores.add(20);

        // Loop through scores
        for (int score : scores) {
            if (score >= 90) {
                System.out.println(score + " - Distinction");
            }
            else if (score >= 40) {
                System.out.println(score + " - Pass");
            }
            else {
                System.out.println(score + " - Fail");
            }
        }
    }
}