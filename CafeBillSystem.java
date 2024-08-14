import java.util.Scanner;

public class CafeBillSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teaPrice = 30, coffeePrice = 40, milkPrice = 50;
        int teaQty = 0, coffeeQty = 0, milkQty = 0;
        int choice;
            System.out.println("----------------------");
            System.out.println("        Cafe Menu");
            System.out.println("----------------------");        
        do {
            System.out.println("1: Tea");
            System.out.println("2: Coffee");
            System.out.println("3: Milk");
            System.out.println("4: Bill");
            System.out.print("Enter Choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Tea Quantity: ");
                    teaQty += scanner.nextInt();
                    break;
                case 2:
                    System.out.print("Enter Coffee Quantity: ");
                    coffeeQty += scanner.nextInt();
                    break;
                case 3:
                    System.out.print("Enter Milk Quantity: ");
                    milkQty += scanner.nextInt();
                    break;
                case 4:
                    int totalBill = (teaQty * teaPrice) + (coffeeQty * coffeePrice) + (milkQty * milkPrice);
                    System.out.println("Bill Amount: " + totalBill);
                    break;
                default:
                    System.out.println("Invalid Choice! Please select again.");
            }
        } while (choice != 4);
        
        scanner.close();
    }
}
