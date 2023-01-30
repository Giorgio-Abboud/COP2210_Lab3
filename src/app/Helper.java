package app;

public class Helper {
    public static void displayInfo(){
        System.out.println("=====================================");
        System.out.println("DISPLAYINFO FROM HELPER CLASS");
        System.out.println("=====================================");
    }

    public static void complexArea(int circleMultiplier, int rectangleMultiplier , int triangleMultiplier ){
        double results = (circleMultiplier * Controller.calculateAreaOfCircle(10.7)) + (rectangleMultiplier * Controller.calculateAreaOfRectangle(14.2, 20.7)) + (triangleMultiplier * Controller.calculateAreaOfTriangle(33.2, 16.2));
        System.out.println("=====================================");
        System.out.println("COMPLEXAREA FROM HELPER CLASS");
        System.out.println("=====================================");
        System.out.printf("Result:\t\t\t\t\t%.3f\n", results);
        System.out.printf("circleMultiplier:\t\t%s\n", circleMultiplier);
        System.out.printf("rectangleMultiplier:\t%s\n", rectangleMultiplier);
        System.out.printf("triangleMultiplier:\t\t%s\n", triangleMultiplier);
    }

}
