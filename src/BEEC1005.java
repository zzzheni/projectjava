import java.io.IOException;
import java.util.Scanner;

public class BEEC1005 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double weightedAverage = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5);

        System.out.printf("MEDIA = %.5f%n", weightedAverage);

        scanner.close();
    }
}