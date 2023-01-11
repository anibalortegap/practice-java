package com.learning;

import java.util.Arrays;

public class ExerciseArrays {
    public static void main(String[] args) {
        String[] products = new String[10];
        int arraySize = products.length;

        products[0] = "Samsung Galaxy S22";
        products[1] = "MacBook Air M1";
        products[2] = "Iphone 14 ProMax";
        products[3] = "Chromecast 4th Generation";
        products[4] = "Asus Notebook";
        products[5] = "Kingston USB 64GB";
        products[6] = "Apple Watch SE";
        products[7] = "Hard Disk SSD External";
        products[8] = "Nintendo Switch";
        products[9] = "PS5";

        Arrays.sort(products);

        String product1 = products[0];
        String product2 = products[1];
        String product3 = products[2];
        String product4 = products[3];
        String product5 = products[4];
        String product6 = products[5];
        String product7 = products[6];
        String product8 = products[7];
        String product9 = products[8];
        String product10 = products[9];

        System.out.println("products[0] = " + product1);
        System.out.println("products[1] = " + product2);
        System.out.println("products[2] = " + product3);
        System.out.println("products[3] = " + product4);
        System.out.println("products[4] = " + product5);
        System.out.println("products[5] = " + product6);
        System.out.println("products[6] = " + product7);
        System.out.println("products[7] = " + product8);
        System.out.println("products[8] = " + product9);
        System.out.println("products[9] = " + product10);

        System.out.println("=============Using for===================");

        for(int i = 0; i < arraySize; i++){
            System.out.println(String.format("products[%s] = %s ", i, products[i]));
        }

        System.out.println("=============Using foreach====================");
        for(String product: products){
            System.out.println("Product: " + product);
        }

        System.out.println("=============Using While====================");
        int i = 0;
        while (i < arraySize){
            System.out.println(i + " = " + products[i]);
            i++;
        }

        System.out.println("=============Using Do While====================");
        int j = 0;
        do {
            System.out.println(j + " = " + products[j]);
            j++;
        } while (j < arraySize);

        System.out.println("=============Array Numbers====================");

        int [] numbers = new int[10];

        int numbersSize = numbers.length;
        for (int k = 0; k < numbersSize; k++){
            numbers[k] = (int) (Math.random() * 10);
        }

        for(int num: numbers){
            System.out.println("Number = " + num);
        }
    }
}
