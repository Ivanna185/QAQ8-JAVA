package lesson4homework3;

import java.util.Scanner;

public class HomeWork3Task2 {
    public static void main(String[] args) {

       /* Користувач вводить з клавіатури три цілі значення.
        На екран виводиться інформація, чи можна з цих сторін побудувати трикутник.
        (Необхідно згадати правило побудови трикутника з трьох сторін) */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number a :");
        int a = scanner.nextInt();
        System.out.println(" Enter the second number b:");
        int b = scanner.nextInt();
        System.out.println(" Enter the third number c:");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("you can build a triangle");
        } else {
            System.out.println("a triangle cannot be constructed");
        }

        scanner.close();
    }
}


