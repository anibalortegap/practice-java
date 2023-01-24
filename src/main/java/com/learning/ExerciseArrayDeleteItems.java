package com.learning;

import java.util.Scanner;

public class ExerciseArrayDeleteItems {
    public static void main(String[] args){
        int[] numbers = new int[10];
        int[] numbersDelete;
        int number;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter number: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nEnter number to delete: ");
        number = sc.nextInt();

        int index = 0;
        while (index < numbers.length && number != numbers[index]){
            index++;
        }

        for (int i = index; i < numbers.length -1;i++){
            numbers[i] = numbers[i+1];
        }

        for (int num:numbers){
            System.out.print(num + " ");
        }

        System.out.println("\nIndex: " + index) ;

        numbersDelete = new int[numbers.length -1];
        System.arraycopy(numbers, 0, numbersDelete, 0, numbersDelete.length);

        for (int i = 0; i < numbersDelete.length; i++){
            System.out.println(String.format("Index %s => %s", i, numbersDelete[i]));
        }
    }
}
