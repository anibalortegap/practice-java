package com.learning;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerciseArrayStudentScore {
    private static final DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args) {
        double[] scoreMathematics, scoreHistory, scoreLanguage;
        double sumScoreMathematics = 0, sumScoreHistory = 0, sumScoreLanguage = 0;
        double avgScoreMathematics, avgScoreHistory, avgScoreLanguage;
        scoreMathematics = new double[7];
        scoreHistory = new double[7];
        scoreLanguage = new double[7];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 7 score of students for mathematics");
        for (int i = 0; i < scoreMathematics.length; i++){
            scoreMathematics[i] = sc.nextDouble();
        }

        System.out.println("Enter 7 score of students for history");
        for (int i = 0; i < scoreHistory.length; i++){
            scoreHistory[i] = sc.nextDouble();
        }

        System.out.println("Enter 7 score of students for language");
        for (int i = 0; i < scoreLanguage.length; i++){
            scoreLanguage[i] = sc.nextDouble();
        }

        for (int i = 0; i < 7; i++){
            sumScoreMathematics += scoreMathematics[i];
            sumScoreHistory += scoreHistory[i];
            sumScoreLanguage += scoreLanguage[i];
        }

        avgScoreMathematics = sumScoreMathematics / scoreMathematics.length;
        avgScoreHistory = sumScoreHistory / scoreHistory.length;
        avgScoreLanguage = sumScoreLanguage / scoreLanguage.length;

        System.out.println("Average Course Mathematics: " + df.format(avgScoreMathematics));
        System.out.println("Average Course History: " + df.format(avgScoreHistory));
        System.out.println("Average Course Language: " + String.format("%.3f", avgScoreLanguage));
        System.out.println("Average Total Course: " + df.format((avgScoreHistory + avgScoreMathematics + avgScoreLanguage) / 3));
        System.out.println("Enter the ID of Students (0 to 6): ");
        int id = sc.nextInt();
        double avgStudent = (scoreMathematics[id] + scoreHistory[id] + scoreLanguage[id]) / 3;
        System.out.println("Average Student: " + String.format("%.3f", avgStudent));
    }
}
