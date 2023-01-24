package com.learning;

import java.util.Scanner;

public class ExerciseArrayInsertMoveSortItemsIncreaseSize {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        int index = 0, number, lastItem;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter number: ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("\nEnter number to insert: ");
        number = sc.nextInt();

        while (index < numbers.length && number > numbers[index]){
            index++;
        }
        System.out.println("\nIndex: " + index);

        lastItem = numbers[numbers.length -1];

        int[] numbersNew = new int[numbers.length + 1];

        System.arraycopy(numbers, 0, numbersNew, 0, numbers.length);

        for (int i = 0; i < numbersNew.length; i++){
            System.out.printf("Index %s ==> %s\n", i, numbersNew[i]);
        }

        for (int i = numbersNew.length -1; i > index -1; i--){
            numbersNew[i] = numbersNew[i-1];
        }
        numbersNew[index] = number;
        System.out.println("========== New Array ==========");
        for (int i = 0; i < numbersNew.length; i++){
            System.out.printf("Index %s ==> %s\n", i, numbersNew[i]);
        }

    }
}

