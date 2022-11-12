package TaskOne;

/*
 * write a java program to ask student to enter the marks of the five units they did last semester,
 * compute the average and display it on the screen.\
 * (average should b given in two decimall places)
 */

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        try (// Java Program to Enter Marks of Five Subjects and Calculate total and average
         Scanner input = new Scanner(System.in)) {
             System.out.println("Enter the marks of five subjects::\n");
 
             // To store the values of five subjects
             float sub_1 = input.nextFloat();
             float sub_2 = input.nextFloat();
             float sub_3 = input.nextFloat();
             float sub_4 = input.nextFloat();
             float sub_5 = input.nextFloat();
 
             float total;
             float average;
             
 
             // Calculate total and average
             total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
             average = (float)(total / 5.0);
   
 
             // It will produce the final output
             System.out.println("\nThe Total marks   = " + total + "/500.0");
             System.out.println("The Average marks = " + average);
         }
}
}
