package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User(1, "Alice", "Smith", 25, "USA"),
                new User(2, "Bob", "Johnson", 30, "Canada"),
                new User(3, "Charlie", "Brown", 10, "USA"),
                new User(4, "David", "Wilson", 15, "UK"),
                new User(5, "Eve", "Davis", 3, "Canada")
        );

        System.out.println("Сортировка по фамилии:");
        UserUtils.sortByLastName(users).forEach(System.out::println);

        System.out.println("\nСортировка по возрасту:");
        UserUtils.sortByAge(users).forEach(System.out::println);

        System.out.println("\nВсе пользователи старше 7 лет: " +
                UserUtils.allUsersAgeGreaterThan7(users));

        System.out.println("\nСредний возраст: " +
                UserUtils.averageAge(users).orElse(0));

        System.out.println("\nКоличество разных стран: " +
                UserUtils.countDistinctCountries(users));
    }
}