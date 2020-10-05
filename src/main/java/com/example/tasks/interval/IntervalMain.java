package com.example.tasks.interval;

import java.util.*;

public class IntervalMain {
    private static Interval[] intervals = new Interval[]{
            new Interval(0,14),
            new Interval(15,35),
            new Interval(36,50),
            new Interval(50,100)
    };

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Number: ");
        while (true){
            int input;
            try { input = inputScanner.nextInt(); }
            catch(InputMismatchException e){
                System.out.println("Invalid input, try again");
                continue;
            }
            Optional<Interval> matchingInterval = Arrays
                    .stream(intervals)
                    .filter((i)->i.isWithinRange(input))
                    .findFirst();
            if( !matchingInterval.isPresent() ){
                System.out.println("Input '"+input+"' doesn't match any intervals");
                continue;
            }
            System.out.println("Input '"+input+"' matches "+matchingInterval.get());
        }
    }
}

class Interval{
    private int from;
    private int to;

    public Interval(int from, int to) {
        this.from = from;
        this.to = to;
        if(from >= to) throw new IllegalArgumentException("From can't be equal or greater than to");
    }
    public boolean isWithinRange(int val){
        return from <= val && to >= val;
    }

    @Override
    public String toString() {
        return String.format("interval %d-%d", from, to);
    }
}
