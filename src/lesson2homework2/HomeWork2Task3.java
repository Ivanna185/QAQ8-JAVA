package lesson2homework2;

public class HomeWork2Task3 {
    public static void main(String[] args) {

        System.out.println("================================================================");
/*       При застосуванні до масиву рядків поля length можна дізнатися скільки
        елементів знаходиться у масиві.
        Тобто якщо у вас є масив рядків типу: String[] arrayOfString;
        то при виклику поля lenth:
        int size = arrayOfString.length;
        можна отримати скільки символів знаходиться в даному масиві.


        Спробувати, використовуючи метод split та інформацію з приводу поля length, вивести на екран кілька разів
        символ 'a' зустрічається у рядку:
        "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method."


        Розв'язати це завдання з обліків верхнього та нижнього регістру символу 'a'.*/


        String text = " Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";
        System.out.println( text );
        System.out.println("====================================");
        String text1 = text.toLowerCase();
        System.out.println(text1);
        String simvol = "a";
        String[] elements = text1.split(simvol);
        int kolvokuskov = elements.length;
        System.out.println("k-vo elementov = " + kolvokuskov);
        int result  = kolvokuskov - 1;
        System.out.println("ko-vo simvolov " + simvol + " v stroke = " + result);









    }
}

