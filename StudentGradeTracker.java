package Npackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGradeTracker {
  public static void main(String[]args) {
	  Scanner sc = new Scanner(System.in);
	  
	  ArrayList<Integer> grades = new ArrayList<>();
	  
	System.out.println("Enter the number of students:");
	int numStudents = sc.nextInt();
   for(int i = 1; i<=numStudents; i++) {
	   System.out.println("Enter grade of student" + i + ":");
	   int grade = sc.nextInt()	;
	   grades.add(grade);
   }
     
    double average = calculateAverage(grades);
    int highest   =  findHighest(grades);
    int lowest    =  findLowest(grades);
    
    System.out.println("\nResults:");
    System.out.println("Average Grade: " + average);
    System.out.println("Highest Grade: " + highest);
    System.out.println("Lowest Grade: " + lowest);
    
    
    sc.close();
    
  }
private static double calculateAverage(ArrayList<Integer> grades) {
	if (grades.isEmpty()) {
	return 0.0;
	}
	   int sum = 0;
       for (int grade : grades) {
           sum += grade;
       }

       return (double) sum / grades.size();
   }


private static int  findHighest(ArrayList<Integer>grades) {
	 if (grades.isEmpty()) {
         return 0; 
     }
      return Collections.max(grades);
 }

private static int  findLowest(ArrayList<Integer>grades) {
	if (grades.isEmpty()) {
        return 0;
}
	 return Collections.min(grades);
  
}
}


