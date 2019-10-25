import java.util.Scanner; 
import java.lang.Math;

public class apcsa_shapes {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
       
        System.out.print("Enter a shape: ");
        String userShape = in.nextLine();

        if (userShape.equals("circle")){
            System.out.print("Enter a radius: ");
            double radius = in.nextDouble();
            double area = Math.PI * (radius * radius);
            System.out.println("\n" + String.format("%,.2f", area) + ".");
        } 
        if (userShape.equals("rectangle")){
            System.out.print("Enter a length: ");
            double rectLength = in.nextDouble();
            System.out.print("Enter a width: ");
            double rectWidth = in.nextDouble();
            double rectArea = rectWidth * rectLength; 
            System.out.println("\n" + String.format("%,.2f", rectArea) + ".");
        } 
        if (userShape.equals("square")){
            System.out.print("Enter a side: ");
            double squareSidelength = in.nextDouble();
            double squareArea = squareSidelength * squareSidelength; 
            System.out.println("\n" + String.format("%,.2f", squareArea) + ".");
        } 
         if (userShape.equals("triangle")){
            System.out.print("Enter a base: ");
            double triBase = in.nextDouble();
            System.out.print("Enter a height: ");
            double triHeight = in.nextDouble();
            double triangleArea = (0.5)* (triBase)* (triHeight);
            System.out.println("\n" + String.format("%,.2f", triangleArea) + ".");
        }
       
        
    }
}
