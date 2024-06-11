import java.util.Scanner;

public class BEEC1043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();
        if (isTriangle(A, B, C)) {
            float perimeter = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimeter);
        } else {
            float area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f%n", area);
        }
        scanner.close();
    }
    
    private static boolean isTriangle(float A, float B, float C) {
        return (A + B > C) && (A + C > B) && (B + C > A);
    }
}
