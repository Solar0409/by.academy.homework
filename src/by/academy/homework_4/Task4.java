package by.academy.homework_4;

public class Task4 {
    public static void main(String[] args) {

        int f = 2;
        int g = 0;
        while (f <= 1_000_000) {
            f *= 2;
            if (f <= 1_000_000) {
                System.out.print(f + " ");
            }
            g++;
        }
        System.out.println();
        System.out.println(g);
    }
}



