package lab1;

import java.util.*;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3, 2, 2, 3, 3, 1);
        Map<Integer, Long> countMap = numList.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        List<Integer> evenFreqNums = numList.stream()
                .filter(n -> countMap.get(n) % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenFreqNums);
    }
}

