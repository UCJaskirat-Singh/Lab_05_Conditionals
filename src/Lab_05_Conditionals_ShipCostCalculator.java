import java.util.Scanner;

public class Lab_05_Conditionals_ShipCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the item: $");
        double price = scanner.nextDouble();

        double shippingCost = (price >= 100) ? 0 : price * 0.02;

        double totalPrice = price + shippingCost;

        System.out.printf("Shipping Cost: $%.2f\n", shippingCost);
        System.out.printf("Total Price:   $%.2f\n", totalPrice);

        scanner.close();
    }
}
