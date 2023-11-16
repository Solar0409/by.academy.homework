package by.academy.homework_2;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите тип данных (int, double, float, char, String): ");
        String dataType = scanner.nextLine();

        System.out.println("Введите переменную: ");
        String input = scanner.nextLine();

        switch (dataType) {
            case "int":
                int intInput = Integer.parseInt(input);
                System.out.println("Остаток от деления на 2: " + intInput % 2);
                break;
            case "double":
                double doubleInput = Double.parseDouble(input);
                System.out.println("70% от числа: " + 0.7 * doubleInput);
                break;
            case "float":
                float floatInput = Float.parseFloat(input);
                System.out.println("Квадрат числа: " + floatInput * floatInput);
                break;
            case "char":
                char symbol = input.charAt(0);
                System.out.println("Код символа: " + (int) symbol);
                break;
            case "String":
                System.out.println("Hello " + input);
                break;
            default:
                System.out.println("Unsupported type");
        }

        scanner.close();
    }
}

