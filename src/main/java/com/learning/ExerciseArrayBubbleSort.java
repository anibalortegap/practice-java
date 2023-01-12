package com.learning;

import com.sun.jdi.Value;

public class ExerciseArrayBubbleSort {

    public static void bubbleSort(Object[] array) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (((Comparable) array[i]).compareTo(array[j]) < 0){
                    Object aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    public static void bubbleSortOptimized(Object[] array) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1 - i; j++){
                if (((Comparable) array[j + 1]).compareTo(array[j]) < 0){
                    Object aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] products = {
                "Samsung Galaxy S22", "MacBook Air M1", "Iphone 14 ProMax",
                "Chromecast 4th Generation", "Asus Notebook", "Kingston USB 64GB",
                "Apple Watch SE", "Hard Disk SSD External", "Nintendo Switch", "PS5"
        };

        String[] players = new String[7];
        players[0] = "CR7";
        players[1] = "Messi";
        players[2] = "Neymar";
        players[3] = "Harry Kane";
        players[4] = "James";
        players[5] = "Falcao";
        players[6] = "Mbappe";

        Integer[] numbers = new Integer[10];
        numbers[0] = 10;
        numbers[1] = -4;
        numbers[2] = 4;
        numbers[3] = 8;
        numbers[4] = -3;
        numbers[5] = 25;
        numbers[6] = 35;
        numbers[7] = 17;
        numbers[8] = 9;
        numbers[9] = -6;

        int productsSize = products.length;
        int playersSize = players.length;
        int numbersSize = numbers.length;
        int counter = 0;
        System.out.println("=============For array [Products]===================");
        for (int i = 0; i < productsSize; i++){
            System.out.println(String.format("Product[%s] = %s", i, products[i]));
        }
        System.out.println("=============For array [Players]===================");
        for (int i = 0; i < playersSize; i++){
            System.out.println(String.format("Player[%s] = %s", i, players[i]));
        }
        System.out.println("=============For array [Players]===================");
        for (int i = 0; i < numbersSize; i++){
            System.out.println(String.format("Numbers[%s] = %s", i, numbers[i]));
        }
        int compareString = "Samsung Galaxy S22".compareTo("TV Sony 65");
        int compareInt = Integer.valueOf(-4).compareTo(Integer.valueOf(10));
        System.out.println("Compare String: " + compareString);
        System.out.println("Compare Int: " + compareInt);

        bubbleSortOptimized(products);
        bubbleSort(players);
        bubbleSort(numbers);
        System.out.println("Counter: " + counter);

        System.out.println("=============For array sort [Products]===================");
        for (int i = 0; i < productsSize; i++){
            System.out.println("Products index " + i + " = " + products[i]);
        }

        System.out.println("=============For array sort [Players]===================");
        for (int i = 0; i < playersSize; i++){
            System.out.println("Player index " + i + " = " + players[i]);
        }

        System.out.println("=============For array sort [Numbers]===================");
        for (int number : numbers){
            System.out.println("Numbers: " + number);
        }
    }
}
