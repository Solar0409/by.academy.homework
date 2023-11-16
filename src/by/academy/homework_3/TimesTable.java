package by.academy.homework_3;

import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        for (; ; ) {
    Scanner sc=new Scanner(System.in);
        System.out.println( "Enter a number: ");
    int n= sc.nextInt();
        for (int i=1; i<=n; i++)
    {
        for( int j=1; j<=10; j++)
        {
            System.out.println(i + "* " +j+ "= "+i*j);
        }

    }
        System.out.println("                       ");


}
}
}
