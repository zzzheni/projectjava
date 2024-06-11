import java.util.*;

public class BEEC1255 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < testCases; i++) {
            String line = scanner.nextLine();
            printMostFrequentLetters(line);
        }
        scanner.close();
    }

    private static void printMostFrequentLetters(String line) {
        int[] freq = new int[26];
        line = line.toLowerCase();
        for (char c : line.toCharArray()) {
            if (Character.isLetter(c)) {
                freq[c - 'a']++;
            }
        }
        int maxFreq = 0;
        for (int count : freq) {
            if (count > maxFreq) {
                maxFreq = count;
            }
        }
        List<Character> mostFrequentLetters = new ArrayList<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq) {
                mostFrequentLetters.add((char) (i + 'a'));
            }
        }
        Collections.sort(mostFrequentLetters);
        for (char letter : mostFrequentLetters) {
            System.out.print(letter);
        }
        System.out.println();
    }
}
