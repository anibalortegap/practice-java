package com.learning;

import java.util.Arrays;
import java.util.Collections;

public class ExerciseArraysMutability {

    private static void reverseArray(String[] array) {
        int arraySizeReverse = array.length;
        int arraySize = array.length;
        for (int i = 0; i < arraySizeReverse; i++){
            String CurrentItem = array[i];
            String lastItem = array[arraySize - 1 - i];

            array[i] = lastItem;
            array[arraySize - 1 - i] = CurrentItem;
            arraySizeReverse--;

        }
    }

    public static void main(String[] args) {
        String[] products = {
                "Samsung Galaxy S22", "MacBook Air M1", "Iphone 14 ProMax",
                "Chromecast 4th Generation", "Asus Notebook", "Kingston USB 64GB",
                "Apple Watch SE", "Hard Disk SSD External", "Nintendo Switch", "PS5"
        };

        String[] players = {"CR7", "Messi", "Neymar", "Harry Kane", "James", "Falcao", "Mbappe"};

        int productsSize = products.length;
        int playerSize = players.length;

        Arrays.sort(products);
        Arrays.sort(players);


        System.out.println("=============For array [Products]===================");
        for (int i = 0; i < productsSize; i++){
            System.out.println(String.format("Product[%s] = %s ", i, products[i]));
        }

        System.out.println("=============For array [Players]===================");
        for (int i = 0; i < playerSize; i++){
            System.out.println(String.format("Players[%s] = %s", i, players[i]));
        }

        System.out.println("=============Mutability array reverse [Players]===================");
        for (int i = 0; i < playerSize / 2; i++){
            String CurrentItem = players[i];
            String lastItem = players[playerSize - 1 - i];

            players[i] = lastItem;
            players[playerSize - 1 - i] = CurrentItem;

        }

        for (int i = 0; i < playerSize; i++){
            System.out.println(String.format("Players[%s] reverse mutability = %s", i, players[i]));
        }
        System.out.println("=============Mutability array reverse [Products]===================");

        //reverseArray(products);
        Collections.reverse(Arrays.asList(products));

        for (int i = 0; i < productsSize; i++){
            System.out.println(String.format("Products[%s] reverse mutability = %s ", i, products[i]));
        }
    }
}
