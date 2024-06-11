package lab2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.print("Введите целое число: ");
                int number = input.nextInt();
                System.out.println("Введённое число: " + number);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Попробуйте ещё раз. (Некорректный ввод: требуется целое число)");
                input.nextLine(); 
            }
        } while (continueInput);
        input.close();
    }
}

