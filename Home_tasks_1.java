package hometasks;
import java.util.Scanner;

public class Home_tasks_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean f = true;

        while (f) {
            System.out.println("Укажите номер задачи:");
            System.out.println("1 - Задача 1. Вычисление треугольного числа и факториала");
            System.out.println("2 - Задача 2. Вывод простых чисел");
            System.out.println("3 - Задача 3. Простй калькулятор");
            System.out.println("0 - Завершение работы приложения");
            System.out.println("================================");
            int no = Integer.parseInt(scanner.nextLine());

            switch (no) {
                case 1:
                    task_1();
                    break;
                case 2:
                    task_2();
                    break;
                case 3:
                    task_3();
                    break;
                case 0:
                    System.out.println("Завершение работы приложения.");
                    f = false;
                    break;
                default:
                    System.out.println("Вы указали некорректный номер задачи.\nПовторите попытку ввода.");
                    break;
            }
        }
        scanner.close();
    }

    // Задача 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static void task_1() {
        int n = 5;
        int triangleNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangleNumber += i;
        }
        System.out.println("Треугольное число для n = " + n + ": " + triangleNumber);

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал для n = " + n + ": " + factorial);
    }

    // Задача 2. Вывести все простые числа от 1 до 1000 (целое положительное и без остатка делится на себя и на 1)
    public static void task_2() {
        primeNumbers();
    }

    public static void primeNumbers() {
        for (int number = 2; number <= 1000; number++) {
            boolean isPrime = true;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
            }
        }
    }

    // Задача 3. Реализовать простой калькулятор
    public static void task_3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Выберите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Неправильная операция!");
                scanner.close();
                return;
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }
}
