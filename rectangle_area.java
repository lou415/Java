package projects;
import java.util.Scanner;

public class rectangle_area {
    public static void main(String[] args){
        // Calculating the area of rectangle
        // this is just the length * width
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("The area is: " + area + " cm");

        scanner.close();

    }
    
}
