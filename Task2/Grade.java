package myproject;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        int subjects;
	        int total = 0;

	        System.out.print("Enter number of subjects: ");
	        subjects = sc.nextInt();

	        for (int i = 1; i <= subjects; i++) {
	            System.out.print("Enter marks for subject " + i + " (out of 100): ");
	            int marks = sc.nextInt();
	            total = total + marks;
	        }

	        double average = (double) total / subjects;
	        char grade;

	        if (average >= 90) {
	            grade = 'A';
	        } 
	        else if (average >= 80) {
	            grade = 'B';
	        } 
	        else if (average >= 70) {
	            grade = 'C';
	        } 
	        else if (average >= 60) {
	            grade = 'D';
	        } 
	        else {
	            grade = 'F';
	        }

	        System.out.println("\n----- Result -----");
	        System.out.println("Total Marks = " + total);
	        System.out.println("Average Percentage = " + average + "%");
	        System.out.println("Grade = " + grade);

	        sc.close();
	}

}
