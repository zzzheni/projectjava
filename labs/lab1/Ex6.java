package lab1;

public class Ex6 {
    public static void main(String[] args) {
        double initialEarthWeight = 60;
        double currentMoonWeight = initialEarthWeight * 0.165;
        final double growthRate = 1.032;

        for (int year = 1; year <= 15; year++) {
            currentMoonWeight *= growthRate;
            System.out.printf("Год %d: %.2f кг%n", year, currentMoonWeight);
        }
    }
}

