package com.learning;

import java.util.Scanner;

public class ExerciseArrayInsertItemIncreaseSize {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] numbersNew = new int[numbers.length + 1];
        int number = 0, index;
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < numbers.length; i++){
            System.out.print("Enter number: ");
            numbers[i] = sc.nextInt();
        }

        System.arraycopy(numbers, 0, numbersNew, 0, numbers.length);

        for (int i = 0; i < numbersNew.length; i++){
            System.out.printf("Index %s => %s \n", i, numbersNew[i]);
        }

        System.out.println("\nEnter number to insert: ");
        number = sc.nextInt();
        System.out.println("Enter index of number: ");
        index = sc.nextInt();
        int lastItem = numbers[numbers.length -1];
        for (int i = numbersNew.length -2; i >= index; i--){
            numbersNew[i+1] = numbersNew[i];
        }
        numbersNew[index] = number;
        numbersNew[numbersNew.length -1] = lastItem;

        for (int i = 0; i < numbersNew.length; i++){
            System.out.printf("Index %s => %s \n", i, numbersNew[i]);
        }
    }
}
