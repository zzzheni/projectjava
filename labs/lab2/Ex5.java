package lab2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Использование: java Ex5 string filename");
            System.exit(1);
        }
        
        String stringToRemove = args[0];
        File file = new File(args[1]);
        
        if (!file.exists()) {
            System.out.println("Файл " + args[1] + " не существует");
            System.exit(2);
        }
        
        StringBuilder content = new StringBuilder();
        
        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                content.append(line.replaceAll(stringToRemove, "")).append(System.lineSeparator());
            }
        }
        
        try (PrintWriter output = new PrintWriter(file)) {
            output.print(content.toString());
        }
    }
}

