package com.example.tasks.task13_10_2020.second;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MinIncrementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value: ");
        int input = Math.abs( scanner.nextInt() );
        List<Integer> list = getIntegerList(input);
        System.out.println("Min value: "+getMinimum(list));
    }
    public static List<Integer> getIntegerList(int value){
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < value; i++) list.add(i);
        return list;
    }
    public static int getMinimum(List<Integer> list){
        return list.stream().min(Comparator.comparingInt(a -> a)).get();
    }
}
