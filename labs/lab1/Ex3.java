package lab1;

import java.util.*;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        List<Integer> list2 = Arrays.asList(0, 2, 1, 9, 7);
        List<Integer> filteredList = list1.stream()
                .filter(num -> !list2.contains(num))
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }
}

