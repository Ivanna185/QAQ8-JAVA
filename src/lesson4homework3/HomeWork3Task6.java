package lesson4homework3;

import java.util.Scanner;

public class HomeWork3Task6 {
    public static void main(String[] args) {
        /* Використовуючи оператор switch написати програму, яка виводить на консоль посилання для завантаження програми.
         З вибору програм взяти: IntelliJ IDEA, Git, Java.
         З вибору ОС взяти: Linux, MacOS, windows.
         Програма повинна запитати користувача, яка програма йому цікава, також запитати яку ОС він використовує,
         а після вивести в консоль необхідне посилання.
         Якщо програма з такою назвою не виводить повідомлення в консоль, про те, що такої програми не існує.
         Якщо зазначеної користувачем ОС немає, виводиться повідомлення в консоль, що такої ОС немає.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your program?");
        String program = scanner.nextLine();
        String os;
        switch (program.toLowerCase()) {
            case ("intelleji idea"):
                System.out.println("Type your OS 1");
                os = scanner.nextLine();
                switch (os.toLowerCase()) {
                    case ("linux"):
                        System.out.println("https://www.jetbrains.com/idea/download/?section=linux");
                        break;
                    case ("macos"):
                        System.out.println("https://www.jetbrains.com/idea/download/?section=mac");
                        break;
                    case ("windows"):
                        System.out.println("https://www.jetbrains.com/idea/download/?section=windows");
                        break;
                    default:
                        System.out.println("There is no OS with this name");
                        break;
                }
                break;
            case ("git"):
                System.out.println("Type your OS 2");
                os = scanner.nextLine();
                switch (os.toLowerCase()) {
                    case ("linux"):
                        System.out.println("not found");
                        break;
                    case ("macos"):
                        System.out.println("https://desktop.github.com");
                        break;
                    case ("windows"):
                        System.out.println("https://desktop.github.com");
                        break;
                    default:
                        System.out.println("There is no OS with this name");
                        break;
                }
                break;
            case ("java"):
                System.out.println("Type your OS 3");
                os = scanner.nextLine();
                switch (os.toLowerCase()) {
                    case ("linux"):
                        System.out.println("https://www.oracle.com/cis/java/technologies/downloads/");
                        break;
                    case ("macos"):
                        System.out.println("https://www.oracle.com/cis/java/technologies/downloads/");
                        break;
                    case ("windows"):
                        System.out.println("https://www.oracle.com/cis/java/technologies/downloads/");
                        break;
                    default:
                        System.out.println("There is no OS with this name");
                        break;
                }
                break;
            default:
                System.out.println("There is no program with this name");
                break;

        }

    }

}