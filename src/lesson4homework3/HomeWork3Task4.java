package lesson4homework3;

import java.util.Scanner;

public class HomeWork3Task4 {
    public static void main(String[] args) {

//  (Використовувати оператори if-else-if)
//  Користувач вводить з клавіатури числа: Якщо число дорівнює 1, виведення на консоль “Понеділок”;
//  Якщо число дорівнює 2, виведення на консоль “Вівторок”;
//  Якщо число дорівнює 3, виведення на консоль “Середовище”;
//  Якщо число дорівнює 4, виведення на консоль “Четвер”;
//  Якщо число дорівнює 5, виведення на консоль “П'ятниця”;
//  Якщо число дорівнює 6, виведення на консоль “Субота”;
//  Якщо число дорівнює 7, то виведення на консоль "Неділя";
//  В іншому випадку виводимо текст: "Краще б сьогодні була п'ятниця".

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert some number");
        String scannerFromLine = scanner.nextLine();

        if (scannerFromLine.equals("1")) {
            System.out.println("Понеділок");

        } else if (scannerFromLine.equals("2")) {
            System.out.println("Вівторок");

        } else if (scannerFromLine.equals("3")) {
            System.out.println("Середa");

        } else if (scannerFromLine.equals("4")) {
            System.out.println("Четвер");

        } else if (scannerFromLine.equals("5")) {
            System.out.println("П'ятниц");

        } else if (scannerFromLine.equals("6")) {
            System.out.println("Субота");

        } else if (scannerFromLine.equals("7")) {
            System.out.println("Неділя");

        } else {
            System.out.println("Краще б сьогодні була п'ятниця");
        }
        scanner.close();


    }

}