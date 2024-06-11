package lab1;

import java.util.stream.IntStream;

public class Ex7 {
    public static void main(String[] args) {
        int personAge = 15;
        IntStream.rangeClosed(1, personAge)
                .filter(n -> (personAge % 2 == 0) ? n % 2 == 0 : n % 2 != 0)
                .forEach(n -> System.out.print(n + " "));
    }
}

