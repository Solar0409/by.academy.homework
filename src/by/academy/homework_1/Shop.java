package by.academy.homework_1;

public class Shop {
   public static double calculateFinalPrice(Customer customer) {
        if (customer.purchaseAmount < 100) {
            return customer.purchaseAmount - customer.purchaseAmount * 5 / 100;
        } else if (customer.purchaseAmount >= 100 && customer.purchaseAmount < 200) {
            return customer.purchaseAmount - customer.purchaseAmount * 7 / 100;
        } else if (customer.purchaseAmount >= 200 && customer.purchaseAmount < 300) {
            if(customer.age>=18){
                return customer.purchaseAmount - customer.purchaseAmount * (12+4) / 100;
            }else {
                return customer.purchaseAmount - customer.purchaseAmount * (12-3) / 100;
            }
        }else if (customer.purchaseAmount >= 300 && customer.purchaseAmount < 400) {
            return customer.purchaseAmount - customer.purchaseAmount * 15 / 100;
        } else {
            return customer.purchaseAmount - customer.purchaseAmount * 20 / 100;
        }
    }
}
