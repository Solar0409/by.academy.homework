package by.academy.homework_1;

import by.academy.homework_1.Customer;
import by.academy.homework_1.Shop;

public class Main {
    public static void main(String[] args){
        Customer customer = Customer.initializeCustomer();
        double finalPrice = Shop.calculateFinalPrice(customer);
        System.out.println("Финальная цена покупки: "+ finalPrice);
    }
}
