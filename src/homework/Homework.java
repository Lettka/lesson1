package homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3
        System.out.print("task_3\nEnter a: ");
        float a = scanner.nextFloat();
        System.out.print("Enter b: ");
        float b = scanner.nextFloat();
        System.out.print("Enter c: ");
        float c = scanner.nextFloat();
        System.out.print("Enter d: ");
        float d = scanner.nextFloat();
        System.out.println("result = " + calculate(a, b, c, d));

        //4
        System.out.print("task_4\nEnter number1: ");
        int x = scanner.nextInt();
        System.out.print("Enter number2: ");
        int y = scanner.nextInt();
        System.out.println("10 <= x + y <= 20 : " + checkSum(x, y));

        //5
        System.out.print("task_5\nEnter number: ");
        System.out.println(checkNumber(scanner.nextInt()));

        //6
        System.out.print("task_6\nEnter number: ");
        System.out.println(isPositive(scanner.nextInt()));

        //7
        System.out.print("Enter name: ");
        printGreeting(scanner.nextLine());

        //8
        System.out.print("Enter year: ");
        isLeapYear(scanner.nextInt());

        scanner.close();
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – аргументы этого метода, имеющие тип float.

    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.

    public static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    //5. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static String checkNumber(int number) {
        return number >= 0 ? "Positive" : "Negative";
    }

    //6. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isPositive(int number) {
        return number < 0;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void printGreeting(String name) {
        System.out.println("Привет, " + name + "!");
    }

    //8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " isn't a leap year!");
        }
    }
}
