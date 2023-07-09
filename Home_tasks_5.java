package hometasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Home_tasks_5 {
    private Map<String, List<String>> phoneBook;

    public Home_tasks_5() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        List<String> numbers = phoneBook.getOrDefault(lastName, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(lastName, numbers);
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        Home_tasks_5 directory = new Home_tasks_5();

        directory.add("Иванов", "123456789");
        directory.add("Петров", "987654321");
        directory.add("Иванов", "555555555");

        List<String> ivanovNumbers = directory.get("Иванов");
        System.out.println("Номера телефона для фамилии Иванов: " + ivanovNumbers);

        List<String> petrovNumbers = directory.get("Петров");
        System.out.println("Номера телефона для фамилии Петров: " + petrovNumbers);

        List<String> smithNumbers = directory.get("Смит");
        System.out.println("Номера телефона для фамилии Смит: " + smithNumbers);
    }
}
