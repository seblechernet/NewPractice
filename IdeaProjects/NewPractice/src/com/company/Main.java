package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moreScores="";
        do {
            System.out.println("Enter an Exam score");
            String input = sc.nextLine();
            int score = Integer.parseInt(input);

            if (score >= 97 && score<=100) {
                System.out.println("A+");

            }
            if (score < 94 && score >= 96) {
                System.out.println("A-");
            }
            if (score < 90 && score >= 93) {
                System.out.println("C");
            }
            if (score < 70 && score >= 60) {
                System.out.println("D");
            }
            if (score < 60)
                System.out.println("F");
            System.out.println("Do you want to enter another score(Y/N)?");
            moreScores=sc.nextLine();

        } while (moreScores.equalsIgnoreCase("y"));
    }
}
