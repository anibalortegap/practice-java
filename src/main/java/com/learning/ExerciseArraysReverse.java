package com.learning;

import java.util.Arrays;

public class ExerciseArraysReverse {
    public static void main(String[] args) {
        String[] products = {
                "Samsung Galaxy S22", "MacBook Air M1", "Iphone 14 ProMax",
                "Chromecast 4th Generation", "Asus Notebook", "Kingston USB 64GB",
                "Apple Watch SE", "Hard Disk SSD External", "Nintendo Switch", "PS5"
        };

        int productsSize = products.length;
        Arrays.sort(products);

        for (int i = 0; i < productsSize; i++){
            System.out.println(String.format("Product %s = %s", i, products[i]));
        }

        System.out.println("=============Using for reverse===================");
        for (int i = 0; i < productsSize; i++){
            System.out.println("Product inverse: " + (productsSize - 1 - i) + " = " + products[productsSize - 1 - i]);
        }

        System.out.println("=============Using for reverse 2===================");

        for (int i = productsSize - 1; i >= 0; i--){
            System.out.println("Product inverse 2: " + i + " = " + products[i]);
        }
    }
}
