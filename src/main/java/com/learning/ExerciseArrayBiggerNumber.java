package com.learning;

import java.util.Scanner;

public class ExerciseArrayBiggerNumber {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] numbersTwo = new int[5];
        numbersTwo[0] = 10;
        numbersTwo[1] = 7;
        numbersTwo[2] = 12;
        numbersTwo[3] = -8;
        numbersTwo[4] = 43;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integer numbers");

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            max = (max > numbers[i]) ? max : numbers[i];
        }

        int indexMax = 0;
        for (int i = 1; i < numbersTwo.length; i++){
            indexMax = (numbersTwo[indexMax] > numbersTwo[i]) ? indexMax : i;
        }
        System.out.println("Max = " + max);
        System.out.println("Max Two = " + numbersTwo[indexMax]);
    }
}
