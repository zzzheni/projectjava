import java.util.Arrays;
import java.util.Scanner;

public class BEEC1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] sides = new double[3];
        
    
        for (int i = 0; i < 3; i++) {
            sides[i] = scanner.nextDouble();
        }
        
    
        Arrays.sort(sides);
        double A = sides[2];
        double B = sides[1];
        double C = sides[0]; 
        
       
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((A == B && B != C) || (A != B && B == C)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        
        scanner.close();
    }
}

