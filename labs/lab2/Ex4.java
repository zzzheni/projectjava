package lab2;

import java.io.*;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        if (args.length != 4) {
            System.out.println("Использование: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Исходного файла " + args[0] + " не существует");
            System.exit(2);
        }

        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Целевой файл " + args[1] + " уже существует");
            System.exit(3);
        }

        try (Scanner input = new Scanner(sourceFile);
             PrintWriter output = new PrintWriter(targetFile)) {

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String modifiedLine = line.replaceAll(args[2], args[3]);
                output.println(modifiedLine);
            }
        }
    }
}

