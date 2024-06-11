package lab1;

import java.util.List;

public class Ex8 {
    public static void main(String[] args) {
        List<String> rightAnswers = List.of("A", "C", "B", "D", "A", "B", "C", "D", "A", "C", "B", "D", "A", "B", "C", "D", "A", "C", "B", "D");
        List<String> studentAnswers = List.of("A", "D", "B", "C", "A", "B", "D", "C", "A", "C", "B", "D", "A", "B", "C", "D", "A", "B", "C", "D");
        long correctCount = 0;
        long wrongCount = 0;
        
        for (int i = 0; i < rightAnswers.size(); i++) {
            if (rightAnswers.get(i).equals(studentAnswers.get(i))) {
                correctCount++;
            } else {
                wrongCount++;
            }
        }
        
        System.out.println("Количество правильных ответов: " + correctCount);
        System.out.println("Количество неправильных ответов: " + wrongCount);
    }
}

