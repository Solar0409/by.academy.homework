package by.academy.homework_1;

import java.util.Scanner;

public class Customer {

       static Scanner scanner = new Scanner(System.in);
        double purchaseAmount;
        int age;

        public Customer(double purchaseAmount, int age) {
            this.purchaseAmount = purchaseAmount;
            this.age = age;
        }

        public static Customer  initializeCustomer() {
            System.out.println("Введите сумму покупки");
            double purchaseAmount = scanner.nextDouble();
            System.out.println("Введите возраст покупателя");
            int age = scanner.nextInt();
            scanner.close();
            return new Customer(purchaseAmount, age);
        }
    }


