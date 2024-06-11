import java.io.IOException;
import java.util.Scanner;

public class BEEC1006 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double weightedAverage = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);
        System.out.printf("MEDIA = %.1f%n", weightedAverage);
        scanner.close();
    }
}