/**
 * Created by John Syfacunda on 9/15/2016.
 */

import java.util.Scanner;
public class UseTriangle {
    public static void main(String[] args) {

        while (true) {
            Scanner kb = new Scanner(System.in);
            //variables
            double sideA = 0;
            double sideB = 0;
            double sideC = 0;

            while (true) {
                try {
                    //getting the side lengths of the triangle from user
                    System.out.println("Enter the side lengths of your triangle\n");
                    System.out.println("Side A = ");
                    sideA = kb.nextDouble();
                    System.out.println("Side B = ");
                    sideB = kb.nextDouble();
                    System.out.println("Side C = ");
                    sideC = kb.nextDouble();
                    break;
                }
                //if wrong value is entered
                catch(Exception e) {
                    System.out.println("Please enter correct values.");
                    kb.nextLine();
                }
            }
            triangle userTriangle = new triangle(sideA, sideB, sideC);
            //tells user what triangle it is
            if (userTriangle.isTriangle()) {
                if (userTriangle.isEquilateral()){
                    System.out.println("This is an equilateral triangle.\n");  }
                else if (userTriangle.isScalene()) {
                    System.out.println("This is a scalene triangle.\n"); }
                else if (userTriangle.isIsosceles()) {
                    System.out.println("This is an isosceles triangle.\n"); }
                else
                    System.out.println("Error occured");
                }
            else
                System.out.println("This is not a triangle.\n");

            System.out.println("Run program again? y/n");
            kb.nextLine();
            String answer = kb.nextLine();
            if (answer.equals("y") || answer.equals("Y"))
                System.out.println();
            else
                break;
            }
        }
    }

