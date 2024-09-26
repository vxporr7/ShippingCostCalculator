import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the price of the item: ");
        double price = in.nextDouble();
        
        double shippingCost = 0;
        
        if (price<25) {
            shippingCost = 2.99;
        }
        else if (price>= 50) {
            shippingCost = 0.00;
        }

        System.out.println("The shipping cost is: $" + shippingCost);
    }
}