package TaskOne;
/*
 * 1.	Write a Java program that asks the user to enter their sir name and current age then print the number of characters of their sir name and even or odd depending on their age number. 
Example of Expected result:
If sir name is Saruni and age is 29, output will be;
then the number of characters is 6.
Your current age is an odd number

 */

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your name :");
            int name = input.nextInt();
            
                    
            System.out.println("Enter your age :");
            int age=input.nextInt();
            
            if (age % 2==0)
                System.out.println(age +"is even");
            else
                System.out.println(age + "is odd");

            System.out.println("Name :"+ name);
            System.out.println("Age :"+age);

                    //computing the output
                    System.out.println("the number of your character is " + name);
                    System.out.println("your current age is  :" + age);
        }
            }
    }