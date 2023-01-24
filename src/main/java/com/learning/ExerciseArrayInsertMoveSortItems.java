package com.learning;

import java.util.Scanner;

public class ExerciseArrayInsertMoveSortItems {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int index = 0, number = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length -1; i++){
            System.out.print("Enter number: ");
            numbers[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter number to insert: ");
        number = sc.nextInt();

        while (index < numbers.length && number > numbers[index]){
            index++;
        }
        System.out.println("Index: " + index);
        for (int i = numbers.length -2; i >= index; i--){
            numbers[i+1] = numbers[i];
        }

        numbers[index] = number;

        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
