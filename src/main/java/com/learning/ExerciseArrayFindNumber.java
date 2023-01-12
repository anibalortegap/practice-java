package com.learning;

import java.util.Scanner;

public class ExerciseArrayFindNumber {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\r\nEnter number to find");
        int number = sc.nextInt();
        for (Integer num : numbers){
            if (num.equals(number)){
                System.out.println("Number is: " + num);
            } else {
                System.out.println("Number not found");
            }
        }

        int indexNumber = 0;
        while (indexNumber < numbers.length && number != numbers[indexNumber]) {
            indexNumber++;
        }

        if (indexNumber == numbers.length){
            System.out.println("Number not found");
        } else if (number == numbers[indexNumber]){
            System.out.println("Number in index: " + indexNumber);
        }
    }
}
