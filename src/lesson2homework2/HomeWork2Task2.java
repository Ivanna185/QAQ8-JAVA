package lesson2homework2;

public class HomeWork2Task2 {
    public static void main(String[] args) {

        System.out.println("=================================================");

        // Створити рядок string = "Testing, is my favourite job".
        //Вивести на екран окремо кожне слово та довжину цього слова у вигляді:
        //Слово1 = (значення слова), Довжина цього слова = (значення довжини слів).
        //Слово2 = (значення слова), Довжина цього слова = (значення довжини слів).
        //і т.д.
        //Вивести на консоль true, якщо перше слово довше інших, в іншому випадку вивести false.

        String forsplit1 = "Testing, is my favourite job";
        forsplit1 = forsplit1.replace(",", "");
        System.out.println(forsplit1);
        String[] wordsPlace = forsplit1.split(" ");
        System.out.println("Слово 1 = " + wordsPlace[0] + " Довжина цього слова = " + wordsPlace[0].length());
        System.out.println("Слово 2 = " + wordsPlace[1] + " Довжина цього слова = " + wordsPlace[1].length());
        System.out.println("Слово 3 = " + wordsPlace[2] + " Довжина цього слова = " + wordsPlace[2].length());
        System.out.println("Слово 4 = " + wordsPlace[3] + " Довжина цього слова = " + wordsPlace[3].length());
        System.out.println("Слово 5 = " + wordsPlace[4] + " Довжина цього слова = " + wordsPlace[4].length());
        System.out.println("============================================================");

        if (wordsPlace[0].length() > wordsPlace[1].length()
                && wordsPlace[0].length() > wordsPlace[2].length()
                && wordsPlace[0].length() > wordsPlace[3].length()
                && wordsPlace[0].length() > wordsPlace[4].length()
        ) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
