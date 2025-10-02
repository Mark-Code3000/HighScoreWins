package com.pluralsight;


import java.util.Scanner;

public class HighScoreApp {

    //create scanner to capture user input

    public static Scanner scoreKeep = new Scanner(System.in)

    public static void main(String[] args) {

/* prompt the user with question for home points
        System.out.println("Please record the points");
        System.out.print("How many points did the home team have?");

        //store the input from the user

        String homePoint = scoreKeep.nextLine() ;

        // prompt the user with question for visitor points
        System.out.println("Please record the points");
        System.out.print("How many points did the visitor team have?");

        //store the input from the user

        String vstrPoint = scoreKeep.nextLine() ;

        //display points for both teams

        System.out.println("Home:Visitor|" );

 */

// Prompt user for score
        System.out.println("please record the score");

        //store the user input
        String score = scoreKeep.nextLine() ;

        //display score

        System.out.println(score);
        String[]teamsNscores = score.split("\\|");

        //split the first part of the string that holds the team names

        String[]teamNames = teamsNscores[0].split(":") ;


    }


}
