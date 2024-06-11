import java.util.Scanner;

public class BEEC1332 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWords = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        for (int i = 0; i < numberOfWords; i++) {
            String word = scanner.nextLine().trim();
            if (isOne(word)) {
                System.out.println(1);
            } else if (isTwo(word)) {
                System.out.println(2);
            } else if (isThree(word)) {
                System.out.println(3);
            }
        }
        scanner.close();
    }

    private static boolean isOne(String word) {
        String one = "one";
        return match(word, one);
    }

    private static boolean isTwo(String word) {
        String two = "two";
        return match(word, two);
    }

    private static boolean isThree(String word) {
        String three = "three";
        return match(word, three);
    }

    private static boolean match(String word, String correctWord) {
        if (word.length() != correctWord.length()) {
            return false;
        }
        int mismatches = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != correctWord.charAt(i)) {
                mismatches++;
                if (mismatches > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
