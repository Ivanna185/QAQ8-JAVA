package lesson2homework2;

public class HomeWork2Task1 {
    public static void main(String[] args) {

        System.out.println("================================================");
        // Створити змінну string1 = "This line that i want to cut, cause it is too long".
        //Створити рядок string2 у якому має бути розміщено значення рядка string1,
        //Обрізане до "This line that i want to cut, cause".
        //Створити рядок string3 на основі string2 який міститиме значення
        //"This line that don't want to cut, cause it is perfect".
        //Вивести на консоль кожне повідомлення та його довжину.

        String string1 = "This line that i want to cut, cause it is too long";
                     //    "This line that don't want to cut, cause it is perfect"

        System.out.println( string1);
        String string2 = string1.substring(0,35);
        System.out.println( string2);
        String string3 = string2.replace(" i "," don't ");
        System.out.println(string3);
        string3 = string3 + " it is perfect ";
        System.out.println("srting3 = " + string3);
        System.out.println("srting1 = " + string1.length());;
        System.out.println("srting2 = " + string2.length());;
        System.out.println("srting3 = " + string3.length());;



    }


}



