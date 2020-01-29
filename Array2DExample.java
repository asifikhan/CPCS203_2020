/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.innerclass;
import java.util.Scanner;
// 2 D example
public class Array2DExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] courses = {"CPCS203", "CPCS204", "CPCS351","CPCS405"};
        String[][] name = {
            {"Ahmad", "Abdullah", "Asim"},
            {"Saif", "Faisal"},
            {"Rayyan", "Marwan", "Ali", "Taha"},
            {"Abdullah","Bilal","AbdulAziz","Omar","Yusuf"}
        };
        int[][] score = new int[courses.length][]; // first step to define structure in terms of row
        // define columns for each row
        for (int i = 0; i < name.length; i++) {
            score[i] = new int[name[i].length];
        }
        inputScore(courses, name, score, in);
        displayScore(courses, name, score);
    }//outside main
    // this method is used to enter scores for all the students 

    public static void inputScore(String[] courses,
            String[][] name, int[][] score, Scanner in) {

        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter Scores for Course " + courses[i]);
            System.out.println("---------------------------------");
            for (int j = 0; j < score[i].length; j++) {
                System.out.println("Student Name :" + name[i][j]);
                score[i][j] = in.nextInt();
            }
        }
    }
    // this method is used to display scores for all the students 
    public static void displayScore(String[] courses,
            String[][] name, int[][] score) {

        for (int i = 0; i < score.length; i++) {
            System.out.println("Scores for Course " + courses[i]);
            System.out.println("---------------------------------");
            for (int j = 0; j < score[i].length; j++) {
                System.out.println("Student Name :" + name[i][j] + " Marks: " + score[i][j]);
            }
        }

    }
}