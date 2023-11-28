package by.academy.Homework2;

import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова, разделенные пробелами: ");

        String  input = scanner.nextLine();

        String[] words = input.split("[\\p{Punct}\\s]+");
        String minUniqueCharWord = "";
        int minUniqueChars = Integer.MAX_VALUE;
        for (String word : words) {
            char[] wordChars = word.toCharArray();

            if (minUniqueChars > wordChars.length) {
                minUniqueChars = wordChars.length;
                minUniqueCharWord = word;


            }


        }
        System.out.println(minUniqueCharWord);





    }
}

