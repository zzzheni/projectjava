package lab2;

public class Ex2 {
    private double radius;
    private static int numberOfObjects = 0;

    public Ex2() {
        this(1.0);
    }

    public Ex2(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws IllegalArgumentException {
        if (newRadius >= 0) {
            radius = newRadius;
        } else {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double findArea() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Ex2 circle1 = new Ex2();
        Ex2 circle2 = new Ex2(5.0);

        System.out.println("Радиус круга 1: " + circle1.getRadius());
        System.out.println("Площадь круга 1: " + circle1.findArea());
        System.out.println("Радиус круга 2: " + circle2.getRadius());
        System.out.println("Площадь круга 2: " + circle2.findArea());
        System.out.println("Количество объектов: " + Ex2.getNumberOfObjects());
    }
}

