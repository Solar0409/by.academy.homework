package by.academy.Homework2;

import java.util.Scanner;

public class StringChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввести первую строку: ");
        String str1 = scanner.nextLine();

        System.out.println("Ввести вторую строку: ");
        String str2 = scanner.nextLine();

        System.out.println(isPermutation(str1, str2));

    }

    static boolean isPermutation(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int[] letters = new int[128];
        for (char c : word1.toCharArray()) {
            letters[c]++;

        }
        for (char c : word2.toCharArray()) {
            letters[c]--;
            if (letters[c] < 0) {
                return false;

            }
        }
            return true;


        }


    }