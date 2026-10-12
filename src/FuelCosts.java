import java.util.Scanner;

public class FuelCosts {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gallons;
        double mpg;
        double price;

        do {
            System.out.println("Enter gallons of gas in the tank");
            gallons = input.nextDouble();
        } while (gallons <= 0);

        do{
            System.out.println("Enter miles per gallon");
            mpg = input.nextDouble();
        } while (mpg <= 0);

        do {
            System.out.print("Enter price of gas per gallon");
            price = input.nextDouble();
        } while (price <=0);

        double cost = (100 / mpg) * price;
        double distance = gallons * mpg;

        System.out.println("Cost to drive 100 miles: $" + cost);
        System.out.println("Distance on a full tank: " + distance + "miles");




    }

}