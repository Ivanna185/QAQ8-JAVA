package lesson4homework3;

import java.util.Scanner;

public class HomeWork3Task3 {
    public static void main(String[] args) {

        /*За допомогою тернарного оператора необхідно отримати різницю двох чисел, введених з клавіатури,
        і завжди віднімати від більшого менше. Вивести цю різницю в консоль.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter the number:");
        int a = scanner.nextInt();
        System.out.println( " Enter the second number:");
        int b = scanner.nextInt();
        int Result = a > b? a + b : b - a ;
        System.out.println( "= " + Result );








    }





    }
