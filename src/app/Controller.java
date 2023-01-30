//==========================================================================================
// PROGRAMMER: Giorgio Abboud
// PANTHER ID: 6360563
//
// CLASS: COP2210
// SECTION: U01
// SEMESTER: Spring 2023
// CLASSTIME: T/TH 9:30 am -12:15 pm
//
// Project: Lab 3
// DUE: January 29 2023
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this work is my
//                own and that none of it is the work of any other person.
//==========================================================================================

package app;

public class Controller {

    //-----------------------------------------------------------------
    // beginning of main(String[] args)) method

    public static void main(String[] args){

        yourInfoHeader();

        displayHeaderForPartA();

        double radius = 8.25;
        double area = calculateAreaOfCircle(radius);
        displaySingleResult(area, "calculateAreaOfCircle");

        int firstNumber = 5;
        double secondNumber = 59.5;
        multipleNumbersIntAndDouble(firstNumber, secondNumber);

        calculateAreaOfTriangleWithOutput(36.3, 18.2);

        double base = 17.16332;
        double height = 20.172391;
        double width = 20.51723;
        double triangleArea = calculateAreaOfTriangle(base, height);
        System.out.printf("Triangle info-> %15s %.3f %16s %.5f %11s %.2f", "base: ", base, "height: ", height, "area: ", triangleArea);
        double rectangleArea = calculateAreaOfRectangle(height, width);
        System.out.printf("\nRectangle info-> %16s %.4f %12s %.1f %16s %.5f\n\n", "height: ", height, "width: ", width, "area: ", rectangleArea);

        Helper.displayInfo();

        double result = calculateAreaOfCircle(9.3) + calculateAreaOfRectangle(9.4, 17.2) + calculateAreaOfTriangle(21.5, 10.3);
        System.out.printf("\nValue of result:\t\t\t%.6f\n\n", result);

        Helper.complexArea(4, 12, 5);

    }

    //-----------------------------------------------------------------
    // beginning of yourInfoHeader() method

    public static void yourInfoHeader(){

        System.out.println("============================================");
        System.out.println("PROGRAMMER:  " + "Giorgio Abboud");
        System.out.println("PANTHER ID:  " + "6360563");
        System.out.println();
        System.out.println("CLASS: \t\t COP 2210 ");
        System.out.println("SECTION: \t " + "U01");
        System.out.println("SEMESTER: \t " + "Spring");
        System.out.println("CLASSTIME: \t " + "9:30 am to 12:15 pm");
        System.out.println();
        System.out.println("Assignment: " + "Lab 3");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person.");
        System.out.println("============================================");
        System.out.println();

    }//end yourInfoHeader

   public static void displayHeaderForPartA(){
        System.out.println("===============================");
        System.out.println("SECTION Lab3a");
        System.out.println("===============================");
   }

   public static double calculateAreaOfCircle(double radius){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
   }

   public static void displaySingleResult(double value, String methodName){
       System.out.println("===============================");
       System.out.printf(methodName + "\n");
       System.out.println("===============================");
       System.out.printf("%-16s %.4f\n\n", "Value:", value);
   }

   public static void multipleNumbersIntAndDouble(int firstNumber, double secondNumber){
        double result = firstNumber * secondNumber;
        System.out.printf("Running multipleNumbersIntAndDouble -> %s, %s", firstNumber, secondNumber + "\n");
        System.out.printf("\tfirstNumber:\t\t" + firstNumber + "\n");
        System.out.printf("\tsecondNumber:\t\t" + secondNumber + "\n");
        System.out.printf("\tresult:\t\t\t\t" + result + "\n\n");
   }

   public static void calculateAreaOfTriangleWithOutput(double base, double height){
       double areaOfTriangle = (base * height) / 2;
       displaySingleResult(areaOfTriangle, "calculateAreaOfTriangleWithOutput");
   }

   public static double calculateAreaOfTriangle(double base, double height){
        double triangleArea = (base * height) / 2;
        return triangleArea;
   }

   public static double calculateAreaOfRectangle(double height, double width){
       double rectangleArea = (width * height);
       return rectangleArea;
   }

}//end Controller
