package com.learning;

public class ExerciseArrayOrderBeginEnd {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] numberBeginEnd = new int[10];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }
        System.out.println("=============For array [Number Couple]===================");
        for (int i = 0; i < numbers.length / 2; i++){
            System.out.printf("Array Couple: %s - %s \n", numbers[i], numbers[numbers.length - 1 - i]);
        }

        int auxIndex = 0;
        for (int i = 0; i < numbers.length - i; i++){
            numberBeginEnd[auxIndex++] = numbers[i];
            numberBeginEnd[auxIndex++] = numbers[numbers.length - 1 - i];
        }
        System.out.println("=============For array [NumberBeginEnd]===================");
        for (int i = 0; i < numberBeginEnd.length; i++){
            System.out.printf("NumberBeginEnd[%s] = %s \n", i, numberBeginEnd[i]);
        }
    }
}
