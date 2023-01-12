package com.learning;

import java.util.Scanner;

public class ExerciseArrayToDetectOrder {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 7 numbers");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        boolean asc = false;
        boolean desc = false;

        for (int i = 0; i < numbers.length - 1; i++){
            if (numbers[i] > numbers[i + 1]){
                desc = true;
            }

            if (numbers[i] < numbers[i + 1]){
                asc = true;
            }
        }

        if (desc == false && asc == false){
            System.out.println("All the items of array they are equal");
        }

        if (desc == true && asc == true){
            System.out.println("Array Numbers is not ordered");
        }

        if (desc == true && asc == false){
            System.out.println("Array Numbers is ordered descending");
        }

        if (desc == false && asc == true){
            System.out.println("Array Numbers is ordered ascending");
        }
    }
}
