package com.learning;

import java.util.Scanner;

public class ExerciseArrayNumberEvenOdd {
    public static void main(String[] args) {
        int[] numbers, numbersEven, numbersOdd;
        int sizeArrayEven = 0, sizeArrayOdd = 0;
        numbers = new int[10];
        System.out.println("Enter 10 numbers");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                sizeArrayEven++;
            } else {
                sizeArrayOdd++;
            }
        }

        numbersEven = new int[sizeArrayEven];
        numbersOdd = new int[sizeArrayOdd];

        int sizeEven = 0;
        int sizeOdd = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                numbersEven[sizeEven++] = numbers[i];
            } else {
                numbersOdd[sizeOdd++] = numbers[i];
            }
        }

        System.out.println("Even Numbers");
        for (int i = 0; i < numbersEven.length; i++){
            System.out.print(numbersEven[i] + " ");
        }
        System.out.println("\nOdd Numbers");
        for (int i = 0; i < numbersOdd.length; i++){
            System.out.print(numbersOdd[i] + " ");
        }
    }

}
