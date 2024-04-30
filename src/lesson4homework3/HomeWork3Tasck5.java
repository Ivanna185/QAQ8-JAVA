package lesson4homework3;

import javax.xml.transform.Result;
import java.util.Scanner;

public class HomeWork3Tasck5 {

    public static void main(String[] args) {

        /*Написати програму, використовуючи тернарний оператор,
        де користувач вводить з клавіатури два числа і символ – + або % або / або *.
        На екран виводиться результат дії над двома введеними числами.
        Якщо користувач ввів щось окрім даних символів, необхідно вивести 0. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert some number");
        int number1 = scanner.nextInt();
        System.out.println("Insert some number");
        int number2 = scanner.nextInt();
        System.out.println("Insert some operation");
        String operation = scanner.next();
        System.out.println("operation = " + operation);
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
       /* if (operation.equals("+")) {
            int Result = number1 + number2;
            System.out.println("+++++");
            System.out.println(Result);

       } if (operation.equals("-")) {
            int Result = number1 - number2;
            System.out.println("-----");
            System.out.println(Result);

        } if (operation.equals("*")) {
            int Result = number1 * number2;
            System.out.println("*****");
            System.out.println(Result);

        } if (operation.equals("/")) {
            int Result = number1 / number2;
            System.out.println("//////");
            System.out.println(Result);

        } if (operation.equals("%")) {
            int Result = number1 % number2;
            System.out.println("%%%%");
            System.out.println(Result);
        } else {
            System.out.println("0");
        } */

       /* int result = operation.equals("+") ? number1 + number2 : 0;
        System.out.println(result);

        int result2 = operation.equals("-") ? number1 - number2 : 0;
        System.out.println(result2);

        int result3 = operation.equals("*") ? number1 * number2 : 0;
        System.out.println(result3);

        int result4 = operation.equals("/") ? number1 / number2 : 0;
        System.out.println(result4);

        int result5 = operation.equals("%") ? number1 % number2 : 0;
        System.out.println(result5);*/

        int result6 = operation.equals("+") ? number1 + number2 :
                operation.equals("-") ? number1 - number2 :
                        operation.equals("*") ? number1 * number2 :
                                operation.equals("/") ? number1 / number2 :
                                        operation.equals("%") ? number1 % number2 : 0;
        System.out.println( "result" + result6);






    }


}






