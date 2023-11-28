package by.academy.Homework2;

import java.util.Scanner;

    public class WordMerger {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое слово, состоящее из четного числа букв: ");

            String word1 = scanner.nextLine();

            System.out.println("Введите второе слово, состоящее из четного числа букв: ");
            String word2 = scanner.nextLine();

            if (word1.length() % 2 != 0 || word2.length() % 2 != 0) {
                System.out.println("Ошибка! Оба слова должны содержать четное количество букв");
            } else {
                System.out.println("результат: "  + mergeWords(word1,word2));

            }


        }

        static String mergeWords(String word1, String word2) {
            String word1Half = word1.substring(0, word1.length() / 2);
            String word2Half = word2.substring(word2.length() / 2);
            return word1Half + word2Half;

        }

    }

