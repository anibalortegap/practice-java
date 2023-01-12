package com.learning;

import java.util.Scanner;

public class ExerciseArrayFindString {
    public static void main(String[] args) {
        String[] players = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < players.length; i++){
            System.out.print("Enter in player: ");
            players[i] = sc.next();
        }
        System.out.println("\nEnter player to find");
        String player = sc.next();
        int indexPlayer = 0;
        for (; indexPlayer < players.length && !players[indexPlayer].equalsIgnoreCase(player); indexPlayer++){
        }

        if (indexPlayer == players.length){
            System.out.println("Player not found");
        } else if (players[indexPlayer].toLowerCase().compareTo(player.toLowerCase()) == 0){
            System.out.println("Player in index: " + indexPlayer);
        }
    }
}
