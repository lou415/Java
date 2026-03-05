package projects;
import java.util.Scanner;
public class tempConverter{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        double temp, newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        // this is method chaining
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp -32) * 5/9 : (temp *5/9) +32;

        System.out.printf("%.1f° %s\n", newTemp, unit);
        scanner.close();
    }

}