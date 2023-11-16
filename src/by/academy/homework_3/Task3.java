package by.academy.homework_3;

import java.util.Scanner;

public class Task3 {

        public static void main(String[] args) {
            for (; ; ) {
                Scanner in = new Scanner(System.in);
                System.out.println("введите число от 1 до 10");
                int nr = in.nextInt();
                if (nr > 10 || nr < 1) {
                    do {
                        System.out.println("Неверное значение, введите число от 1 до 10 ");
                        nr = in.nextInt();
                    } while (nr > 10 || nr < 1);
                }
                int i = 1;
                while (i <= 10) {
                    System.out.print(nr * i + " ");
                    i++;
                }
                System.out.println();
            }

            }


        }