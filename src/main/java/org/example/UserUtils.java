package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class UserUtils {
    public static List<User> sortByLastName(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getLastName))
                .collect(Collectors.toList());
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
    }

    public static boolean allUsersAgeGreaterThan7(List<User> users) {
        return users.stream()
                .allMatch(user -> user.getAge() > 7);
    }

    public static OptionalDouble averageAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .average();
    }

    public static long countDistinctCountries(List<User> users) {
        return users.stream()
                .map(User::getCountry)
                .distinct()
                .count();
    }
}
