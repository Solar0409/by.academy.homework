package Homework2;

import java.util.Scanner;

public class Task3 {
            static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("введите первое слово: ");
            String word1 = scanner.nextLine();
            System.out.println("Введите второе слово: ");
            String word2 = scanner.nextLine();
            String mergeWord = mergeWords(word1,word2);
            System.out.println("Результат: " + mergeWord);



        }

        public   static  String getWordFromInput() {
            String word;
            do {
                System.out.println("Вы ввели слово с нечетным количеством букв! " +
                        "Пожалуйста, введите слово с четным количеством букв. ");
                word = scanner.nextLine();

            } while (word.length() % 2 != 0);
            return word;
        }
        public static String mergeWords(String word1, String word2) {
            int length1 = word1.length();
            int length2 = word2.length();
            int middle1 = length1 / 2;
            int middle2 = length2 / 2;

            String firstHalf = word1.substring(0, middle1);
            String secondHalf = word2.substring(middle2);
            return firstHalf + secondHalf;
        }



    }



