import java.io.IOException;
import java.util.Scanner;

public class BEEC1014 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        double fuel = scanner.nextDouble();
        double averageConsumption = distance / fuel;
        System.out.printf("%.3f km/l%n", averageConsumption);
        scanner.close();
    }
}
