import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMarks = 0;
        int totalSubjects = 0;

        while (true) {
            System.out.print("Enter marks for a subject (out of 100, -1 to finish): ");
            int marks = input.nextInt();
            if (marks == -1) {
                break;
            }
            if (marks >= 0 && marks <= 100) {
                totalMarks += marks;
                totalSubjects++;
            } else {
                System.out.println("Marks should be between 0 and 100.");
            }
        }

        if (totalSubjects > 0) {
            double averagePercentage = (double) totalMarks / totalSubjects;
            String grade = getGrade(averagePercentage);

            System.out.println("Total Marks: " + totalMarks);
            System.out.printf("Average Percentage: %.2f%%%n", averagePercentage);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("No valid marks were entered.");
        }
    }

    public static String getGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
