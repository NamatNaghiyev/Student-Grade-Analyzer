
public class Student_Grade_Analyzer {

    public static void main(String[] args) {
        int[] scores = {85, 42, 90, 67, 30, 100, 55};

        analyzeScores(scores);
    }

    public static void analyzeScores(int[] scores) {
        int passed = 0;
        int failed = 0;
        int sum = 0;
        int max = scores[0];

        for (int score : scores) {
            if (score >= 51) {
                passed++;
            } else {
                failed++;
            }

            sum += score;

            if (score > max) {
                max = score;
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("===== STUDENT GRADE REPORT =====");
        System.out.println("Total Students : " + scores.length);
        System.out.println("Passed         : " + passed);
        System.out.println("Failed         : " + failed);
        System.out.println("Total Score    : " + sum);
        System.out.printf("Average Score  : %.2f%n", average);
        System.out.println("Highest Score  : " + max);
        System.out.println("================================");
    }
}
