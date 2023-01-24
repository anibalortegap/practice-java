package com.learning;

import java.util.Scanner;

public class ExerciseArrayInsertMoveItems {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int number, index;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter number: ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("\nEnter number to insert: ");
        number = sc.nextInt();
        System.out.print("\nEnter index of number: ");
        index = sc.nextInt();


        for (int i = numbers.length -2; i >= index; i--){
            numbers[i+1] = numbers[i];
        }

        numbers[index] = number;

        for (int i = 0; i < numbers.length; i++){
            System.out.println(String.format("Numbers[%s]: %s", i, numbers[i]));
        }
    }
}
