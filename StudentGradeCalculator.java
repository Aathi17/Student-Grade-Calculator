package grade;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        final double A_GRADE_THRESHOLD = 90.0;
	        final double B_GRADE_THRESHOLD = 80.0;
	        final double C_GRADE_THRESHOLD = 70.0;
	        final double D_GRADE_THRESHOLD = 60.0;
	        System.out.print("Enter the number of subjects: ");
	        int numOfSubjects = scanner.nextInt();

	        int totalMarks = 0;

	        for (int i = 1; i <= numOfSubjects; i++) {
	            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
	            int marks = scanner.nextInt();
	            totalMarks += marks;
	        }
	        double averagePercentage = (double) totalMarks / numOfSubjects;
	        char grade;
	        if (averagePercentage >= A_GRADE_THRESHOLD) {
	            grade = 'A';
	        } else if (averagePercentage >= B_GRADE_THRESHOLD) {
	            grade = 'B';
	        } else if (averagePercentage >= C_GRADE_THRESHOLD) {
	            grade = 'C';
	        } else if (averagePercentage >= D_GRADE_THRESHOLD) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }
	        System.out.println("\nResults:");
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + averagePercentage + "%");
	        System.out.println("Grade: " + grade);
	        scanner.close();
	    }
	}



