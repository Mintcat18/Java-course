package hometasks;

public class Home_tasks_1 {

    public static void main(String[] args) {
        // Задача 2. Вывести все простые числа от 1 до 1000 (целое положительное и без остатка делится на себя и на 1)
        primeNumbers();
    }

    // Метод для вывода всех простых чисел от 1 до 1000
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
}
