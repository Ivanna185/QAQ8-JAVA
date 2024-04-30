package lesson4homework3;


import java.util.Scanner;

public class HomeWork3Task1 {
    public static void main(String[] args) {

        // Ви маєте рядок “Я тестую чудово. Що ще потрібно?”, яку потрібно ввести з клавіатури у консоль.
        // Необхідно за допомогою тільки методу next() класу Scanner (не використовуємо метод nextLine())
        // присвоїти змінним типу String наступні значення:
        // string1 = Я string2 = тестую string3 = чудово string4 = Що ще потрібно?
        // Крім string1, string2, string3, string4 нових змінних створювати не можна.

        Scanner scannerForLesson4 = new Scanner(System.in);
        System.out.println("Insert some text:");
        String string1 = scannerForLesson4.next();
        System.out.println("STRING1 = " + string1);
        String string2 = scannerForLesson4.next();
        System.out.println("STRING2 = " + string2);
        String string3 = scannerForLesson4.next();
        System.out.println("STRING3 = " + string3);
        String string4 = scannerForLesson4.next() + " " + scannerForLesson4.next() + " " + scannerForLesson4.next();
        System.out.println("STRING4 = " + string4);
        scannerForLesson4.close();


    }
}
