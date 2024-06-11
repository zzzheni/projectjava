import java.util.Scanner;

public class BEEC1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        int quantity = scanner.nextInt();
        double total = calculateTotal(code, quantity);
        System.out.printf("Total: R$ %.2f%n", total);
        scanner.close();
    }
    private static double calculateTotal(int code, int quantity) {
        double price = 0.0;
        switch (code) {
            case 1:
                price = 4.00;
                break;
            case 2:
                price = 4.50;
                break;
            case 3:
                price = 5.00;
                break;
            case 4:
                price = 2.00;
                break;
            case 5:
                price = 1.50;
                break;
            default:
                throw new IllegalArgumentException("Invalid product code");
        }
        return price * quantity;
    }
}
