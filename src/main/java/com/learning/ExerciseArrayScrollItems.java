package com.learning;

import java.util.Scanner;

public class ExerciseArrayScrollItems {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println();
        int lastItem = numbers[numbers.length - 1];
        for (int i = numbers.length - 1; i > 0; i--){
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = lastItem;

        for (int num : numbers){
            System.out.print(num + " ");
        }

    }
}
