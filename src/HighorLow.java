
import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double width;
        double height;
        double area;
        double perimeter;
        double diagonal;

        do
        {
            System.out.print("Enter width: ");
            width = input.nextDouble();
        } while (width <= 0);

        do
        {
            System.out.print("Enter height: ");
            height = input.nextDouble();
        } while (height <= 0);

        area = width * height;
        perimeter = 2 * (width + height);
        diagonal = Math.sqrt(width * width + height * height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}