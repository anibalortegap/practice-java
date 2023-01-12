package com.learning;

public class ExerciseArrayJoin {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] numbersMultiplesFive = new int[10];
        int[] numbersJoin = new int[20];
        int[] numberJoinEveryTwoItem = new int[20];

        int[] numbersOneToTen = new int[10];
        int[] numbersTwenty = new int[10];
        int[] numbersTwoJoin = new int[numbersOneToTen.length + numbersTwenty.length];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }

        for (int i = 0; i < numbersMultiplesFive.length; i++){
            numbersMultiplesFive[i] = (i + 1) * 5;
        }

        int auxIndex = 0;
        for (int i = 0; i < numbersJoin.length / 2; i++){
            numbersJoin[auxIndex++] = numbers[i];
            numbersJoin[auxIndex++] = numbersMultiplesFive[i];
        }
        System.out.println("=============For array [Number 1 to 10 and Multiples 5]===================");
        for (int i = 0; i < numbersJoin.length; i++){
            System.out.println(String.format("NumbersJoin[%s] = %s", i, numbersJoin[i]));
        }

        for (int i = 0; i < numbersOneToTen.length; i++){
            numbersOneToTen[i] = i + 1;
        }

        for (int i = 0; i < numbersTwenty.length; i++){
            numbersTwenty[i] = i + 10 + 1;
        }

        int auxIndex2 = 0;
        for (int i = 0; i < numbersOneToTen.length; i++){
            numbersTwoJoin[auxIndex2++] = numbersOneToTen[i];
        }
        for (int i = 0; i < numbersTwenty.length; i++){
            numbersTwoJoin[auxIndex2++] = numbersTwenty[i];
        }
        System.out.println("=============For array [Number 1 to 20]===================");
        for (int i = 0; i < numbersTwoJoin.length; i++){
            System.out.println(String.format("NumbersJoin2[%s] = %s", i, numbersTwoJoin[i]));
        }

        System.out.println("=============For array [Two item of every array]===================");
        int auxIndex3 = 0;
        for (int i = 0; i < numbersOneToTen.length; i += 2){
            for (int j = 0; j < 2; j++){
                numberJoinEveryTwoItem[auxIndex3++] = numbersOneToTen[i + j];
            }
            for (int j = 0; j < 2; j++){
                numberJoinEveryTwoItem[auxIndex3++] = numbersTwenty[i + j];
            }
        }

        for (int num : numberJoinEveryTwoItem){
            System.out.println("NumberJoinEveryTwoItem: " + num);
        }
    }
}
