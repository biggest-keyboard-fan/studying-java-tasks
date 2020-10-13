package com.example.tasks.task13_10_2020.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputLinesMain {
    static List<String> userLines = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.trim().equalsIgnoreCase("end")) break;
            userLines.add(input);
        }
        userLines.forEach(System.out::println);
    }
}

