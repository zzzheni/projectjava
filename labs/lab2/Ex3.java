package lab2;

public class Ex3 {
    public static void main(String[] args) {
        try {
            Ex2 c1 = new Ex2(5);
            Ex2 c2 = new Ex2(-5);
            Ex2 c3 = new Ex2(0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        System.out.println("Количество созданных объектов: " + Ex2.getNumberOfObjects());
    }
}

